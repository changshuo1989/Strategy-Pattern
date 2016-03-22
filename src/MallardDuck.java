
public class MallardDuck extends Duck {
	
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior=new Quack();
	}
	public void display(){
		System.out.println("Looks like a mallard duck");
	}
	public void swim(){
		System.out.println("Swim like a mallard duck");
	}
}
