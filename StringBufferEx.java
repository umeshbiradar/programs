package assigment8;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer("umesh");
		System.out.println(stringBuffer.append("biradar"));
		System.out.println(stringBuffer.append(23));
		System.out.println(stringBuffer.append(46.7));
		System.out.println(stringBuffer.append("B"));
		System.out.println(stringBuffer.insert(1,"biradar"));
		System.out.println(stringBuffer.replace(0,4,"appu"));
		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer.charAt(2));
		System.out.println(stringBuffer.delete(4,11));
		System.out.println(stringBuffer.deleteCharAt(4));
		
		System.out.println(stringBuffer.append(55.9f));
		System.out.println(stringBuffer.insert(4,23));
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.toString());
		System.out.println(stringBuffer.substring(4));
		System.out.println(stringBuffer.length());
		
		

	}

}
