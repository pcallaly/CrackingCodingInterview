package code.questions.sort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

 
  
 
/**
 * <pre>
 * 2017/02/23	PACA
 * </pre>
 */
public class SortingUtilTest {

	@Test
	public void testIntBubbleSortNull() {
		int[] array = null;
		int[] sorted = SortingUtil.bubbleSort(array);
		assertNull(sorted);
	}
	
	@Test
	public void testIntBubbleSort1() {
		
		int[] sorted = SortingUtil.bubbleSort(new int[]{1});
		assertArrayEquals(new int[]{1}, sorted);
	}
	
	@Test
	public void testIntBubbleSort2() {
		int[] sorted = SortingUtil.bubbleSort(new int[]{5,6,3,4,1,2});
		assertArrayEquals(new int[]{1,2,3,4,5,6}, sorted);
	}
	
	@Test
	public void testIntBubbleSort3() {
		int[] sorted = SortingUtil.bubbleSort(new int[]{1,2,3,4,5,6});
		assertArrayEquals(new int[]{1,2,3,4,5,6}, sorted);
	}
	
	@Test
	public void testStringBubbleSortNull() {
		String[] array = null;
		String[] sorted = SortingUtil.bubbleSort(array);
		assertNull(sorted);
	}
	
	@Test
	public void testStringBubbleSort1() {
		
		String[] sorted = SortingUtil.bubbleSort(new String[]{"1"});
		assertArrayEquals(new String[]{"1"}, sorted);
	}
	
	@Test
	public void testStringBubbleSort2() {
		String[] sorted = SortingUtil.bubbleSort(new String[]{"5","6","3","4","1","2"});
		assertArrayEquals(new String[]{"1","2","3","4","5","6"}, sorted);
	}	
	
	@Test
	public void testStringBubbleSort3() {
		String[] sorted = SortingUtil.bubbleSort(new String[]{"1","2","3","4","5","6"});
		assertArrayEquals(new String[]{"1","2","3","4","5","6"}, sorted);
	}
	
	@Test
	public void testStringLinearSort1() {
		int[] sorted = SortingUtil.linearSort(new int[]{5});
		assertArrayEquals(new int[]{5}, sorted);
		
		sorted = SortingUtil.linearSort(null);
		assertArrayEquals(null, sorted);
	}
	
	@Test
	public void testStringLinearSort2() {
		int[] sorted = SortingUtil.bubbleSort(new int[]{5,6,3,4,1,2});
		assertArrayEquals(new int[]{1,2,3,4,5,6}, sorted);
		
		sorted = SortingUtil.bubbleSort(new int[]{6,5});
		assertArrayEquals(new int[]{5,6}, sorted);
	}
	
	@Test
	public void testStringLinearSort3() {
		int[] sorted = SortingUtil.bubbleSort(new int[]{1,2,3,4,5,6});
		assertArrayEquals(new int[]{1,2,3,4,5,6}, sorted);
	}	
}

