package task1;

import org.junit.platform.console.ConsoleLauncher;
import java.io.*;


public class ProjectTestRunner {
    private static final String RESULT_FILE_PATH = "Test_results.txt";
    private static final String ERRORS_FILE_PATH = "Test_errors.txt";

    public static void runTestClassByName(String className) {
        String[] selector = {"--select-class", className, "--disable-banner"};
        try {
            PrintWriter writer = new PrintWriter(RESULT_FILE_PATH);
            ConsoleLauncher.execute(writer, new PrintWriter(ERRORS_FILE_PATH), selector);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void runTestClass(Class<?> clazz) {
        String className = clazz.getName();
        runTestClassByName(className);

    }

    public static void runTestClassesByNames(String... classNames) {
        for (String className : classNames) {
            runTestClassByName(className);
        }
    }

    public static void runTestClasses(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            runTestClass(clazz);
        }
    }

    public static void runTestsInPackage(String packageName) {
        String[] selector = { "--select-directory", packageName, "--disable-banner" };
        try {
            PrintWriter resultWriter = new PrintWriter(RESULT_FILE_PATH);
            ConsoleLauncher.execute(resultWriter, new PrintWriter(ERRORS_FILE_PATH), selector);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
