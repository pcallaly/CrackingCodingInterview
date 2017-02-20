package code.questions.chpt1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

 
  
 
/**
 * <pre>
 * TODO: add description here
 * </pre>
 * 
 * <pre>
 * 2017/02/20	PACA	initial version (task or ticket)
 * </pre>
 */

public class Chapter1Tests {

	/**
	 * Test method for {@link code.questions.chpt1.Chapter1#printLinkedListInReverse(code.questions.chpt1.ListNode)}.
	 */
	@Test
	public void testPrintLinkedListInReverse() {
		
		// populate the list head
		ListNode<Integer> head = new ListNode<>();
		head.data = 1;
		
		ListNode<Integer> head1 = head;
		
		// populate remainder of list
		for (int i=2; i<=10;i++) {
			ListNode<Integer> node = new ListNode<>();
			node.data = i;
			
			head1.next = node;
			head1 = node;
		}
		
		Chapter1.printLinkedListInReverse(head);
	}

	/**
	 * Test method for {@link code.questions.chpt1.Chapter1#isUniqueChars1(java.lang.String)}.
	 */
	@Test
	public void testIsUniqueChars1() {
		assertTrue(Chapter1.isUniqueChars1("abcdefgji"));
		
		assertFalse(Chapter1.isUniqueChars1("abcdefgjii"));
	}

	/**
	 * Test method for {@link code.questions.chpt1.Chapter1#isUniqueChars2(java.lang.String)}.
	 */
	@Test
	public void testIsUniqueChars2() {
		assertTrue(Chapter1.isUniqueChars2("abcdefgji"));
		
		assertFalse(Chapter1.isUniqueChars2("abcdefgjii"));
	}

	/**
	 * Test method for {@link code.questions.chpt1.Chapter1#isUniqueChars3(java.lang.String)}.
	 */
	@Test
	public void testIsUniqueChars3() {
		assertTrue(Chapter1.isUniqueChars3("abcdefgji"));
		
		assertFalse(Chapter1.isUniqueChars3("abcdefgjii"));
	}
	
	
	@Test
	public void testReplaceChar() {
		String input = "My Name is Paulxxxxxxxxxxxxxxxxx";
		String result = new String(Chapter1.replaceSpaces(input.toCharArray(), 15));
		
		assertEquals("My%20Name%20is%20Paul", result.substring(0, result.indexOf('\0')));
	}
}