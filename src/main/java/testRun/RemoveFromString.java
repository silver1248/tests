package testRun;

public class RemoveFromString {

	public static void main(String[] args) {
		removeAllOccurrences("this is fun", 'i');
	}

	public static String removeAllOccurrences(String str, char ch) {
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
			char point = str.charAt(i);
			
			if (point == ch) {
				result.append("");
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
}