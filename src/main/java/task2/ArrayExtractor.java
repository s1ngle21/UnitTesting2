package task2;

import java.util.Objects;

public class ArrayExtractor {

    public int[] extractArray(int[] inputInts) {
        Objects.requireNonNull(inputInts);
        int lastFourIndex = -1;
        int[] newArr = null;
        for (int i = inputInts.length - 1; i > 0; i--) {
            if (inputInts[i] == 4) {
                lastFourIndex = i;
                int newArrLength = (inputInts.length - 1) - i;
                newArr = new int[newArrLength];
                System.arraycopy(inputInts, i + 1, newArr, 0, newArrLength);
                break;
            }
        }
        if (lastFourIndex == -1) {
            throw new RuntimeException("Array must contain at least one '4'!");
        }
        return newArr;
    }
}
