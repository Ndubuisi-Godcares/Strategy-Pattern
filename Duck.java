package Duck;

import java.util.Queue;

public abstract class Duck
{
    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    SwimBehaviour swimBehaviour;

    abstract public void display();

    public void setFlyBehaviour(FlyBehaviour fb)
    {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }
    public void performQuack()
    {
        flyBehaviour.fly();
    }
    public void performFly()
    {
        quackBehaviour.quack();
    }
    public void performSwim()
    {
        swimBehaviour.swim();
    }
}
