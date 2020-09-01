import java.util.*;
public abstract class Item  
{
    private String name;
    private double price;
    private String description;
    private int stock;
    private int id;
    
    public Item(String name, double price, String description, int stock, int id)
    {
        this.name=name;
        this.price=price;
        this.description=description;
        this.stock=stock;
        this.id=id;
    }
    
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public String getDescription()
    {
        return description;
    }
    public int getStock()
    {
        return stock;
    }
    public int getId()
    {
        return id;
    }
    
        
    public String getBasicInfo()
    {
        return ("Item's name: " + name + ", " + " Item's price: "  + price + ", " + 
        " Item's description: " + description + ", " + " Item's stock: " + stock + ", " + " Item's id: " + id + ".");
    }
    
    public abstract String getDetails();
    
    public String toString()
    {
         return getBasicInfo();
    }
}

      