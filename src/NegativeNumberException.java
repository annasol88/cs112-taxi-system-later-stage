import java.text.MessageFormat;

/**
 * Indicate that there was no passenger at a pickup point.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class NegativeNumberException extends RuntimeException
{
    private int number;
    /**
     * Constructor for objects of class NegativeNumberException.
     * @param number The number being evaluated
     */
    public NegativeNumberException(int number)
    {
        super(String.format("Number %s is a negative.", number));
    }
}
