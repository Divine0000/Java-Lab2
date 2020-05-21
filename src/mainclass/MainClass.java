
package mainclass;

abstract class Vehicle {
    String name;
    String model;
    String Type;
    int maxspeed;
    int minspeed;

    public Vehicle() {
    }
    

    public Vehicle(String name, String model, String Type, int maxspeed, int minspeed) {
        this.name = name;
        this.model = model;
        this.Type = Type;
        this.maxspeed = maxspeed;
        this.minspeed = minspeed;
    }
    
    
    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getMinspeed() {
        return minspeed;
    }

    public void setMinspeed(int minspeed) {
        this.minspeed = minspeed;
    }
    
    
} 


 interface Automobile {
    public void accelerate();
    
    //static String color;
}


 class Motorcycle extends Vehicle{
    
    public void accelerate(){
        System.out.println( "The max ");
    }
    public void stop(){
        System.out.println( " ");
    }
    public void gas(){
        System.out.println( " ");
    }
}


 class Bus extends Vehicle {
    
    public void accelerate(){
        System.out.println( "The maxspeed is : ");
    }
    public void stop(){
        System.out.println( " ");
    }
    public void gas(){
        System.out.println( " ");
    }
}


class Sedam extends Vehicle implements Automobile{
    
    public void accelerate(){
        System.out.println( "The max speed is: ");
    }
    public void accelerate(int max1,int max2){
        System.out.println( "The speed is between "+max1 +" and "+max2);
    }
    public void stop(){
        System.out.println( " ");
    }
    public void gas(){
        System.out.println( " ");
    }
       
}


class SportsCar extends Vehicle implements Automobile{
    
    public void accelerate(){
        System.out.println( "The max ");
    }
    public void stop(){
        System.out.println( " ");
    }
    public void gas(){
        System.out.println( " ");
    }
    
}



public class MainClass {

    public static void main(String[] args) {
       Sedam myObj= new Sedam();
       Vehicle onject2 = new Sedam();
       myObj.accelerate();
       myObj.accelerate(230, 300);
       onject2.accelerate();
    }
    
}
