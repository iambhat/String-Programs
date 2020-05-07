package strings;

public class ReverseTheString {

	public static void main(String[] args) {

		String str = "MyString";
		
		//using iterative method
		
		char[] strArray = str.toCharArray();
		System.out.println("Iterative Method : ");
		for(int i = strArray.length - 1; i >= 0; i--)
			System.out.print(strArray[i]);
		
		//using recursion method
		
		System.out.println("\n===================\nRecusive Method : "+recursiveMethod(str));
	}

	private static String recursiveMethod(String str) {

		if(str == null || (str.length() <= 1)) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
