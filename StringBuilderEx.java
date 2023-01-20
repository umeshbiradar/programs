package assigment8;

public class StringBuilderEx {

	
		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringBuilder stringBuilder=new StringBuilder("umesh");
				System.out.println(stringBuilder.append("biradar"));
				System.out.println(stringBuilder.append(23));
				System.out.println(stringBuilder.append(46.7));
				System.out.println(stringBuilder.append("B"));
				System.out.println(stringBuilder.insert(1,"dost"));
				System.out.println(stringBuilder.replace(0,4,"bestfriend"));
				System.out.println(stringBuilder.capacity());
				System.out.println(stringBuilder.charAt(2));
				System.out.println(stringBuilder.delete(4,11));
				System.out.println(stringBuilder.deleteCharAt(4));
				
				System.out.println(stringBuilder.append(12.9f));
				System.out.println(stringBuilder.insert(3,29));
				System.out.println(stringBuilder.length());
				System.out.println(stringBuilder.reverse());
				System.out.println(stringBuilder.toString());
				System.out.println(stringBuilder.substring(3));
				System.out.println(stringBuilder.length());
				

			}

		


	}


