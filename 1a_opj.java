class retail_item
{
    private String description;
    private int units,price;
    retail_item(String desc,int u,int p)
    {
        this.description = desc;
        this.units = u;
        this.price = p;
    }
    String getDesc()
    {
        return description;
    }
    int getUnits()
    {
        return units;
    }
    int getPrice()
    {
        return price;
    }
    void display()
    {
        System.out.println("In Method");
        System.out.println("Description :" + this.description);
        System.out.println("Units :" + this.units);
        System.out.println("Price :" + this.price);
    }
}

public class program1a
{
    public static void main(String args[])
    {
        retail_item obj1 = new retail_item("Biscuit",10,10);
        obj1.display();
        System.out.println("Description = "+ obj1.getDesc());
        System.out.println("Units = "+ obj1.getUnits());
        System.out.println("Price = "+ obj1.getPrice());
    }
}
