package App.interfaces;
import java.util.List;

/**
 *
 * @author juans
 */
public interface IRepository<T>{
    boolean Save(T Data);
    List<T> List();
    
}
