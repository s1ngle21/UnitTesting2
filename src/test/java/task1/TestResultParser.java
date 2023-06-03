package task1;

import java.io.*;
import java.nio.file.Path;



public class TestResultParser {

    public static TestResult parse(String fileName) {
        File file = new File(fileName);
        TestResult testResult = parse(file);
        return testResult;
    }

        public static TestResult parse (File fileName) {
            TestResult testResult = new TestResult(null, 0, 0, 0);

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    String[] lineSplit = line.split(" ");

                    if (line.startsWith("Test run finished")) {
                        String timeOfTest = lineSplit[4].trim() + " " + lineSplit[5].trim();
                        testResult.setRunTimeOfTest(timeOfTest);
                    }

                    if (line.contains("tests found")) {
                        String amountTests = lineSplit[9].trim();
                        testResult.setAmountNumberOfTests(Integer.parseInt(amountTests));
                    }
                    if (line.contains("tests successful")) {
                        String testsSuccessful = lineSplit[9].trim();
                        testResult.setNumberOfSuccessfulTests(Integer.parseInt(testsSuccessful));
                    }
                    if (line.contains("tests failed")) {
                        String testsFailed = lineSplit[9].trim();
                        testResult.setNumberOfFailedTests(Integer.parseInt(testsFailed));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return testResult;
        }

        public static TestResult parse (Path fileName) {
            File file = fileName.toFile();
            TestResult testResult = parse(file);
            return testResult;
        }
    }

