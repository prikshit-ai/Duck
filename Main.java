public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        System.out.println("***************");
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performSwim();
        mallardDuck.performFly();

        System.out.println("***************");
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performSwim();
        redheadDuck.performFly();

        System.out.println("***************");
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        rubberDuck.performFly();

        System.out.println("***************");
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performSwim();
        decoyDuck.performFly();
        System.out.println("***************");
    }
}
