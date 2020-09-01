public class Notebook extends Item
{
    int sections;
    String typeOfPaper;
    String typeOfNotebook;
    
    public Notebook(String name, double price, String description, int stock, int id, int sections, String typeOfPaper, String typeOfNotebook)
    {
        super(name, price, description, stock, id);
        this.sections=sections;
        this.typeOfPaper=typeOfPaper;
        this.typeOfNotebook=typeOfNotebook;
    }
    
    public void setSections(int s)
    {
        this.sections = s;
    }
    public int getSections()
    {
        return sections;
    }
    public void setTypeOfPaper(String top)
    {
        this.typeOfPaper = top;
    }
    public String getTypeOfPaper()
    {
        return typeOfPaper;
    }
    public void setTypeOfNotebook(String ton)
    {
        this.typeOfNotebook = ton;
    }
    public String getTypeOfNotebook()
    {
        return typeOfNotebook;
    }
   
    public String getDetails()
    {
        return " Notebook has " + sections + " sections, " + " Notebook's type of paper is: " + typeOfPaper + ", " + " Notebook's type is: " + typeOfNotebook + ".";
    }
    
    public String toString()
    {
         return super.getBasicInfo() + getDetails();
    }
}

 