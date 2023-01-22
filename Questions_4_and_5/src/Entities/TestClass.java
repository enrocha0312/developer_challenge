package Entities;

public class TestClass {
	private String s;
	private String t;
	private int k;
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getT() {
		return t;
	}
	public TestClass() {
		
	}
	public TestClass(String s, String t, int k) {
		this.s = s;
		this.t = t;
		this.k = k;
	}
	public void setT(String t) {
		this.t = t;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
	
	public int calculateNumberOfOperations(String s1, String s2) {
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
	
	public boolean wordContainsNumberOrSpecialCharacters(String word) {
		for(int i=0; i<word.length(); i++) {
			char verifiedCharacter = word.charAt(i);
			if(Character.isDigit(verifiedCharacter)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean wordContainsUpperCase(String word) {
		for(int i=0; i<word.length(); i++) {
			char verifiedCharacter = word.charAt(i);
			if(Character.isUpperCase(verifiedCharacter)) {
				return true;
			}
		}
		return false;
	}
	
	public String ConcatRemove (String s, String t, int k) {
		if(wordContainsUpperCase(s)||wordContainsUpperCase(t)) {
			return "Unless one of the words contains UpperCase. You"
					+ " should type two words with only LowerCase";
		}
		if(wordContainsNumberOrSpecialCharacters(s)||wordContainsNumberOrSpecialCharacters(t)) {
			return "Unless one of the words contains a special and Invalid Digit";
		}
		if((k<1)||(k>100)){
			return "k can't be greather than 100 or lower than 1";
		}
		if(calculateNumberOfOperations(s,t)>k) {
			return "NO";
		}else
		{
			return "YES";
		}
	}
}
