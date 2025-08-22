package App.Repositories;

import App.DataBase.DataBase;
import App.Entities.PreliminaryDraft;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class ProfessorRepository{
    
    private DataBase _DataBase;

    public ProfessorRepository(DataBase db) {
        this._DataBase = db;
    }
    public ProfessorRepository() {
    }

    public List<PreliminaryDraft> getAllPreliminaryDrafts(int prmIdProfessor) {
        List<PreliminaryDraft> drafts = new ArrayList<>();
        String sql = "SELECT id, status, date, name, id_student, id_professor " +
                     "FROM Anteproyecto " +
                     "WHERE id_professor = ?";

        try (Connection conn = _DataBase.Connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, prmIdProfessor);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                PreliminaryDraft draft = new PreliminaryDraft(
                    rs.getInt("id"),
                    rs.getInt("id_student"),
                    rs.getInt("id_professor"),
                    rs.getString("name"),
                    rs.getDate("date"),
                    rs.getString("status")
                );
                drafts.add(draft);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener anteproyectos: " + e.getMessage());
        }

        return drafts;
    }

    public void SetStatusPreliminaryDraft(String prmStatus, int prmPreliminaryId){
        
    }
    
}
