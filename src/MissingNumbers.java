import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; //  number 3 is missing
        System.out.println("The missing number is: " + findMissingNumber(numbers));
    }

    public static int findMissingNumber(int[] numbers) {
        //  sort the numbers
        Arrays.sort(numbers);



        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] != numbers[i - 1] + 1) {
                return numbers[i - 1] + 1;  // This is the missing number.
            }
        }

        // the missing number is the next one.
        return numbers[numbers.length - 1] + 1;
    }
}



