package com.homework.controller;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.service.HomeworkService;
import com.homework.service.StudentService;
import com.homework.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.IntegerSyntax;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:50
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setHomeworkService(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    @Autowired
    @Qualifier("homeworkServiceImpl")
    private HomeworkService homeworkService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, @RequestParam("studentID")Integer studentID,@RequestParam("password")String password,Model model){
        if(studentService.login(studentID,password)){
            HttpSession session = request.getSession();
            session.setAttribute("studentID",studentID);
            model.addAttribute("status","login successfully!");
            return "/student/login";
        }
        model.addAttribute("status","login failed!");
        return "/student/loginFailed";
    }

    //todo
    @GetMapping("/submitHomework")
    public String submitHomework(MultipartFile mfile, HttpServletRequest request,Model model,@RequestParam("HomeworkID")Integer homeworkID){
        HttpSession session = request.getSession();
        Integer  studentID = (Integer) session.getAttribute("studentID");
        String fileUrl = FileUtil.upload(mfile,request);
        if(fileUrl!=null){
            model.addAttribute("status","submit successfully!");
            Homework homework = homeworkService.queryHomeworkByID(homeworkID);
            studentService.submitHomework(homework,studentID,fileUrl);
        }
        return "/student/submitHomework";
    }

    @GetMapping("/withdrawHomework")
    public String withdrawHomework(@RequestParam("homeworkID")Integer homeworkID,HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Integer  studentID = (Integer) session.getAttribute("studentID");
        List list = studentService.queryHomeworkByID(studentID,homeworkID);
        String fileUrl = (String)list.get(list.size()-1);
        FileUtil.deleteFile(request,fileUrl);
        studentService.withdrawHomework(homeworkID,studentID);
        model.addAttribute("status","withdraw successfully!");
        return "/student/withdrawHomework";
    }

    @GetMapping("/myHomework")
    public String myHomework(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Integer  studentID = (Integer) session.getAttribute("studentID");
        List<Homework> homeworkList = studentService.myHomework(studentID);
        model.addAttribute("homeworkList",homeworkList);
        model.addAttribute("status","query successfully!");
        return "/student/myHomework";
    }

    @GetMapping("/myCourse")
    public String myCourse(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Integer  studentID = (Integer) session.getAttribute("studentID");
        List<Curriculum> curriculumList = studentService.myCourse(studentID);
        model.addAttribute("curriculumList",curriculumList);
        model.addAttribute("status","query successfully!");
        return "/student/myCourse";
    }

    @GetMapping("/modifyPassword")
    public String modifyPassword(@RequestParam("newPassword")String newPassword,HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Integer  studentID = (Integer) session.getAttribute("studentID");
        studentService.modifyPassword(newPassword,studentID);
        model.addAttribute("status","modify successfully!");
        return "/student/modifyPassword";
    }

}
