abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    // Abstract display method to be implemented by subclasses
    abstract public void display();
}
