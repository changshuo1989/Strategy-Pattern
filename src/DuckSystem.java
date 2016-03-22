
public class DuckSystem {

	public static void main(String[] args) {
		
		Duck mallardDuck =new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.display();
		mallardDuck.swim();
	}

}
