package App.Main;


import App.DataBase.DataBase;
import App.entities.Student;
import App.repositories.StudentRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
/**t;
/**
 *
 * @author Alexp
 */
public class Main {
    public static void main(String[] args) {
        // Crear la instancia de la BD
        DataBase db = new DataBase();

        // Inyectar en el repositorio
        StudentRepository studentRepo = new StudentRepository(db);
        
        
        Student retrieveStudent = studentRepo.Retrieve("juan.perez@correo.com");
        
        System.out.println(retrieveStudent.getEmail() + retrieveStudent.getName());
    }
}