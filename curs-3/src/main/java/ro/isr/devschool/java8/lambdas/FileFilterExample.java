package ro.isr.devschool.java8.lambdas;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterExample {

    public static void main(String[] args) {
        // create file filter in the old way
        final FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        final FilenameFilter filterLamba1 = (File dir, String name) -> { return name.toLowerCase().endsWith(".txt");};
        final FilenameFilter filterLamba2 = (dir, name) -> { return name.toLowerCase().endsWith(".txt");};
        final FilenameFilter filterLamba3 = (dir, name) -> name.toLowerCase().endsWith(".txt");
        final FilenameFilter filterLamba4 = (dir, name) -> !dir.isDirectory() && name.toLowerCase().endsWith(".txt");


        File homeDir = new File(System.getProperty("user.home"));
        String[] files = homeDir.list(filterLamba4);
        for (String file : files) {
            System.out.println(file + " ");
        }

    }
}
