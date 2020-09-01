public abstract class User 
{
    private String Name;
    private String Surname;
    private String Email;
    private int UserId;
    private String Town;
    private String Address;
    private int NumberOfAddress;
    private int TK;
    public User(String Name, String Surname, String Email, int UserId, String Town, String Address, int NumberOfAddress, int TK)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Email = Email;
        this.UserId = UserId;
        this.Town = Town;
        this.Address = Address;
        this.NumberOfAddress = NumberOfAddress;
        this.TK = TK;
    } 
    
    public String getName()
    {return Name;}
    public String getSurname()
    {return Surname;}
    public String getEmail()
    {return Email;}
    public int getUserId()
    {return UserId;}
    public String getTown()
    {return Town;}
    public String getAddress()
    {return Address;}
    public int getNumberOfAddress()
    {return NumberOfAddress;}
    public int getTK()
    {return TK;}
}
    
    
    
