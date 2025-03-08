Duck Simulation Program (Strategy Pattern) 🦆

Overview
This program demonstrates the Strategy Design Pattern using a Duck simulation.

The behavior of ducks (flying, quacking, and swimming) is encapsulated into separate interfaces and can be dynamically assigned to different duck types.

Concepts Used
Object-Oriented Programming (OOP)
Abstraction
Inheritance
Polymorphism
Strategy Design Pattern
Encapsulation of behaviors as separate classes
Ability to change behavior dynamically
Interfaces & Abstract Classes
FlyBehaviour, QuackBehaviour, SwimBehaviour (Interfaces)
Duck (Abstract Class)
Program Structure
Abstract Class Duck
Defines common behavior for all ducks
Contains references to behavior interfaces (FlyBehaviour, QuackBehaviour, SwimBehaviour)
Methods to perform or change behaviors dynamically
Encapsulated Behaviors
Fly Behaviors
CanFly → Ducks that can fly
NoFly → Ducks that cannot fly
Quack Behaviors
Quack → Ducks that quack normally
Squeak → Rubber ducks squeak
Swim Behaviors
CanSwim → Ducks that can swim
CanFloat → Rubber ducks float
Concrete Duck Types
MallardDuck → Can fly, swim, and quack
RedheadDuck → Similar to Mallard but visually different
RubberDuck → Floats, squeaks, but does not fly
DecoyDuck (not included in the initial code but can be added)
How It Works
Each duck inherits from Duck and is assigned specific behaviors.
The behaviors are interchangeable at runtime using setter methods.
The Main.java file creates different duck objects and demonstrates their actions.
Files in the Program
Main.java → Runs the simulation
Duck.java → Abstract class defining common duck properties
MallardDuck.java, RedheadDuck.java, RubberDuck.java → Concrete duck types
FlyBehaviour.java, CanFly.java, NoFly.java → Interfaces and implementations for flying
QuackBehaviour.java, Quack.java, Squeak.java → Interfaces and implementations for quacking
SwimBehaviour.java, CanSwim.java, CanFloat.java → Interfaces and implementations for swimming
