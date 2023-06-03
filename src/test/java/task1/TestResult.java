package task1;

import java.util.Date;

public class TestResult {
    private String runTimeOfTest;
    private int amountNumberOfTests;
    private int numberOfSuccessfulTests;
    private int numberOfFailedTests;


    public TestResult(String runTimeOfTest, int amountNumberOfTests, int numberOfSuccessfulTests, int numberOfFailedTests) {
        this.amountNumberOfTests = amountNumberOfTests;
        this.numberOfSuccessfulTests = numberOfSuccessfulTests;
        this.numberOfFailedTests = numberOfFailedTests;
        this.runTimeOfTest = runTimeOfTest;
    }

    public int getAmountNumberOfTests() {
        return amountNumberOfTests;
    }

    public void setAmountNumberOfTests(int amountNumberOfTests) {
        this.amountNumberOfTests = amountNumberOfTests;
    }

    public int getNumberOfSuccessfulTests() {
        return numberOfSuccessfulTests;
    }

    public void setNumberOfSuccessfulTests(int numberOfSuccessfulTests) {
        this.numberOfSuccessfulTests = numberOfSuccessfulTests;
    }

    public int getNumberOfFailedTests() {
        return numberOfFailedTests;
    }

    public void setNumberOfFailedTests(int numberOfFailedTests) {
        this.numberOfFailedTests = numberOfFailedTests;
    }

    public String getRunTimeOfTest() {
        return runTimeOfTest;
    }

    public void setRunTimeOfTest(String runTimeOfTest) {
        this.runTimeOfTest = runTimeOfTest;
    }

    @Override
    public String toString() {
        return "task1.TestResult{" +
                "runTimeOfTest='" + runTimeOfTest + '\'' +
                ", amountNumberOfTests=" + amountNumberOfTests +
                ", numberOfSuccessfulTests=" + numberOfSuccessfulTests +
                ", numberOfFailedTests=" + numberOfFailedTests +
                '}';
    }
}
