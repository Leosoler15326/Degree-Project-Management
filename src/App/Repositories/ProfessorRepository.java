package App.Repositories;

import App.DataBase.DataBase;
import App.entities.Student;
import App.interfaces.IRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository implements IRepository<Student> {
    
    private DataBase _DataBase;

    public ProfessorRepository(DataBase db) {
        this._DataBase = db;
    }
    public ProfessorRepository() {
    }

    @Override
    public List<Student> List() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Add(Student prmItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(Student prmItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student Retrieve(String prmId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
