public class Laptop implements Device{
    
    private String brand;
    private String model;
    private String processorType;

    public Laptop(String brand, String model, String processorType){
        this.brand = brand;
        this.model = model;
        this.processorType = processorType;
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

    public String getprocessorType(){
        return processorType;
    }

    public void setprocessorType(String processorType){
        this.processorType = processorType;
    }

    //Override method to display Smartphone information
    @Override 
    public void turnOn(){
        System.out.println("Laptop Information: " + brand + " " + model);
        System.out.println("Processor: " + processorType);
    }


}//end of public class
