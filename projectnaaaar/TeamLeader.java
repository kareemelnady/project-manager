package classes;

import java.io.Serializable;

public class TeamLeader extends person implements Serializable {
    protected Project OurProject;
    private String [] Vacations = new String[20];
    private int VacCounter;
    ProjectManager PM;
    protected Tasks TMTasks;
    protected int TMTasksCount;
    public TeamLeader() {

        VacCounter = 0;
        PM = new ProjectManager();
        TMTasks = new Tasks();
        TMTasksCount = 0;
    }
    public void setVacCounter (int x)
    {
        this.VacCounter = x;
    }
    public int getVacCounter()
    {
        return VacCounter;
    }
    protected void setVacations (int index, String Reason)
    {
        Vacations[index] = Reason;
    }
    public String ViewAllVacations ()
    {
        String s = "";
        for (int i = 0; i < Vacations.length; i++)
        {
            if (Vacations[i] == null) break;
            s = s + Vacations[i] +"\n";
        }
        return s;
    }
    public void GivePenalty (employee emp, String Penalty) {
        emp.Penalties[emp.getPenaltyCount()] = Penalty;
        emp.setPenaltyCount(emp.getPenaltyCount() + 1);
    }
    public void AssignTask (employee emp, String Task)
    {
        emp.EMPTask.OnGoingTasks[emp.EMPTask.OnGoingCount ++] = Task;
        PM.PMTask.AllTasksOfProject[PM.PMTaskCount ++ ] = Task;
    }
    public String ViewCompletedTasks () {
        String s = "";
        for (int i = 0; i < TMTasksCount; i++)
        {
            s = "-" + TMTasks.CompletedTasks[i] + "\n";
        }
        return s;
    }

}
