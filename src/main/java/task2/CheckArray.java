package task2;

import java.util.Objects;

public class CheckArray {

    public boolean checkArray(int[] input) {
        Objects.requireNonNull(input);
        int one = 0;
        int four = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 4 && input[i] != 1) {
                return false;
            }
            if (input[i] == 1) {
               one = 1;
            }
            if (input[i] == 4) {
                four = 4;
            }
        }
        return one + four == 5;
    }
}
