package ro.isr.devschool.java8.lambdas;
import java.io.File;
import java.io.FilenameFilter;


public class FileFilterExample implements FilenameFilter {
    public static void main(String[] args){
        final FileFilterExample filter=new FileFilterExample(){
            @Override
            public boolean accept(File dir, String name){
                return name.toLowerCase().endsWith(".txt");
            }
        };

        final FilenameFilter filterLambda1=(File dir, String name)->{return name.toLowerCase().endsWith(".txt");};

        final FilenameFilter filterLambda2=(dir,name)->{return name.toLowerCase().endsWith(".txt");};

        final FilenameFilter filterLambda3=(dir,name)->!dir.isDirectory()&& name.toLowerCase().endsWith(".txt");

        File homeDir=new File(System.getProperty("user.home"));
        String[] files=homeDir.list(filter);
        for(String file:files){
            System.out.print(file);
        }
    }


    public boolean accept(File dir, String name) {
        return false;
    }
}
