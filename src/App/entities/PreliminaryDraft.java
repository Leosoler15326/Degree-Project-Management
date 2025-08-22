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
    private int idStudent;
    private int idProfessor;
    private String name;
    private Date date;
    private String status;

    public PreliminaryDraft(int id, int idStudent, int idProfessor, 
                       String name, Date date, String status) {
    this.id = id;
    this.idStudent = idStudent;
    this.idProfessor = idProfessor;
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

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
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
    
    @Override
    public String toString() {
        return "PreliminaryDraft{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", status='" + status + '\'' +
               ", date=" + date +
               ", idStudent=" + idStudent +
               ", idProfessor=" + idProfessor +
               '}';
    }
}
