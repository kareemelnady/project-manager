package classes;

import java.util.*;
import java.io.*;
public class adminClass extends person implements Serializable{
    // To Display the project name
    private Project p = new Project();

    public adminClass() {
        super("AdhamKhaled", "AboElAdahem", "adham", "khaled");
    }  
    
    public void addEmployee(String typeOfEmp , int id , String userName , String pass , String fname , String lname){
        employee e = new employee(id , userName , pass , fname , lname , typeOfEmp);
            if (e.addemployee())
                System.out.println("\nEmployee added successfully\n");
            else
                System.out.println("\nFailed to add new employee\n");
        }
    
    public void updateEmployee(int oldId , String typeOfEmp , int id , String userName , String pass , String fname , String lname){
        employee e = new employee(id , userName , pass , fname , lname , typeOfEmp);
        if (e.updateEmployee(oldId, e))
            System.out.println("\nUpdated successfully");
        else
            System.out.println("\nFailed to update employee\n");
    }
    
    public void deleteEmployee(int id){
        employee e = new employee();
        e.deleteEmployee(id);
    }

    
    public boolean login(String userName , String pass){
        if (this.userName.equals(userName) && this.pass.equals(pass))
            return true;
        else
            return false;
    }
    public String ViewProject ()
    {
        return "Project Name is " + p.ProjectName + "\nTasks are :\n" +p.GetAllTasks();
    }
    public void logout(){
        System.exit(0);
    }
}
