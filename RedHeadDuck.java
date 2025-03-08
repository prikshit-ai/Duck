public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new CanSwim();
        flyBehaviour = new CanFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }
}
