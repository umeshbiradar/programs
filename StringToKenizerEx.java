package assigment8;

import java.util.StringTokenizer;

public class StringToKenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("apple mango banana" ,"/");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
