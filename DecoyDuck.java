package Duck;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drown();
    }
    @Override
    public void display()
    {
        System.out.println("I am Decoy Duck");
    }

}
