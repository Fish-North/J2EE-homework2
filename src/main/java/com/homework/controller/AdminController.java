package com.homework.controller;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import com.homework.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    /**
     * 添加学生的跳转和功能实现
     */
    @RequestMapping("/toAddStudent")
    public String toAddStuPage() {
        return "addstudent";
    }

    @RequestMapping("/addstudent")
    public String registerStudent(Student student) {
        adminService.registerStudent(student);
        return "redirect:/adminMain";
    }

    /*
     *添加教师的跳转和功能实现
     */
    @RequestMapping("/toAddTeacher")
    public String toAddTeaPage() {
        return "addteacher";
    }

    @RequestMapping("/addteacher")
    public String registerTeacher(Teacher teacher) {
        adminService.registerTeacher(teacher);
        return "redirect:/adminMain";
    }

    /**
     * 删除学生的跳转和功能实现
     */
    @RequestMapping("/todeleteStu")
    public String toDeleteStu() {
        return "deletestu";
    }

    @RequestMapping("/deletestu")
    public String deleteStu(Integer studentID) {
        adminService.deleteStudent(studentID);
        return "redirect:/adminMain";
    }

    /**
     * 删除教师的跳转和功能实现
     */
    @RequestMapping("/todeleteTea")
    public String toDeleteTea() {
        return "deletetea";
    }

    @RequestMapping("/deletetea")
    public String deleteTea(Integer teacherID) {
        adminService.deleteStudent(teacherID);
        return "redirect:/adminMain";
    }

    /**
     * 添加课程的跳转和实现
     */
    @RequestMapping("/toAddCourse")
    public String toAddCourse() {
        return "addCourse";
    }

    @RequestMapping("/addcourse")
    public String addCourse(Curriculum course) {
        adminService.addCourse(course);
        return "redirect:/adminMain";
    }

    /**
     * 添加学生到课程的跳转和实现
     */
    @RequestMapping("/toaddStocourse")
    public String addStuToCourse() {
        return "addStoCourse";
    }

    @RequestMapping("/addStoCourse")
    public String addStudentToCourse(Integer studentID, Integer courseID) {
        adminService.addStudentToCourse(studentID, courseID);
        return "redirect:/adminMain";
    }

    /**
     * 管理员登录
     */
    @RequestMapping("/adminlog")
    public String login(Integer account, String password, HttpRequest httpRequest) {
        return "/adminMain";
    }
}
