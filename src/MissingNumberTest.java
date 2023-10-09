import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void testFindMissingNumberInTheMiddle() {
        int[] numbers = {1, 2, 4, 5, 6};
        int result = MissingNumbers.findMissingNumber(numbers);
        assertEquals(3, result, "Expected missing number to be 3");
    }

    @Test
    public void testFindMissingNumberAtTheEnd() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = MissingNumbers.findMissingNumber(numbers);
        assertEquals(6, result, "Expected missing number to be 6");
    }

    @Test
    public void testFindMissingNumberAtTheStart() {
        int[] numbers = {2, 3, 4, 5, 6};
        int result = MissingNumbers.findMissingNumber(numbers);
        assertEquals(1, result, "Expected missing number to be 1");
    }

    @Test
    public void testFindMissingNumberInBiggerGap() {
        int[] numbers = {1, 2, 5, 6, 7};
        int result = MissingNumbers.findMissingNumber(numbers);
        assertEquals(3, result, "Expected missing number to be 3");
    }
}




