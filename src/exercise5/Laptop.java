package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author yasiro01
 */
public class Laptop {
    private String manufacturer;
    private double price;
    private String color;
    
    public Laptop(String manufacturer, double price, String color){
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double setPrice(double newPrice){
        price = newPrice;
        return price;
    }
    
    public String setColor(String newColor){
        color = newColor;
        return color;
    }
    
    @Override
    public String toString(){
        return String.format("%s laptop by %s costs $%.2f", color, manufacturer, price);
    }
}
