package dog;

public class Master {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("����");
		myDog.setAge(4);
		String b = myDog.bark();
		System.out.println(b);
		String f = "qwe";
		myDog.eat(f);
		myDog.sleep();
		
		String myName = "����";
		
		System.out.println(sayHello(myName));
		
		Pig pig = new Pig();
		pig.setName("������");
		String s = "����";
		pig.eat(s);
		
		Cat cat = new Cat();
		String c = cat.bark();
		System.out.println(c);
		
		Pig pig1 = new Pig();
		String d = pig.bark();
		System.out.println(d);
	}
	public static String sayHello(String name){
		return "Hello "+name;
	}
}
