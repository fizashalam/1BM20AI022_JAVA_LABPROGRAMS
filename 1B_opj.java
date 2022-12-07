class Car
{
    private int model,speed;
    private String make;
    Car(int model1,int speed1,String make1)
    {
        this.model = model1;
        this.speed = speed1;
        this.make = make1;
    }
    int get_model()
    {
        return model;
    }
    int get_speed()
    {
        return speed;
    }
    String get_make()
    {
        return make;
    }
    void accelerate()
    {
        this.speed += 5;
    }
    void brake()
    {
        this.speed -= 5;
    }
}

public class program1b
{
    public static void main(String args[])
    {
        Car obj = new Car(2020,120,"Mercedes");
        System.out.println("Model : " + obj.get_model());
        System.out.println("Speed : " + obj.get_speed());
        System.out.println("Make : " + obj.get_make());
        for(int i=1;i<=5;i++)
        {
            obj.accelerate();
            System.out.println("Speed after acceleration : " + obj.get_speed());
        }
        for(int i=1;i<=5;i++)
        {
            obj.brake();
            System.out.println("Speed after braking : " + obj.get_speed());
        }
    }
}
