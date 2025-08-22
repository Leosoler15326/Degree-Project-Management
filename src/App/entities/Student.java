package App.entities;

public class Student extends User {
    private String programa;

    public Student(String programa, int id, String name, String lastName, String email, String password, String phone) {
        super(id, name, lastName, email, password, phone);
        this.programa = programa;
    }
    
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
