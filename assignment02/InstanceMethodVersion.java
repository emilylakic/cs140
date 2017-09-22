package assignment02;

public class InstanceMethodVersion {
	private String string;
	
	public InstanceMethodVersion(String str) {
		string = str;
	}
	
	public int countSpaces() {
		int count = -1;
		if(string != null) {
			count = 0;
			for (int i = 0; i < string.length(); i++) {
				if(string.charAt(i) == ' ') {
					count++;
				}
			}
		}
		return count;
	}
	
	public int countSpaces2() {
		int count = -1;
		if(string != null) {
			char[] arr = string.toCharArray(); //arr[0] = 't', array[1] = ' '
			count = 0;
			for (int i = 0; i < string.length(); i++) {
				if(arr[i] == ' ') { 
					count++;
				}
			}
		}
		return count;
	}
	
	public String withoutExtraSpaces() {
		String returnVal = null;
		if(string != null) {
			returnVal = string.trim(); 
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
	
	public String first() { 
		String returnVal = null;
		if(string != null) {
			returnVal = string.trim();
			int i = returnVal.indexOf(' '); //char = ''
			if(i >= 0) {
				returnVal = returnVal.substring(0,i);
			}
		}
		return returnVal;
	}
	
	public String rest() {
		String returnVal = null;
		if(string != null) {
			returnVal = string.trim();
			int i = returnVal.indexOf(' ');
			if(i >= 0) {
				returnVal = returnVal.substring(i+1).trim();
			} else {
				returnVal = "";
			}
		}
		return returnVal;
	}
	
	public String[] splitOnSpaces() {
		InstanceMethodVersion temp = new InstanceMethodVersion(withoutExtraSpaces());
		int len = temp.countSpaces();
		String[] returnVal = null;
		if(len >= 0) {
			if(string.trim().length() == 0) {
				returnVal = new String[0];
			} else {
				returnVal = new String[len+1];
				temp = new InstanceMethodVersion(string.trim());
				for(int i=0; i < returnVal.length; i++) {
					returnVal[i] = temp.first();
					temp = new InstanceMethodVersion(temp.rest());
				}
			}
		}
		return returnVal;
	}
	
	public int[] strLengths() {
		String[] words = splitOnSpaces();
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
}
