package This_Keyword;

public class ThisKeyword {
String name = "Global Variable";

public void accessLocalVar() {
	String name = "Local Variable";
	System.out.println("Access Local Variable :" +name);
	System.out.println("Access Global Variable :" +this.name);
}
}
