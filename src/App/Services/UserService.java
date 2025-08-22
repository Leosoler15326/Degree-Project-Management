/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Services;

import App.DataBase.DataBase;
import App.entities.Student;
import App.repositories.StudentRepository;

/**
 *
 * @author Bucket
 */
public class UserService {
    public void RegisterUser(String name, String lastName, String PhoneNumber,String program,String email, String password) throws Exception{
        ValidatorService instance = ValidatorService.GetInstance();
        instance.isValidEmail(email);
        instance.isValidPassword(password);
        instance.isValidTelephone(password);
        DataBase db = new DataBase();
        Student student = new Student(program, name, lastName, email, password, PhoneNumber);
        StudentRepository studentrepo = new StudentRepository(db);
        studentrepo.Add(student);
        
    }
}
