package classes;

import java.io.Serializable;

public class ProjectManager implements Serializable {
    protected Tasks PMTask;
    protected int PMTaskCount;
    ProjectManager ()
    {
        PMTask = new Tasks();
        PMTaskCount = 0;
    }
    public double PercentageOfCompletion (TeamLeader TM)  {
        return 1- (double )(TM.PM.PMTaskCount - TM.TMTasksCount) / TM.PM.PMTaskCount;
    }

}
