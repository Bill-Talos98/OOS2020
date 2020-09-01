public class Pencil extends Item 
{
    double tipSize;
    String type;
    boolean isMechanical;
    String brand;
    
    public Pencil(String name, double price, String description, int stock, int id, double tipSize, String type, boolean isMechanical, String brand)  
    {
        super(name, price, description, stock, id);
        this.tipSize=tipSize;
        this.type=type;
        this.isMechanical=isMechanical;
        this.brand=brand;
    }
    
    public void setTipSize(double ts)
    {
        this.tipSize = ts;
    }
    public double getTipSize()
    {
        return tipSize;
    }
    public void setType(String t)
    {
        this.type = t;
    }
    public String getType()
    {
        return type;
    }
    public void setIsMechanical(boolean im)
    {
        this.isMechanical = im;
    }
    public boolean getIsMechanical()
    {
        return isMechanical;
    }
    public void setBrand(String b)
    {
        this.brand = b;
    }
    public String getBrand()
    {
        return brand;
    }
    
    
    public String getDetails()
    {
        if (isMechanical == true)
        {
            return " Pencil's tip size is: " + tipSize + "mm, " + " Pencil's type: " + type + ", " + " Pencil is mechanical.";
        }
        else
        {
            return " Pencil's tip size is: " + tipSize + "mm, " + " Pencil's type: " + type + ", " + " Pencil is not mechanical.";
        }
    }
    
    public String toString()
    {
         return super.getBasicInfo() + getDetails();
    }
}
    
    
    
