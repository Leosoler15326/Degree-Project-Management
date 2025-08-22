package App.Session;


public class Session {
    private static Session instancia;
    private int idUsuario;
    private String email;

    private Session(int id, String email) {
        this.idUsuario = id;
        this.email = email;
    }

    public static void StartSession(int id, String user) {
        instancia = new Session(id, user);
    }

    public static Session getActual() {
        return instancia;
    }

    public static void closeSession() {
        instancia = null;
    }
}
