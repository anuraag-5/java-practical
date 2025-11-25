package ass_1.seta;

/**
 * Simple utility class that encapsulates an integer and provides
 * common predicates (negative, positive, zero, odd, even).
 *
 * <p>This class demonstrates use of standard Javadoc tags such as
 * {@code @param}, {@code @return}, and {@code @author}.</p>
 *
 * @author Anuraag
 */
class MyNumber {
    /** The wrapped integer value. */
    private int number;

    /**
     * Default constructor.
     *
     * <p>Initializes the wrapped number to {@code 0}.</p>
     *
     * <p>This constructor simply assigns the field directly.</p>
     */
    MyNumber(){
        this.number = 0;
    }

    /**
     * Parameterized constructor.
     *
     * @param number the integer value to wrap
     * @since 1.0
     */
    MyNumber(int number){
        this.number = number;
    }

    /**
     * Checks whether the wrapped number is negative.
     *
     * @return {@code true} if the number is less than zero;
     *         {@code false} otherwise
     */
    public boolean isNegative(){
        return this.number < 0;
    }

    /**
     * Checks whether the wrapped number is positive.
     *
     * @return {@code true} if the number is greater than zero;
     *         {@code false} otherwise
     */
    public boolean isPositive(){
        return this.number > 0;
    }

    /**
     * Checks whether the wrapped number is zero.
     *
     * @return {@code true} if the number equals zero;
     *         {@code false} otherwise
     */
    public boolean isZero(){
        return this.number == 0;
    }

    /**
     * Checks whether the wrapped number is odd.
     *
     * <p>Odd means the remainder when dividing by 2 is not zero.</p>
     *
     * @return {@code true} if odd;
     *         {@code false} otherwise
     */
    public boolean isOdd(){
        return (this.number % 2) != 0;
    }

    /**
     * Checks whether the wrapped number is even.
     *
     * @return {@code true} if even;
     *         {@code false} otherwise
     */
    public boolean isEven(){
        return (this.number % 2) == 0;
    }
}

/**
 * Driver class demonstrating usage of {@link MyNumber}.
 */
public class c {
    /**
     * Program entry point.
     *
     * @param args command-line arguments (expects a single integer)
     * @throws NumberFormatException if {@code args[0]} is not a valid integer
     */
    public static void main(String []args){
        int number = Integer.parseInt(args[0]);

        MyNumber obj = new MyNumber(number);
        if(obj.isEven()){
            System.out.println("Even");
        }
    }
}