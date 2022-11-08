/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.KasuProject;


import java.util.ArrayList;
import java.util.HashMap;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author WORKSTATION
 */


@ManagedBean(name="submission")  
@SessionScoped  
public class Submission{
    String instructor;
    String course;
    String student;

    public String getInstructor() {
        return instructor;
    }

    public String getCourse() {
        return course;
    }

    public String getStudent() {
        return student;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStudent(String student) {
        this.student = student;
    } 
}