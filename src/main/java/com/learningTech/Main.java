package com.learningTech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext contxt =  new ClassPathXmlApplicationContext("spring.xml");
        Doctor staff = contxt.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());


        }
    }
