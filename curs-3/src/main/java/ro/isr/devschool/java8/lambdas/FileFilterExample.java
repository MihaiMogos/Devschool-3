package ro.isr.devschool.java8.lambdas;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by scipianus on 04-Apr-17.
 */
public class FileFilterExample {
    public static void main(String[] args) {
        // Create a FileFilter in the old way
        final FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        // Create a FileFilter using lambdas
        final FilenameFilter filterLambda1 = (File dir, String name) -> {
            return name.toLowerCase().endsWith(".txt");
        };
        // lose return and { }
        final FilenameFilter filterLambda2 = (File dir, String name) -> name.toLowerCase().endsWith(".txt");
        // also you can not use types anymore, let the compiler figure them out
        final FilenameFilter filterLambda3 = (dir, name) -> name.toLowerCase().endsWith(".txt");


        File homeDir = new File(System.getProperty("user.home"));
        String[] files = homeDir.list(filter);
        for (String file : files) {
            System.out.println(file);
        }
        System.out.println();

        files = homeDir.list(filterLambda3);
        for (String file : files) {
            System.out.println(file);
        }
    }
}
