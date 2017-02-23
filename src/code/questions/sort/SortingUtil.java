package code.questions.sort;


/**
 * <pre>
 * Utility class that can be used for performing various sorts
 * </pre>
 * 
 * <pre>
 * 2017/02/23	PACA
 * </pre>
 */
public class SortingUtil {
	
	/**
	 * 
	 * <pre>
	 * Perform bubble sort on an unsorted int array
	 * </pre>
	 * 
	 * <pre>
	 * 2017/02/23	PACA
	 * </pre>
	 *
	 * <pre>
	 * @param array
	 * @return sorted array
	 * </pre>
	 */
	public static int[] bubbleSort(int[] array) {
		if (array == null || array.length == 1) {
			return array;
		}
		
		for (int i=array.length - 1; i>=0; i--) {
			for (int j=array.length - 1; j>=1; j--) {
				// swap array elements if index j value is smaller than index j-1
				if (array[j] < array[j-1]) {
					int num = array[j-1];
					array[j-1] = array[j];
					array[j] = num;
				}
			}	
		}
		return array;
	}
	
	/**
	 * 
	 * <pre>
	 * Perform bubble sort on an unsorted String array
	 * </pre>
	 * 
	 * <pre>
	 * 2017/02/23	PACA
	 * </pre>
	 *
	 * <pre>
	 * @param array
	 * @return sorted array
	 * </pre>
	 */
	public static String[] bubbleSort(String[] array) {
		if (array == null || array.length == 1) {
			return array;
		}
		
		for (int i=array.length - 1; i>=0; i--) {
			for (int j=array.length - 1; j>=1; j--) {
				// swap array elements if index j value is smaller than index j-1
				if (array[j].compareTo(array[j-1]) < 0) {
					String str = array[j-1];
					array[j-1] = array[j];
					array[j] = str;
				}
			}	
		}
		
		return array;
	}
	
	/**
	 * <pre>
	 * Perform linear sort on an unsorted int array
	 * </pre>
	 * 
	 * <pre>
	 * @sofhistory 
	 * 2017/02/23	PACA
	 * </pre>
	 *
	 * <pre>
	 * @param array
	 * @return
	 * </pre>
	 */
	public static int[] linearSort(int[] array) {
		
		if (array == null || array.length == 1) {
			return array;
		}
		
		// index of smallest int in unsorted part of array
		int minIndex=0;	
		// counter to track sorted part of array
		int sortedIndex = 0;
		
		// loop until all sorted
		while (sortedIndex < array.length) {
			// find smallest int
			for (int i=sortedIndex; i<array.length;i++) {
				if (array[i] < array[minIndex]) {
					minIndex = i;
				}
			}
			
			// swap the numbers
			int num = array[sortedIndex];
			array[sortedIndex] = array[minIndex];
			array[minIndex] = num;
			sortedIndex++;
		}		
		return array;
	}
}