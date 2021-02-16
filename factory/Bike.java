package factory;

/**
 * This class keeps track of the name of the bike, the number of wheels, 
 * whether it has pedals, and whether is has training wheels.
 * @author rosesatriano
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * This method implements all the methods to create the bike.
     */
    public void createBike(){
        createFrame();
        addWheels();
        addPedals();
    }

    /**
     * In this method, this displays what type of frame it is assembling.
     * This is used later on when implementing other types of bikes.
     */
    private void createFrame(){
        System.out.println("Assembling "+name+" frame");
    }

    /**
     * In this method, we are determining what number of wheels to add to the
     * bike. If the number of wheels is zero, we will just return and leave it
     * without displaying anything. If we have more than 0 wheels, then we
     * will print how many wheels we are adding. Also, we have to check whether
     * the bike has training wheels, and if the specific bike does, we will
     * display that we are adding training wheels.
     * @return returns nothing if there are no wheels
     */
    private void addWheels(){
        if(numWheels == 0){
            return;
        }else if(numWheels > 0){
            System.out.println("Adding "+numWheels+" wheel(s)");
            if(hasTrainingWheels){
                System.out.println("Adding Training Wheels");
            }
        }
        
    }

    /**
     * This method first determines if the type of bike has pedals. If the bike
     * has pedals, which we determine using boolean, then we will display that
     * we are adding pedals
     * @return returns nothing if there are not pedals
     */
    private void addPedals(){
        if (hasPedals){
            System.out.println("adding Pedals");
        }else{
            return;
        }
    }

    /**
     * This method gets the price from the inherited bikes and this will later 
     * display the corresponding price for that bike.
     * @return this returns the price of the selected bike.
     */
    public double getPrice(){
        return price;
    }
}
