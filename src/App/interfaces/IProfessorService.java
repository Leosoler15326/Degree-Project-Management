/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package App.Interfaces;

import App.Entities.PreliminaryDraft;
import java.util.List;

/**
 *
 * @author juans
 */
public interface IProfessorService {
    List<PreliminaryDraft> GetAllPreliminaryDrafts();
    void CheckPreliminaryDraft(int prmId);
    
}
