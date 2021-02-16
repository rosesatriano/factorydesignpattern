package factory;

/**
 * This class is our factory, which helps create the tricycles, striders, 
 * and kids bikes. 
 * @author rosesatriano
 */
public class BikeStore {
    /**
     * This method orders the bike based on the type of bike. This method
     * calls the createBike method in order to make the bike. We will then 
     * display the price of the selected bike because it was not included
     * to do so when creating the bike.
     * @param type is where we determine which bike we are ordering
     * @return this returns the bike selected and its details included
     */
    public Bike orderBike(String type){
        Bike bike = createBike(type);
        bike.createBike();
        System.out.println("Price: $"+bike.getPrice());
        return bike;
    }

    /**
     * This method creates the bike based on the type of bike called.
     * @param type is the name of the bike inputted, which aligns itself with
     * that type of bike and creates that bike.
     * @return This returns the bike created.
     */
    private Bike createBike(String type){
        Bike bike = null;

        if(type.equalsIgnoreCase("tricycle")){
            bike = new Tricycle();
        } else if(type.equalsIgnoreCase("strider")){
            bike = new Strider();
        }else if(type.equalsIgnoreCase("kids bike")){
            bike = new KidsBike();
        }

        return bike;
    
    }
}
