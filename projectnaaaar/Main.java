package classes;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path : " + projectPath);
        File currentDir = new File(projectPath);
        checkDirectoryContents(currentDir);
        adminClass ad = new adminClass();
        ad.addEmployee("Junior employee", 1, "hussien74", "hussien123", "moaaz", "mostafa");
        ad.addEmployee("Senior employee", 2, "ahmed74", "ahmed123", "ahmed", "saber");
        employee e = new employee();
        //ad.deleteEmployee(1);
        ad.deleteEmployee(2);
        System.out.println(e.displayAllEmployees());
        System.out.println(ad.ViewProject());
//       tasksClass t = new tasksClass(1 , "task" , "cmxsmcs" , "important" , 2 , 1);
//       t.showTasks();
//          Login log1 = new Login();
//          log1.show();

    }
    public static void checkDirectoryContents(File dir) {

        File[] files = dir.listFiles();
        boolean empFile = true;

        for(File file : files){
            if (file.getName().contains("emp.bin")){
                if (file.getName().contains("emp.bin"))
                    empFile = false;
            }
        }
        if (empFile){
            employee x = new employee();
            x.commitToFileEmp();
        }
    }

}
