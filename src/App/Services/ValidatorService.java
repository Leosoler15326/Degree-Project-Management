/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Services;
import App.interfaces.IValidatorService;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Bucket
 */
public class ValidatorService implements IValidatorService{
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{6,}$";
    public static final String PHONE_NUMBER_PATTERN = "\"^[0-9]{10}$\"s";
    public static final String EMAIL_PATTERN = "\"^[a-zA-Z]+@unicauca.edu.co$\"s";
    private static ValidatorService Instance;
    public static ValidatorService GetInstance(){
        if(Instance == null)
            Instance = new ValidatorService();
        return Instance;
    }
    @Override
    public void isValidPassword(String password) throws Exception{
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if(!matcher.matches()) throw new Exception("Contraseña no valida");
    }
    @Override
    public void isValidEmail(String email) throws Exception{
        //Pattern pattern = Pattern.compile(EmailPattern, Pattern.DOTALL);
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) throw new Exception("Correo institucional no valido");
    }

    @Override
    public void isValidTelephone(String telephone) throws Exception {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(telephone);
        if(!matcher.matches()) throw new Exception("Telefono no valido");
    }
}
