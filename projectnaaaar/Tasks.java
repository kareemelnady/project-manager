package classes;

import java.io.Serializable;

public class Tasks implements Serializable {
    protected String [] OnGoingTasks;
    protected String [] CompletedTasks;
    protected String [] AllTasksOfProject;
    protected int PercentageCount;
    protected int OnGoingCount;
    public Tasks ()
    {
        OnGoingTasks = new String[20];
        CompletedTasks = new String[60];
        AllTasksOfProject = new String[60];
        PercentageCount = 0;
        OnGoingCount = 0;
    }

    public String[] getOnGoingTasks() {
        return OnGoingTasks;
    }

    public void setOnGoingTasks(String[] onGoingTasks) {
        OnGoingTasks = onGoingTasks;
    }

    public String[] getCompletedTasks() {
        return CompletedTasks;
    }

    public void setCompletedTasks(String[] completedTasks) {
        CompletedTasks = completedTasks;
    }

    public String[] getAllTasksOfProject() {
        return AllTasksOfProject;
    }

    public void setAllTasksOfProject(String[] allTasksOfProject) {
        AllTasksOfProject = allTasksOfProject;
    }
}
