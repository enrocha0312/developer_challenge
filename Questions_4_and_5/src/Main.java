import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the starting string \n");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("Type the desired string \n");
		String t = sc.next();
		System.out.println("Type a number k \n");
		int k = sc.nextInt();
		
		ConcatRemove(s,t,k);
	}
	
	
	public static int calculateNumberOfOperations(String s1, String s2) {
		if(s1.equals(s2)) return 0; //if the strings are equal, return
		if(s1.contains(" "))s1 = s1.trim().replaceAll(" ", ""); //so, "bla bla bla bla" = blablablabla
		if(s2.contains(" "))s2 = s2.trim().replaceAll(" ", "");
		int i=0, totalRemove=0, totalConcat=0;
		if(s1.length() == s2.length()) {
			while(s1.charAt(i) == s2.charAt(i) && i<s1.length()) {
				++i;
			}
			totalRemove = s1.length()-i;
			totalConcat = totalRemove;
		}

		int minString = Math.min(s1.length(), s2.length());
		int maxString = Math.max(s1.length(), s2.length());
		//now blablablabla>blablabcde 
		if(s1.length()>s2.length()) {
			while(s1.charAt(i) == s2.charAt(i) && i<minString) {
				++i; //compares until the character 6, length 7
			}
		totalRemove = maxString - i; //12-7 = 5
		totalConcat = minString - i; //10-7 = 3
		
		}
		if(s2.length()>s1.length()) {
			while(s1.charAt(i) == s2.charAt(i) && i<minString) {
				++i;
			}
		totalRemove = minString - i;
		totalConcat = maxString - i;
		}

		return totalRemove + totalConcat;
	}
	
	
	public static boolean wordContainsNumberOrSpecialCharacters(String word) {
		for(int i=0; i<word.length(); i++) {
			char verifiedCharacter = word.charAt(i);
			if(Character.isDigit(verifiedCharacter)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean wordContainsUpperCase(String word) {
		for(int i=0; i<word.length(); i++) {
			char verifiedCharacter = word.charAt(i);
			if(Character.isUpperCase(verifiedCharacter)) {
				return true;
			}
		}
		return false;
	}
	
	public static void ConcatRemove (String s, String t, int k) {
		if(wordContainsUpperCase(s)||wordContainsUpperCase(t)) {
			System.out.println("Unless one of the words contains UpperCase. You"
					+ " should type two words with only LowerCase");
			return;
		}
		if(wordContainsNumberOrSpecialCharacters(s)||wordContainsNumberOrSpecialCharacters(t)) {
			System.out.println("Unless one of the words contains a special and Invalid Digit");
			return;
		}
		if((k<1)||(k>100)){
			System.out.println("k can't be greather than 100 or lower than 1");
			return;
		}
		if(calculateNumberOfOperations(s,t)>k) {
			System.out.println("NO");
		}else
		{
			System.out.println("YES");
		}
	}
}
