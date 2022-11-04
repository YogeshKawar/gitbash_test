package String;
public class UpperString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="you are very intelligent";
		String str=s1.replace(" ","");
		System.out.println(str);
		String s2=str.substring(0,1).toUpperCase();
		String s3=s2+str.substring(1);
		System.out.println(s3);
		
	}
}
		
