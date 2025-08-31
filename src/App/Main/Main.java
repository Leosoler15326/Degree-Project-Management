package App.Main;

<<<<<<< Updated upstream

import App.DataBase.DataBase;
import App.Entities.PreliminaryDraft;
import App.Repositories.PreliminaryDraftRepository;
import App.Repositories.ProfessorRepository;
import App.entities.Student;
import App.repositories.StudentRepository;
import java.util.Date;
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
        PreliminaryDraftRepository preliminaryRepo = new PreliminaryDraftRepository(db);
        
        List<Student> listaEstudiante = studentRepo.List();
        for (int i = 0; i < listaEstudiante.size(); i++) {
            System.out.println(listaEstudiante.get(i).getEmail());
        }
        /*
        Date currentDate = new Date();
        PreliminaryDraft draft = new PreliminaryDraft(
            0,                      // id (0 si es autogenerado)
            "",                      // id_student (se ignora, se obtiene por email)
            "",                      // id_professor (se ignora, se obtiene por email)
            "Sistema de Gestión Académica", // name
            currentDate.toString(),            // date
            "Pendiente"             // status
        );
        preliminaryRepo.AddPreliminaryDraft(draft, "juan.perez@uni.edu", "pedro.salazar@uni.edu");
        */
        List<PreliminaryDraft> listaAnteProyectos = professortRepo.getAllPreliminaryDrafts("pedro.salazar@uni.edu");
        for (int i = 0; i < listaAnteProyectos.size(); i++) {
            System.out.println(listaAnteProyectos.get(i).getName());
        }
        
        
=======
import App.DataBase.AppContext;
import App.Views.LoginView;
import App.Views.MainView;

public class Main {

    public static void main(String[] args) throws Exception {

        AppContext.init();

                javax.swing.SwingUtilities.invokeLater(() -> {
            MainView mainView = new MainView();
            mainView.setVisible(true);
        });
        /*
        javax.swing.SwingUtilities.invokeLater(() -> {
            LoginView loginView = new LoginView();
            loginView.setAccountController(AppContext.accountController);
            loginView.setVisible(true);
        });
        */
>>>>>>> Stashed changes
    }
}