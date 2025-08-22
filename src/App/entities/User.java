package App.entities;

/**
 *
 * @author juans
 */
public class User {
   protected String name;
   /** @pdOid dc9a7e8c-84aa-4f5e-b44d-14dfdea71fe7 */
   protected String lastName;
   /** @pdOid 6d0b52b1-5713-487b-ad43-2ccc92018ef7 */
   protected String email;
   /** @pdOid cc787832-db58-4419-888f-e852a932b9d4 */
   protected String password;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
