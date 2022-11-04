package exceptionHandling;

public class threadSleep {
public static void main(String[] args) throws InterruptedException  {//checked exception
	System.out.println("Hello I am Yogesh");
	Thread.sleep(4000);//It will wait for 4 sec's to print following statement
	System.out.println("How are you?");
}
}
