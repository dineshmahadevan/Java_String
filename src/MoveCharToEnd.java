
public class MoveCharToEnd {
	
	public void moveToEnd(String str, char a) {
		
		//0123456789012345
		//Dinesh Mahadevan, h, 16
		int strlen = str.length();
		str = str.toLowerCase();
		char[] chararray = str.toCharArray();
		for (int i = 1; i<=strlen; i++) {
			char x = str.toLowerCase().charAt(i-1);
			System.out.println("Iteration Start: " + i + ", " + str);
			if(x==Character.toLowerCase(a)) {
				for(int j = i; j<=strlen; j++) {
					if(j==strlen) {
						str.replace(str.charAt(j-1), x);
					}
					else {
						str.replace(str.charAt(j-1), str.charAt(j));
//						chararray[j-1] = chararray[j];
					}
				}
			}
			System.out.println("Iteration End: " + i + ", " + str);
		}
	}

}
