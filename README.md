# Duck_Behavior

# Duck Simulation Java Project

This Java project simulates the behavior of different types of ducks using interfaces, abstract classes, and concrete classes. The project includes the following components:

## Interfaces

### QuackBehavior

- `Quack`: A class that implements the `QuackBehavior` interface and represents the behavior of a duck that quacks.
- `Squeak`: A class that implements the `QuackBehavior` interface and represents the behavior of a duck that squeaks.
- `MuteQuack`: A class that implements the `QuackBehavior` interface and represents the behavior of a duck that does not quack.

### FlyBehavior

- `FlyWithWings`: A class that implements the `FlyBehavior` interface and represents the behavior of a duck that can fly with wings.
- `FlyNoWay`: A class that implements the `FlyBehavior` interface and represents the behavior of a duck that cannot fly.

## Abstract Class

### Duck

- `Duck`: An abstract class that serves as the base class for different types of ducks. It includes common methods and fields related to ducks, such as `quack()`, `swim()`, and `displayInfo()`. This class also has a reference to `QuackBehavior` and `FlyBehavior` interfaces, which allows ducks to have different quack and fly behaviors.

## Concrete Classes

- `MallardDuck`: A class that extends the `Duck` abstract class and represents a mallard duck.
- `RedheadDuck`: A class that extends the `Duck` abstract class and represents a redhead duck.
- `RubberDuck`: A class that extends the `Duck` abstract class and represents a rubber duck.
- `DecoyDuck`: A class that extends the `Duck` abstract class and represents a decoy duck.

## SwimBehavior

- `Swim`: A class that implements the `SwimBehavior` interface and represents the behavior of a duck that can swim.
- `Float`: A class that implements the `SwimBehavior` interface and represents the behavior of a duck that can float.
- `Drown`: A class that implements the `SwimBehavior` interface and represents the behavior of a duck that cannot swim.

## Main Class

- `Main`: A class that contains the `main()` method and serves as the entry point of the program. It demonstrates how different ducks can exhibit different behaviors based on their concrete implementations of the `QuackBehavior`, `FlyBehavior`, and `SwimBehavior` interfaces.

## Usage

You can use the classes and interfaces in this project to simulate the behavior of different types of ducks in your Java program. 
