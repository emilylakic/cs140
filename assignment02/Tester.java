package assignment02;

import java.util.Arrays;
import java.util.Optional;

public class Tester {
	public static void main(String[] args) {
		//Tests for countNulls
		System.out.println("---------- countNulls --------------");
		System.out.println("Expected value: 0");
		System.out.println(Utilities02.countNulls(null)+"\n");
		
		Object[] test = {}; 
		System.out.println("Expected value: 0");
		System.out.println(Utilities02.countNulls(test)+"\n");
		
		System.out.println("Expected value: 2");
		System.out.println(Utilities02.countNulls(new Integer[] {null,1,null,2})+"\n");
		
		//Tests for countSpaces & countSpaces2
		System.out.println("---------- countSpace & countSpace2 --------------");
		System.out.println("Expected value: -1");
		System.out.println("countSpaces: "+Utilities02.countSpaces(null));
		System.out.println("countSpaces2: "+Utilities02.countSpaces2(null)+"\n");
		
		System.out.println("Expected value: 0");
		System.out.println("countSpaces: "+Utilities02.countSpaces(""));
		System.out.println("countSpaces2: "+Utilities02.countSpaces2("")+"\n");
		
		System.out.println("Expected value: 0");
		System.out.println("countSpaces: "+Utilities02.countSpaces("testnospaces"));
		System.out.println("countSpaces2: "+Utilities02.countSpaces2("testnospaces")+"\n");
		
		System.out.println("Expected value: 2");
		System.out.println("countSpaces: "+Utilities02.countSpaces("test with spaces"));
		System.out.println("countSpaces2: "+Utilities02.countSpaces2("test with spaces")+"\n");
		
		//Tests for first
		System.out.println("---------- first --------------");
		System.out.println("Expected value: null");
		System.out.println(Utilities02.first(null)+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.first("")+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.first("     ")+"\n");
		
		System.out.println("Expected value: \"test\"");
		System.out.println(Utilities02.first("  test  ")+"\n");
		
		System.out.println("Expected value: \"test\"");
		System.out.println(Utilities02.first("test  ")+"\n");
		
		System.out.println("Expected value: \"this\"");
		System.out.println(Utilities02.first("  this is a test  ")+"\n");
		
		System.out.println("Expected value: \"this\"");
		System.out.println(Utilities02.first("this is a test  ")+"\n");
		
		//Tests for rest
		System.out.println("---------- rest --------------");
		System.out.println("Expected value: null");
		System.out.println(Utilities02.rest(null)+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.rest("")+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.rest("     ")+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.rest("  test  ")+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.rest("test  ")+"\n");
		
		System.out.println("Expected value: \"is a test\"");
		System.out.println(Utilities02.rest("  this is a test  ")+"\n");
		
		System.out.println("Expected value: \"is a test\"");
		System.out.println(Utilities02.rest("this is a test  ")+"\n");
		
		//Tests for withoutExtraSpaces
		System.out.println("---------- withoutExtraSpaces --------------");
		System.out.println("Expected value: null");
		System.out.println(Utilities02.withoutExtraSpaces(null)+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.withoutExtraSpaces("")+"\n");
		
		System.out.println("Expected value: \"\"");
		System.out.println(Utilities02.withoutExtraSpaces("     ")+"\n");
		
		System.out.println("Expected value: \"test\"");
		System.out.println(Utilities02.withoutExtraSpaces("  test  ")+"\n");
		
		System.out.println("Expected value: \"test\"");
		System.out.println(Utilities02.withoutExtraSpaces("test  ")+"\n");
		
		System.out.println("Expected value: \"this is a test\"");
		System.out.println(Utilities02.withoutExtraSpaces("  this   is a   test  ")+"\n");
		
		System.out.println("Expected value: \"this is a test\"");
		System.out.println(Utilities02.withoutExtraSpaces("this   is a   test  ")+"\n");
		
		//Tests for splitOnSpaces
		System.out.println("---------- splitOnSpaces --------------");
		System.out.println("Expected value: null");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces(null))+"\n");
		
		System.out.println("Expected value: []");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces(""))+"\n");
		
		System.out.println("Expected value: [this, string, has, plenty, of, words, and, spaces]");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces("this string has plenty of words and spaces"))+"\n");
		
		//Tests for splitOnSpaces1
		System.out.println("---------- splitOnSpaces1 --------------");
		System.out.println("Expected value: The input was null or empty");
		Optional<String[]> n = Utilities02.splitOnSpaces1(null);
		if(n.isPresent()) {
			System.out.println(Arrays.toString(n.get())+"\n");
		} else {
			System.out.println("The input was null or empty\n");
		}
		
		System.out.println("Expected value: The input was null or empty");
		Optional<String[]> empty = Utilities02.splitOnSpaces1("");
		if(empty.isPresent()) {
			System.out.println(Arrays.toString(empty.get())+"\n");
		} else {
			System.out.println("The input was null or empty\n");
		}
		
		System.out.println("Expected value: [should, give, an, array, of, these, words, separated, by, commas]");
		Optional<String[]> array = Utilities02.splitOnSpaces1(" should give an array of   these words  separated by commas   ");
		if(array.isPresent()) {
			System.out.println(Arrays.toString(array.get())+"\n");
		} else {
			System.out.println("The input was null or empty\n");
		}
		
		//Tests for strLengths
		System.out.println("---------- strLengths --------------");
		System.out.println("Expected value: null");
		System.out.println(Arrays.toString(Utilities02.strLengths(null))+"\n");
		
		System.out.println("Expected value: []");
		System.out.println(Arrays.toString(Utilities02.strLengths(""))+"\n");
		
		System.out.println("Expected value: [4, 6, 3, 6, 2, 5, 3, 6]");
		System.out.println(Arrays.toString(Utilities02.strLengths("this string has plenty of words and spaces"))+"\n");
		
		//Tests for InstanceMethodVersion
		System.out.println("---------- InstanceMethodVersion --------------");
		InstanceMethodVersion nIMV = new InstanceMethodVersion(null);
		InstanceMethodVersion eIMV = new InstanceMethodVersion("");
		InstanceMethodVersion wIMV = new InstanceMethodVersion("  test  ");
		InstanceMethodVersion sIMV = new InstanceMethodVersion("  this   is a   test  ");
		
		System.out.println("Expected values: -1,-1,null,null,null,null,null");
		System.out.println(nIMV.countSpaces());
		System.out.println(nIMV.countSpaces2());
		System.out.println(nIMV.withoutExtraSpaces());
		System.out.println(nIMV.first());
		System.out.println(nIMV.rest());
		System.out.println(nIMV.splitOnSpaces());
		System.out.println(nIMV.strLengths());
		
		System.out.println("Expected values: 0,0,\"\",\"\",\"\",[],[]");
		System.out.println(eIMV.countSpaces());
		System.out.println(eIMV.countSpaces2());
		System.out.println(eIMV.withoutExtraSpaces());
		System.out.println(eIMV.first());
		System.out.println(eIMV.rest());
		System.out.println(Arrays.toString(eIMV.splitOnSpaces()));
		System.out.println(Arrays.toString(eIMV.strLengths()));
		
		System.out.println("Expected values: 4,4,test,test,\"\",[test],[4]");
		System.out.println(wIMV.countSpaces());
		System.out.println(wIMV.countSpaces2());
		System.out.println(wIMV.withoutExtraSpaces());
		System.out.println(wIMV.first());
		System.out.println(wIMV.rest());
		System.out.println(Arrays.toString(wIMV.splitOnSpaces()));
		System.out.println(Arrays.toString(wIMV.strLengths()));
		
		System.out.println("Expected values: 11,11,this is a test,this,is a   test,[this, is, a, test],[4, 2, 1, 4]");
		System.out.println(sIMV.countSpaces());
		System.out.println(sIMV.countSpaces2());
		System.out.println(sIMV.withoutExtraSpaces());
		System.out.println(sIMV.first());
		System.out.println(sIMV.rest());
		System.out.println(Arrays.toString(sIMV.splitOnSpaces()));
		System.out.println(Arrays.toString(sIMV.strLengths()));
		}
}
