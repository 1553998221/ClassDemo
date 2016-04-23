package dog;

public class Master {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("Õ˙≤∆");
		myDog.setAge(4);
		String b = myDog.bark();
		System.out.println(b);
		String f = "qwe";
		myDog.eat(f);
		myDog.sleep();
		
		
		String myName = "’≈»˝";
		
		System.out.println(sayHello(myName));
		
		Pig pig = new Pig();
		pig.setName("÷Ì÷Ìœ¿");
		String s = "÷Ì»‚";
		pig.eat(s);
	}
	public static String sayHello(String name){
		return "Hello "+name;
	}
}
