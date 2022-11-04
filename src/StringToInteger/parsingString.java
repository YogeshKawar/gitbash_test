package StringToInteger;

public class parsingString {
public static void main(String[] args) {
String str = "ZA5467";
str = str.replaceAll("[^0-9]", "");
int val = Integer.parseUnsignedInt(str);
System.out.println("Value: "+val);
}
}