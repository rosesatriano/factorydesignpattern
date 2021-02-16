package factory;

/**
 * This class sets the attributes for the tricycle so it can be created. 
 * @author rosesatriano
 */
public class Tricycle extends Bike{
    /**
     * This constructor creates the attributes for the name, price, number of
     * wheels, whether it has pedals, and whether it has training wheels.
     */
    public Tricycle(){
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }
}
