public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new CanSwim();
        flyBehaviour = new CanFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
