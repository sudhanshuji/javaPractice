package classtester;



public class Testing {
	static String string = "my name is sudhanshu ";
	static String string1 = "sudhanshu";

	public static void traceChar(String string) {
		int length = string.length();
		for (int i = 0; i <= length - 1; i++)
			System.out.print(" " + string.charAt(i));
	}

	public static int traceSpace(String string) {
		// System.out.println();
		int length = string.length();
		int l = 0;
		for (int i = 0; i <= length - 1; i++) {
			if (string.charAt(i) == ' ')
				l++;
		}
		 //System.out.println("Number of words : " + (l));
		return l;
	}

	public static void traceletter(String string) {
		// System.out.println();
		int length = string.length();
		int l = 0;
		for (int i = 0; i <= length - 1; i++) {
			if (string.charAt(i) != 0)
				l++;
		}
		System.out.println("Number of letters : " + (l - traceSpace(string)));
	}

	public static void reaverse(String string) {
		System.out.println();
		int length = string.length();
		String temp = " ";
		for (int j = length - 1; j >= 0; j--) {
			temp += string.charAt(j);
			
		}System.out.println(temp);

	}

	public static void reverseEach(String string) {
		System.out.println();
		int length = string.length();
		String[] words = string.split(" ");
		String revString = "";
		for (int i = 0; i <= words.length - 1; i++) {
			String word = words[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}
			revString += revWord + " ";
		}
		System.out.print(revString);
	}
	
	public static void reverseEach1(String string) {
		System.out.println();
		int length = string.length();
		String[] words1=new String[traceSpace(string)];
		String[] words2=new String[traceSpace(string)];
		String[] words3=new String[traceSpace(string)];
		int l=0;
		for(int i=0;i<=length-1;i++) {
			words1[l]="";
			while(string.charAt(i)!=' ' && l<=traceSpace(string) || string.charAt(i)=='.') {
				words1[l]+=string.charAt(i);
				i++;
			}l++;
		}
		for(l=0;l<traceSpace(string);l++) {
			words2[l]=words1[l];
		}
		for(l=0;l<traceSpace(string);l++)
			
		System.out.print(" "+words2[l]);
	for(l=0;l<traceSpace(string);l++) {
		int len= words2[l].length();
		words3[l]="";
		for(int j=0;j<=words2[l].length();j++) {
			words3[l].charAt(j  )+=words2[l].charAt(len);
		len--;
		}
		System.out.print(" "+words3[l]);
	}
}
		
		
	private static void rev(String string) {
		System.out.println("");
		String[] array = new String[traceSpace(string)];
		
		for(int i = 0, j = 0; i < string.length(); i++) {
			if(array[j]==null)
				array[j]="";
			if(string.charAt(i)!=' ') {
				array[j]+=string.charAt(i);
			}
			if(string.charAt(i) == ' ') j++;
		}
		
		for (int i = 0; i < array.length; i++) {
			for(int j = array[i].length()-1; j >= 0; j--) {
				
				System.out.print(array[i].charAt(j));
				
			}
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args) {
		traceChar(string);
		traceSpace(string);
		traceletter(string);
		reaverse("sudhanshu");
		reaverse(string);
		reverseEach(string);
		reverseEach1(string);
		rev(string);
	}

	
}
