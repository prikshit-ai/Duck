public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new CanSwim();
        flyBehaviour = new CanFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }
}
