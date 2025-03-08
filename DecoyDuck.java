public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new CanFloat();
        flyBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck");
    }
}
