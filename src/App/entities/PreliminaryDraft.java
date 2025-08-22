/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Entities;

import java.util.Date;

/**
 *
 * @author juans
 */
public class PreliminaryDraft {
    
    private int id;
    private int id_student;
    private int id_profesor;
    private String name;
    private Date date;
    private String status;

    public PreliminaryDraft(int id, int id_student, int id_profesor, String name, Date date, String status) {
        this.id = id;
        this.id_student = id_student;
        this.id_profesor = id_profesor;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public PreliminaryDraft() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
