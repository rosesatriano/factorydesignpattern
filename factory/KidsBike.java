package factory;

/**
 * This class sets the attributes for the kids bike so it can be created. 
 * @author rosesatriano
 */
public class KidsBike extends Bike{
    /**
     * This constructor creates the attributes for the name, price, number of
     * wheels, whether it has pedals, and whether it has training wheels.
     */
    public KidsBike(){
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}