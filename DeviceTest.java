import java.util.ArrayList;
public class DeviceTest {
   public static void main(String[] args) {
    
   //Creating 2 Smartphone objects
   Device phone = new Smartphone("Samsung", "GalaxyS24", 7.1);
   Device phone2 = new Smartphone("Apple", "iPhone 15", 6.4);

   //Creating 2 Laptop objects
   Device laptop = new Laptop("Dell", "XPS", "Intel Core i7");
   Device laptop2 = new Laptop("Apple", "MacBook Air", "Apple M5");
   
   //ArrayList to store created objects
   ArrayList devices = new ArrayList<>();
   devices.add(phone);
   devices.add(phone2);
   devices.add(laptop);
   devices.add(laptop2);

   for (Device device : devices){
    device.turnOn();
    System.out.println();
   }

   }//end of main method
}//end of public class
