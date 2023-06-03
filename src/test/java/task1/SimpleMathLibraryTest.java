package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SimpleMathLibraryTest {
   private SimpleMathLibrary simpleMathLibrary;

   @BeforeEach
   void setup() {
       simpleMathLibrary = new SimpleMathLibrary();
   }

   @Test
   public void whenAddPerformOperationReturnCorrectResult() {
       double num1 = 2;
       double num2 = 2;
       double result = simpleMathLibrary.add(num1, num2);
       double expected = 4;
       if (result == expected) {
           System.out.println("OK");
       } else {
           System.out.println("NOK");
       }
   }

   @Test
   public void whenSubtractPerformOperationReturnCorrectResult() {
       double num1 = 2;
       double num2 = 2;
       double result = simpleMathLibrary.subtract(num1, num2);
       double expected = 0;
       if (result == expected) {
           System.out.println("OK");
       } else {
           System.out.println("NOK");
       }
   }
}
