package practice5;

public class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}
}
