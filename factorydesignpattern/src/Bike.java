package factorydesignpattern;

public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike(){
        createFrame();
        addWheels();
        addPedals();
    }

    private void createFrame(){
        System.out.println("Assembling "+name+" frame");
    }

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

    private void addPedals(){
        if (hasPedals){
            System.out.println("adding Pedals");
        }else{
            return;
        }
    }

    public double getPrice(){
        return price;
    }
}
