package assigment8;
import java.util.Scanner;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//datatype[] refvariablename=new datatype[];
				//static array
				//datatype variablename={values};
				//dynamic array
				//datatype[] refvariablename=new datatype[size];

			float[] marks={21.3f,45.87f,76.87f,65.67f};
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[2]);
			System.out.println(marks[3]);
			System.out.println("using loops");
			Object scanner;
			for(int i=0;i<4;i++)
			{
				System.out.println(marks[i]);
			}
				Scanner scanner1=new Scanner(System.in);
				int[] age= {0,0,0};
				for(int i=0;i<age.length;i++)
				{
		       age[i]=scanner1.nextInt();
				}
				for(int i=0;i<age.length;i++)
				{
					
			
					System.out.println(marks[i]);

					
				}
			}
			}
			
			
			
			
			

	


