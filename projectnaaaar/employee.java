package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class employee extends person implements Serializable{

    int id_emp;
    boolean absentOrAttend;
    int numDays;
    String type_emp;
    final String empFilePath="emp.bin";
    protected String [] Penalties = new String[20];
    private int PenaltyCount = 0;
    Tasks EMPTask = new Tasks();

    public static ArrayList<employee> emp = new ArrayList<employee>();
    
    public employee(){

    }
    // in GUI take all the data from the user ex
    public employee(int id , String userName , String pass ,String fname , String lname,String type_emp) {
        super( userName,  pass,  fname,  lname);
        this.id_emp=id;
        this.type_emp = type_emp;

    }
    // getter and setter employee
    public int getId_emp() {
        return id_emp;
    }
    
    @Override
    public String getFname(){
        return this.fname;
    }
    
    @Override
    public String getLname(){
        return this.lname;
    }
    
    public void setId_emp(int id_emp) {
    this.id_emp = id_emp;
    }
    
    public boolean addemployee(){
        if (this.id_emp > 0)
        {
            loadFromFileEmp();
            if (getEmployeeIndex(this.id_emp) == -1) {
                emp.add(this);
                return commitToFileEmp();
            }
            else return false;
        }
        else
            return false;
    }
    
    public String getEmployee(){
        return this.id_emp + "@" + this.fname + "@" + this.lname + "@" + this.pass + "@" + this.userName;
    }
    
    protected void loadFromFileEmp() {
            emp = (ArrayList<employee>) (Object) fmanager.read(empFilePath);
    }
    
    public int getEmployeeIndex(int Id){

        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getId_emp()== Id) {
                return i;
            }       
        }
        return  -1;   
    }
    
    
    public boolean commitToFileEmp(){
        return fmanager.write(empFilePath, emp);
    }
    
    
    public boolean deleteEmployee(int id){
        loadFromFileEmp();
        int index=getEmployeeIndex(id);
        if (index!=-1) {
            emp.remove(index);
            return commitToFileEmp();
        }
       return false;
    }
    
    public boolean updateEmployee(int oldId, employee e){
        loadFromFileEmp();
        int index=getEmployeeIndex(oldId);
        if (index!=-1) {
            emp.set(index, e);
            return commitToFileEmp();
        }
       return false;
    }
    
    public String displayAllEmployees() {
        loadFromFileEmp();
        String s = "\nAll employees Data:\n\n";
        for (employee x : emp) {
            String a =  x.toString();
            s += a;
        }
       return s; 
    }
    
    
    @Override
    public String toString(){
        return "\n\niam " + this.fname + " " + this.lname + "\n\niam " + this.type_emp + "\n\nmy userName : " + this.userName + "\n\nand Password : " + this.pass;
    }
    


   public boolean logIn(String userName , String password){
       loadFromFileEmp();
       for (employee e : emp){
           if (e.userName.equals(userName) && e.pass.equals(password)){
                return true;
           }               
       }
       return false;
   }
    public void setPenaltyCount ( int x)
    {
        this.PenaltyCount = x;
    }
    public int getPenaltyCount ()
    {
        return PenaltyCount;
    }

    public String ViewAllPenalties () {
        String s = "";
        for (int i = 0; i < Penalties.length && Penalties[i] != null ; i++)
        {
            s  = s +  "-" + Penalties[i] + "\n";
        }
        return s;
    }
    public void Vacation (TeamLeader pm, String Reason)
    {
        pm.setVacations(pm.getVacCounter(), "ID : " + id_emp  + "\n" +Reason );
        pm.setVacCounter(pm.getVacCounter() + 1);
    }
    public String ViewAssignedTasks()
    {
        String s = "";
        for (int i = 0; i < EMPTask.OnGoingCount; i++)
        {
            s = s + "-"  + EMPTask.OnGoingTasks[i] + "\n";
        }
        return  s;
    }
    public boolean CheckTask (String Task, TeamLeader TM)
    {
        for (int i = 0; i < EMPTask.OnGoingTasks.length; i++ )
        {
            if (Task.equals(EMPTask.OnGoingTasks[i]) )
            {
                TM.TMTasks.CompletedTasks[TM.TMTasksCount ++ ] = Task;
                return true;
            }
        }
        return false;
    }

}
   