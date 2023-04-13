package Duck;

public class RedHeadDuck extends Duck{
    public  RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
    @Override
    public void display()
    {
        System.out.println("I am ReadHead Duck");
    }

}
