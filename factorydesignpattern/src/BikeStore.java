package factorydesignpattern;

public class BikeStore {

    public Bike orderBike(String type){
        Bike bike = createBike(type);
        bike.createBike();
        return bike;
    }

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
