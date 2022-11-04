package This_Keyword;

public class This_Keyword {
int a=60;
public void access_Variable()
{
	int a=40;
	System.out.println("Local Variable :" +a);
	System.out.println("Global Variable :" +this.a);
}
}
