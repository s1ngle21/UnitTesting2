package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckArrayTest {
    private CheckArray checkArray;

    @BeforeEach
    public void setup() {
        checkArray = new CheckArray();
    }

    @Test
    public void whenPerformCheckArrayOperationIfArrayConsistsOnlyOfOneAndFourReturnTrue() {
        int[] input = {1, 1, 1, 4, 4, 1, 4, 4};
        assertTrue(checkArray.checkArray(input));
    }

    @Test
    public void whenPerformCheckArrayOperationIfArrayDoNotContainFourReturnFalse() {
        int[] input = {1, 1, 1, 1, 1, 1, 1, 1};
        assertFalse(checkArray.checkArray(input));
    }

    @Test
    public void whenPerformCheckArrayOperationIfArrayDoNotContainOneReturnFalse() {
        int[] input = {4, 4, 4, 4, 4, 4, 4, 4};
        assertFalse(checkArray.checkArray(input));
    }

    @Test
    public void whenPerformCheckArrayOperationIfArrayContainOtherNumbersExceptFourAndOneReturnFalse() {
        int[] input = {1, 4, 4, 1, 1, 4, 3};
        assertFalse(checkArray.checkArray(input));
    }
}
