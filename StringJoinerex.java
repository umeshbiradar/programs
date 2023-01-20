package assigment8;

import java.util.StringJoiner;

public class StringJoinerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner(":","[","]");
		sj.add("umesh").add("balaji").add("biradar");
		String desiredString=sj.toString();
		System.out.println(desiredString);
		System.out.println(sj.length());
		System.out.println(sj.merge(sj));

	}

}
