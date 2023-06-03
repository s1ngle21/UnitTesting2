package task1;

public class TestRunner {

    public static void main(String[] args) {
        ProjectTestRunner.runTestClassByName("task1.SimpleMathLibraryTest");
        System.out.println(TestResultParser.parse("Test_results.txt"));

    }

}
