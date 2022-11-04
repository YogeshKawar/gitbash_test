package overloadingAndOverriding;

public class methodOverrides {
public static void main(String[] args) {
	Animal a = new Animal();
	a.animalTalk();
	
	Cat c = new Cat();
	c.animalTalk();
	
	Dog d = new Dog();
	d.animalTalk();
}
}