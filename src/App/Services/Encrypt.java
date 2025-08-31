package App.Services;

<<<<<<< Updated upstream
import App.interfaces.IEncrypt;

/**
 *
 * @author Alexp
 */
public class Encrypt implements IEncrypt{

    @Override
    public String Encrypt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
import org.mindrot.jbcrypt.BCrypt;

public class Encrypt {

    private static Encrypt Instance;

    public static Encrypt GetInstance() {
        if (Instance == null) {
            Instance = new Encrypt();
        }
        return Instance;
    }

    public String Encrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
>>>>>>> Stashed changes
    }

    @Override
    public boolean Check() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
<<<<<<< Updated upstream
    
=======

>>>>>>> Stashed changes
}
