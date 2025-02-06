// Java program to illustrate the concept of association

public class Bank {

    private String name;

    //Bank name
    Bank(String name)
    {
        this.name = name;
    }

    public String getBankName()
    {
        return this.name;
    }
}
