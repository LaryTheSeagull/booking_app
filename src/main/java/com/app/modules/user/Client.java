// belongs in
package main.java.com.app.modules.user;

public class Client {

    // attributes
    public int id;
    public String hashPsw;
    public String fName;
    public String lName;
    public String mail;
    public String phone;
    
    // auth function
    public boolean authenticate(String psw) {
        return true;
    };
}