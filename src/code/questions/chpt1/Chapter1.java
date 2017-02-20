package code.questions.chpt1;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;


/**
 * 
 * <pre>
 * 2017/02/16	PACA	initial version
 * </pre>
 */
public class Chapter1 {
	
	public static void printLinkedListInReverse(ListNode <Integer> head) {
		Deque<Integer> nodes = new LinkedList<>();
		
		while (head !=null) {
			nodes.addFirst(head.data);
			head = head.next;
		}
		
		while (!nodes.isEmpty()) {
			System.out.println(nodes.poll());
		}
	}
	
	/**
	 * 1.4 Write a method to replace all spaces in a string with '%20'.
	 */
	public static char[] replaceSpaces(char[] chars, int length) {
		
		int charCount = 0;
		for (int i = 0; i<chars.length; i++) {
			if (chars[i] == ' ') {
				charCount++;
			}
		}
		
		int newLength = length + charCount * 2;
		chars[newLength] = '\0';	// null character
		
		for (int i=length - 1; i>=0; i--) {
			if (chars[i] == ' ') {
				chars[newLength - 1] = '0';
				chars[newLength - 2] = '2';
				chars[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				chars[newLength - 1] = chars[i];
				newLength = newLength - 1;
			}
		}
		
		return chars;
	}	
	
	public static boolean isUniqueChars1(String string) {
		
		if (string == null) {
			return true;
		}
		
		if (string.length() > 26) {
			return false;
		}
		
		for (int i=0; i<string.length(); i++) {
			for (int j=0; j<string.length(); j++) {
				if (i != j && string.charAt(i) == string.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String string) {
		
		if (string == null) {
			return true;
		}
		
		if (string.length() > 26) {
			return false;
		}
		
		char[] characters = string.toCharArray();
		Arrays.sort(characters);
		
		for (int i=0; i<characters.length-1; i++) {
			if (characters[i] == characters[i+1]) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static boolean isUniqueChars3(String str) {
		if (str.length() > 256)
			return false;

		boolean[] char_set = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}