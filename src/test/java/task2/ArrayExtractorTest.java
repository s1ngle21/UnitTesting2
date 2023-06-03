package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArrayExtractorTest {
    private  ArrayExtractor arrayExtractor;

    @BeforeEach
    void setup() {
        arrayExtractor = new ArrayExtractor();
    }

    @Test
    public void whenPerformExtractArrayOperationReturnAllNumbersAfterLastFour() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] actual = arrayExtractor.extractArray(input);
        int[] expected = {1, 7};
        assertArrayEquals(actual, expected, "Returned result must be all numbers after last 4!");
    }

    @Test
    public void whenPerformExtractArrayOperationAndIfArrayDoesNotHaveAnyFourThrowRuntimeException() {
        int[] input = {1, 2, 5, 7, 2, 3, 1, 1, 7};
        assertThrows(RuntimeException.class, () -> arrayExtractor.extractArray(input));
    }

    @Test
    public void whenPerformExtractArrayOperationAndIfArrayIsNullThrowNullPointerException() {
        int[] input = {};
        assertThrows(RuntimeException.class, () -> arrayExtractor.extractArray(input));
    }
}
