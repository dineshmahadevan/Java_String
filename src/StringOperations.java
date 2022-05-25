import java.awt.List;
import java.util.HashMap;

public class StringOperations {
	
	
	
	public static void main(String[] args) {
		
		FindOccuranceCount find = new FindOccuranceCount();
		MoveCharToEnd move = new MoveCharToEnd();
		
		char[] a = {'D','i','n','e','s','h',' ','M','a','h','a','d','e','v','a','n'};
		String aname = new String(a);
		String name = "Dinesh Mahadevan";
		String str1 = "AaaABbcDdeEff";
		
		System.out.println(name.compareTo(aname));
		System.out.println(name.compareToIgnoreCase(aname));
		System.out.println(name.equals(aname));
		System.out.println(name.equalsIgnoreCase(aname));
		
		//reverse a string
		int strlen = name.length();
		System.out.println(strlen);
		String reverse = "";
		for(int i=1;i<=strlen;i++) {
			char b = name.charAt(strlen - i);
			reverse = reverse + b;
		}
		System.out.println(reverse);
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println(name + " is a palindrome as it is same as  " + reverse);
		}
		else {
			System.out.println(name + " is not a palindrome as it is not same as  " + reverse);
		}
		
		//findoccurances
		System.out.println(find.findoccurances(name, 'A'));
		
		//first non repeating char in a string
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] c = str1.toLowerCase().toCharArray();
		for(char d:c){
			if(hm.containsKey(d)){
				hm.put(d,(hm.get(d)+1));
			} else
			{
				hm.put(d,1);
			}
		}
		
		for(HashMap.Entry m:hm.entrySet()){
			System.out.println(m.getKey() + ", " + m.getValue() );
			if(m.getValue().equals(1)) {
				System.out.println(m.getKey());
				break;
			}
		}
		
		//remove duplicates from a list
		List names = new List(); 
		names.add("Dinesh");
		names.add("Haresh");
		names.add("Dinesh");
		names.add("Lakshmi");
		names.add("Ashwini");
		names.add("Lakshmi");
		
		for(int i = 0;i<names.getItemCount(); i++) {
			for(int j = i+1; j < names.getItemCount(); j++) {
				if(names.getItem(i).equalsIgnoreCase(names.getItem(j))) {
					names.remove(i);
				}
			}
		}
		
		for(int i = 0; i < names.getItemCount(); i++) {
			System.out.println(names.getItem(i));
		}
		
		//sort array
		int[] ar = {0, 2, 6, 8, 21, 3, 5, 22, 99, 67, 51, 14, 7, 90};
		for(int ab = 0; ab<ar.length ;ab++){
			for (int cd = ab + 1;cd<ar.length; cd++) {
				if(ar[cd]<ar[ab]) {
					int x;
					x = ar[ab];
					ar[ab] = ar[cd];
					ar[cd] = x;
				}
			}
		}
		
		for(int ij = 0; ij < ar.length ; ij++){
			System.out.println(ar[ij]);
		}
		
		//fibonacci series
		int a1 = 0, a2 = 1, a3=0, x11=0;
		int[] fibo = new int[20];
		System.out.println(a1);
		System.out.println(a2);
		fibo[0] = a1;
		fibo[1] = a2;
		for(int x1 = 2; x1 < 20; x1++) {
			a3 = a1 + a2;
			fibo[x1] = a3;
			a1 = a2;
			a2 = a3;
		}
		for(int x2 = fibo.length-1; x2 >= 0 ; x2--) {
			System.out.println(fibo[x2]);
		}
			
			
		
		
	}
}
 
	