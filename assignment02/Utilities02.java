package assignment02;

import java.util.Arrays;
import java.util.Optional;

public class Utilities02 {
	public static int countNulls(Object[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}

		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				counter++;
			}
		}
		return counter;
	}

	public static int countSpaces(String str) {
		int count = -1;
		if(str != null) {
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int countSpaces2(String str) {
		int count = -1;
		if(str != null) {
			char[] arr = str.toCharArray(); //arr[0] = 't', array[1] = ' '
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(arr[i] == ' ') { 
					count++;
				}
			}
		}
		return count;
	}
	
	public static String first(String str) { 
		String returnVal = null;
		if(str != null) {
			returnVal = str.trim();
			int i = returnVal.indexOf(' '); //char = ''
			if(i >= 0) {
				returnVal = returnVal.substring(0,i);
			}
		}
		return returnVal;
	}
	
	public static String rest(String str) {
		String returnVal = null;
		if(str != null) {
			returnVal = str.trim();
			int i = returnVal.indexOf(' ');
			if(i >= 0) {
				returnVal = returnVal.substring(i+1).trim();
			} else {
				returnVal = "";
			}
		}
		return returnVal;
	}
	
	public static String withoutExtraSpaces(String str) {
		String returnVal = null;
		if(str != null) {
			returnVal = str.trim(); 
			int len1 = 0; 
			int len2 = 0;
			do {
				len1 = returnVal.length();
				returnVal = returnVal.replace("  ", " ");
				len2 = returnVal.length();
			} while(len2 < len1); //does the code one time and then checks to see if it should keep running based on the while loop
		}
		return returnVal;
	}
		
	public static String[] splitOnSpaces(String str) {
		int len = countSpaces(withoutExtraSpaces(str));
		String[] returnVal = null;
		if(len >= 0) {
			if(str.trim().length() == 0) {
				returnVal = new String[0];
			} else {
				returnVal = new String[len+1];
				for(int i=0; i < returnVal.length; i++) {
					returnVal[i] = first(str);
					str = rest(str);
				}
			}
		}
		return returnVal;
	}

	public static int[] strLengths(String str) {
		String[] words = splitOnSpaces(str);
		int[] strLengths;
		
		if(words == null) {
			strLengths = null;
		} else if(words.length == 0) {
			strLengths = new int[0];
		} else {
			strLengths = new int[words.length];
			for(int i = 0; i < words.length; i++) {
				strLengths[i] = words[i].length();
			}
		}
		return strLengths;
	}
	
	public static Optional<String[]> splitOnSpaces1(String str) {
		String[] returnVal = null;
		if (str != null && str.trim().length() > 0) {
			returnVal = new String[str.length()];
			int index = 0;
			while(str.length() > 0) {
				returnVal[index] = first(str);
				str = rest(str);
				index++;
			}
			returnVal = Arrays.copyOf(returnVal, index);
			return Optional.of(returnVal);
		}
		return Optional.empty();
	}
}