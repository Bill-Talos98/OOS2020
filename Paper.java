public class Paper extends Item
{
    int weight = 0;
    int pages = 0;
    boolean isEcological = true;
    
    public Paper(String name, double price, String description, int stock, int id, int weight, int pages, boolean isEcological)
    {
        super(name, price, description, stock, id);
        this.weight=weight;
        this.pages=pages;
        this.isEcological=isEcological;
    }
    
    public void setWeight(int w)
    {
        this.weight = w;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setPages(int p)
    {
        this.pages = p;
    }
    public int getPages()
    {
        return pages;
    }
    public void setIsEcological(boolean ie)
    {
        this.isEcological = ie;
    }
    public boolean getIsEcological()
    {
        return isEcological;
    }
    
    public String getDetails()
    {
        if (isEcological == true)
        {
            return " Paper's weight is: " + weight + ", " + " Paper's pages are: " + pages + ", " + " Paper is ecological.";
        }
        else
        {
            return " Paper's weight is: " + weight + ", " + " Paper's pages are: " + pages + ", " + " Paper is not ecological.";
        }
    }
    public String toString()
    {
         return super.getBasicInfo() + getDetails();
    }
    
}