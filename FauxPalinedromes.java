public class FauxPalinedromes {

	public boolean palinedrome(String word) {
		int i = 0, j = word.length() - 1;

		while (i < j)
		{
			if (word.charAt(i)!=word.charAt(j)) {
				return false;
			}
		}
		return true;

	
	}

	public String compressed(String word) {
		String newWord = "" + word.charAt(0);

		for(int i = 1;i < word.length();i++) {
			if (word.charAt(i) != word.charAt(i-1) ) {
				newWord += word.charAt(i);
			}
		}
		return newWord;

		
	}

	public String classifyIt (String word) {
		if (palinedrome(word)) {
			return "PALINDROME";
		}
		else if(palinedrome(compressed(word))) {
			return "FAUX";
		}
		else {
			return "NOT EVEN FAUX";
		}
	}


}
// below is incomplete, work to create a driver to test the class
//public static void main (String[] args)
//{
//	String word = "AXA";
//	System.out.println("Starting test");
//	FauxPalinedromes tester = new FauxPalinedromes();
//	tester.classifyIt("AXA");
//	System.out.println("Test end");
//}
