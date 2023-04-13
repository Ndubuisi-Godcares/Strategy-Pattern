package Duck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
    @Override
    public void display()
    {
        System.out.println("I am Mallard Duck");
    }

}
