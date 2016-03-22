
public abstract class Duck {
	//interfaces that handle vary behaviors
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	//Constructor
	public Duck(){};
	
	
	//methods to initiate the vary behaviors
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	//setters
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
	//common behaviors
	public void swim(){
		System.out.println("All ducks can swim!");
	};

	public void display(){
		System.out.println("All ducks looks great!");
	};
}
