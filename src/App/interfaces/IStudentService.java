/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package App.Interfaces;

import App.Entities.PreliminaryDraft;
import java.io.File;

/**
 *
 * @author juans
 */
public interface IStudentService {
    void uploadPreliminaryDraft(File prmFile);
    PreliminaryDraft getCurrentPreliminaryDraft();
    void setCurrentPreliminaryDraft();
    void removeCurrentPreliminaryDraft();
}
