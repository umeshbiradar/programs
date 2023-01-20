package assigment8;
import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String string=new String(sc.next());
		System.out.println(string.length());
		System.out.println("compare: " + string.compareTo("harhar"));
		System.out.println("concat: " + string.concat("mahadev"));
		System.out.println( string.substring(3));
		System.out.println( string.contains("ha"));
		System.out.println( string.endsWith("ev"));
		System.out.println(string.codePointAt(2));
		System.out.println(string.codePointBefore(2));
		System.out.println(string.codePointCount(1,2));
		System.out.println(string.contentEquals("umesh"));
		System.out.println(string.repeat(3));
		System.out.println(string.getBytes());
		System.out.println(string.indexOf("m"));
		System.out.println(string.indexOf("m",3));
		System.out.println(string.lastIndexOf("m"));
		System.out.println(string.getBytes());
		System.out.println(string.indexOf("m"));
		System.out.println(string.indexOf("m",3));
		System.out.println(string.lastIndexOf("m"));
		System.out.println(string.indexOf("dev"));
		System.out.println(string.isEmpty());
		System.out.println(string.replace("s","a"));
		System.out.println(string.replaceAll("umesh","biradar"));
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		
		
		
		

	}

}
