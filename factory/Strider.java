package factory;

/**
 * This class sets the attributes for the strider so it can be created. 
 * @author rosesatriano
 */
public class Strider extends Bike{
    /**
     * This constructor creates the attributes for the name, price, number of
     * wheels, whether it has pedals, and whether it has training wheels.
     */
    public Strider(){
        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false;
    }
}