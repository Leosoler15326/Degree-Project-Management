package App.repositories;

import App.DataBase.DataBase;
import App.entities.Student;
import App.interfaces.IRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IRepository<Student> {
    private DataBase _DataBase;
    public StudentRepository(DataBase db) {
        this._DataBase = db;
    }


    @Override
public List<Student> List() {
    List<Student> students = new ArrayList<>();
    String sql = "SELECT id, name, last_name, email, password, phone, program FROM Estudiante";

    try (Connection conn = _DataBase.Connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Student s = new Student(
                rs.getString("program"),  
                rs.getInt("id"),
                rs.getString("phone"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getString("password")
            );
            students.add(s);
        }

    } catch (SQLException e) {
        System.out.println("Error al listar estudiantes: " + e.getMessage());
    }

    return students;
}


        @Override
    public boolean Add(Student prmItem) {
        String sql = "INSERT INTO Estudiante(id, name, last_name, email, password, phone, program) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = _DataBase.Connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, prmItem.getId());
            pstmt.setString(2, prmItem.getName());
            pstmt.setString(3, prmItem.getLastName()); 
            pstmt.setString(4, prmItem.getEmail());
            pstmt.setString(5, prmItem.getPassword());
            pstmt.setString(6, prmItem.getPhone());  
            pstmt.setString(7, prmItem.getPrograma());
            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al agregar estudiante: " + e.getMessage());
            return false;
        }
    }


    @Override
    public boolean Delete(Student prmItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student Retrieve(String prmEmail) {
        String sql = "SELECT id, name, last_name, email, password, phone, program FROM Estudiante WHERE email = ?";
        Student s = null;

        try (Connection conn = _DataBase.Connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, prmEmail);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                s = new Student(
                    rs.getString("program"),    
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("last_name"),  
                    rs.getString("email"),
                    rs.getString("password")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al recuperar estudiante: " + e.getMessage());
        }

        return s;
    }

    
}
