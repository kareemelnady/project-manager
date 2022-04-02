package classes;

public class Ba3Basa {
    public static void main(String[] args) {
        TeamLeader TM = new TeamLeader();
        employee emp = new employee();
        ProjectManager PM = new ProjectManager();
        TM.AssignTask(emp, "Suck MY dick off ");
        TM.AssignTask(emp, "Adham");
        TM.AssignTask(emp, "Kareem");
        emp.CheckTask("Adham",TM);
        emp.CheckTask("Kareem",TM);
        emp.CheckTask("Suck MY dick off ", TM);
        System.out.println(PM.PercentageOfCompletion(TM));

    }
}
