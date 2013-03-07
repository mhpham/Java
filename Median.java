//Given array of numbers, find the median number

class Median {
	public static int findMedian (int[] sequence) {

		int length = sequence.length;
		if( sequence.length < 3 )
			return sequence[0];
		else {
			if (length % 2 == 0)
				return (sequence[length / 2] + sequence[(length / 2) - 1]) / 2;
			else
				return sequence[length/2];
		}
	}

//testing
	public static void main (String[] args) {
		int a[] =  { 1, 1, 1, 1, 5, 1, 2, 2, 3, 4 };
		System.out.println(findMedian(a));
	}
}
				
