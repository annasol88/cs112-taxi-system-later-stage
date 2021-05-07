
/**
 * Indicate that there was no passenger at a pickup point.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MissingCityException extends RuntimeException
{
    private City city;
    /**
     * Constructor for objects of class MissingCityException.
     * @param city The city expected
     */
    public MissingCityException(City city)
    {
        super("City is not found or missing.");
    }
}
