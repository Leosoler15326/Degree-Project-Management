package App.Main;


import App.DataBase.DataBase;
import App.Entities.PreliminaryDraft;
import App.Repositories.ProfessorRepository;
import App.Views.LoginView;
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
        ProfessorRepository professortRepo = new ProfessorRepository(db);
        
         List<PreliminaryDraft> pr = professortRepo.getAllPreliminaryDrafts(1);
        
        // Verificar si hay resultados
        if (pr != null && !pr.isEmpty()) {
            System.out.println("Anteproyectos encontrados: " + pr.size());
            
            // Mostrar cada anteproyecto
            for (PreliminaryDraft draft : pr) {
                System.out.println(draft.toString());
            }
            
            // Mostrar el primer anteproyecto específicamente
            System.out.println("\nPrimer anteproyecto:");
            System.out.println(pr.get(0));
            
        } else {
            System.out.println("No se encontraron anteproyectos para el profesor con ID 1");
            System.out.println("Verifica que:");
            System.out.println("1. La tabla Anteproyecto existe");
            System.out.println("2. Hay datos en la tabla");
            System.out.println("3. Existe un profesor con ID 1");
            System.out.println("4. Existen anteproyectos asociados al profesor ID 1");
        }   
    }
}