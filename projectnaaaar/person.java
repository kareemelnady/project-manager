package classes;
import java.util.*;
import java.io.*;
public class person implements Serializable{

    String userName;
    String pass;
    String fname;
    String lname;
    
    FileManagerBinary fmanager = new FileManagerBinary();

    public person() {
    }
    
    
    public person(String userName, String pass, String fname, String lname) {
        this.userName = userName;
        this.pass = pass;
        this.fname = fname;
        this.lname = lname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
} 
