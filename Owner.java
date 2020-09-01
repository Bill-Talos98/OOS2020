class Owner extends User
{
    private boolean isAdmin;
    public Owner(String Name, String Surname, String Email, int UserId, String Town, String Address, int NumberOfAddress, int TK, boolean isAdmin)
    {
        super(Name, Surname, Email, UserId, Town, Address, NumberOfAddress, TK);
        this.isAdmin = isAdmin;
    }
    public void setIsAdmin(boolean s)
    {this.isAdmin = s;}
    public boolean getIsAdmin()
    {return isAdmin;}
}