package App.entities;

import java.util.ArrayList;

/**
 *
 * @author Alexp
 */
public class Thesis {
   private Student _student;
   private String _draftProposal;
   private String _monograph;
   private ArrayList<Professor> _professors;
   private EnumStates _state; 

    public Thesis(Student _student, ArrayList<Professor> _professors, EnumStates _state) {
        this._student = _student;
        this._professors = _professors;
        this._state = _state;
    }

    public Student getStudent() {
        return _student;
    }

    public void setStudent(Student student) {
        this._student = student;
    }

    public String getDraftProposal() {
        return _draftProposal;
    }

    public void setDraftProposal(String draftProposal) {
        this._draftProposal = draftProposal;
    }

    public String getMonograph() {
        return _monograph;
    }

    public void setMonograph(String monograph) {
        this._monograph = monograph;
    }

    public ArrayList<Professor> getProfessors() {
        return _professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this._professors = professors;
    }

    public EnumStates getState() {
        return _state;
    }

    public void setState(EnumStates state) {
        this._state = state;
    }

   
   
       
}
