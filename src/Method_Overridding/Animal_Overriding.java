package Method_Overridding;

public class Animal_Overriding {
public static void main(String[] args) {
	Animal m =new Animal();
	m.animalsTalk();
	
	Dog d =new Dog();
	d.animalsTalk();
	
	Cat c =new Cat();
	c.animalsTalk();
}
}
