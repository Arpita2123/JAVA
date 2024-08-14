
class Mobile
{
    //instance variables
    String brand;
    int price;
    //static varible
    static String name;
    void show()
{
    System.out.println("Brand is "+brand);
    System.out.println("Price is "+price);
    System.out.println("Name is "+name);
    System.out.println();
}
}

class Demo_Interface
{
    public static void main(String args[])
    {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.brand="MI";
        m1.price=13000;
        m1.name="Phone";
        m1.show();
        m2.brand="Samsung";
        m2.price=15000;
        m2.name="Smart_Phone";
        m2.show();
        m1.name="Mobile_Phone";
        m1.show();
        m2.show();
        
    }
}
