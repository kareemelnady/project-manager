package classes;
import java.util.*;
import java.io.*;
public class Project implements Serializable{
    protected  String ProjectName;
    protected String [] Tasks;
    protected int PercentageOfCompletion;
    public Project ()
    {
        Tasks = new String[15];
        for (int i = 0; i < Tasks.length; i++)
        {
            Tasks[i] = "Task No :" + (i + 1);
        }
        PercentageOfCompletion = 0;
        ProjectName = "OurProject";
    }
    public void DisplayAllTasks ()
    {
        for (int i = 0; i < Tasks.length; i++)
        {
            System.out.println(Tasks[i]);
        }
    }
    public String GetAllTasks ()
    {
        String s = "";
        for (int i = 0; i < Tasks.length; i++)
        {
            s += Tasks[i] + "\n";
        }
        return s;
    }

}
