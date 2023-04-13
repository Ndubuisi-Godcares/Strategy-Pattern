package Duck;

public class RubberDuck extends Duck{
    public  RubberDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new FLoat();
    }
    @Override
    public void display()
    {
        System.out.println("I am ReadHead Duck");
    }

}
