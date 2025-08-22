package App.interfaces;
import java.util.List;

/**
 *
 * @author juans
 */
public interface IRepository<T>{
    List<T> List();
    boolean Add(T prmItem);
    boolean Delete(T prmItem);
    T Retrieve (String prmId);
}
