package App.entities;

/**
 *
 * @author juans
 */
public class Student extends User{
    private EnumPrograms _program;

    public Student(EnumPrograms _program, String name, String lastName, String email, String password) {
        super(name, lastName, email, password);
        this._program = _program;
    }

    
    public EnumPrograms getProgram() {
        return _program;
    }

    public void setProgram(EnumPrograms _program) {
        this._program = _program;
    }

    
}
