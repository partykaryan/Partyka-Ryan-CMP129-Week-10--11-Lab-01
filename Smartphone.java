public class Smartphone implements Device {
    private String brand;
    private String model;
    private double screenSize;

    public Smartphone(String brand, String model, double screenSize){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }
    
    //Getter and Setter Methods 
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getscreenSize(){
        return screenSize;
    }

    public void setscreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    //Override method to display Smartphone information
    @Override
    public void turnOn(){
        System.out.println("Smartphone Information: " + brand + " " + model);
        System.out.println("Screen size: " + screenSize);
    }

}//end of public class
