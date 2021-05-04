import javax.print.attribute.standard.Destination;

public class InvalidDestinationException extends RuntimeException

    {
        private Location destination;
        private Location pickup;
        /**
         * Constructor for objects of class Exception.
         *           @param destination The destintation the passenger is going.
         *           @param pickup The pickup location of the passenger.
         */
        public InvalidDestinationException(Location destination, Location pickup)
        {
            super("Passenger pickup cannot be the same as the destination. ");
        }

        /**
         * @return The destination that was the same as pickup.
         */
        public Location getDestination()
        {
            return destination;
        }
    }


