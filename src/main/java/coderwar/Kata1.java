package coderwar;

/**
 * @author cl
 * @version $Id: Kata1 v 0.1 2019-02-21 17:31 cl Exp $$
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class Kata1 {

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}
