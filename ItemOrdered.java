public class ItemOrdered 
{
    private String item;
    private int quantity;
    
    public ItemOrdered(String item, int quantity)
    {
        this.item=item;
        this.quantity=quantity;
    }

    public String getitem() 
    {return item;}
    public void setitem(String newitem)
    {this.item = newitem;}
    public int getquantity() 
    {return quantity;}
    public void setquantity(int quantity)
    {this.quantity = quantity;}
}

