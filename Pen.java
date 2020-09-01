class Pen extends Item
{   
    String colour;
    double tipSize;
    boolean withCup;
    String brand;
    
    public Pen(String name, double price, String description, int stock, int id, String colour, double tipSize, boolean withCup, String brand)
    {
        super(name, price, description, stock, id);
        this.colour=colour;
        this.tipSize=tipSize;
        this.withCup=withCup;
        this.brand=brand;
    }
    
    
    public void setColour(String c)
    {
        this.colour = c;
    }
    public String getColour()
    {
        return colour;
    }
    public void setTipSize(double ts)
    {
        this.tipSize = ts;
    }
    public double getTipSize()
    {
        return tipSize;
    }
    public void setWithCup(boolean wc)
    {
        this.withCup = wc;
    }
    public boolean getWithCup()
    {
        return withCup;
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
        if (withCup == true)
        {
            return " Pen's colour is: " + colour + ", " + " Pen's tip size is: " + tipSize + "mm, " + " Pen is with cup , " + " Pen's brand is: " + brand + ".";
        }
        else
        {
            return " Pen's colour is: " + colour + ", " + " Pen's tip size is: " + tipSize + "mm, " + " Pen is not with cup , " + " Pen's brand is: " + brand + ".";
        }
    }
    public String toString()
    {
         return super.getBasicInfo() + getDetails();
    }
}



