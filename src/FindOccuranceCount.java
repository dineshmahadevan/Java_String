
public class FindOccuranceCount {
	
	public static int findoccurances(String str, char a) {
		
		int count = 0, strlen = 0;
		
		strlen = str.length();
		for (int i=1 ; i <= strlen ; i++) {
			char x = str.toLowerCase().charAt(i-1);
			char b = Character.toLowerCase(a);
			if(x == b) {
				count++;
			}
		}
	return count;
	}

}
