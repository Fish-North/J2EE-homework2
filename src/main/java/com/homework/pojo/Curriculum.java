package com.homework.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curriculum {
    private Integer courseID;
    private String courseName;
    private String courseTime;
}
