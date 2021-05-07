
/**
 * Indicate that there was no passenger at a pickup point.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MissingLocationException extends RuntimeException
{
    private Location location;
    /**
     * Constructor for objects of class MissingLocationException.
     * @param location The location being set / retrieved.
     */
    public MissingLocationException(Location location)
    {
        super("Location is missing.");
    }
}
