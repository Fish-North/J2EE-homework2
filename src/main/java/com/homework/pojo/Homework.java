package com.homework.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Homework {
    private Integer homeworkID;
    private String description;
    private Integer courseID;
}
