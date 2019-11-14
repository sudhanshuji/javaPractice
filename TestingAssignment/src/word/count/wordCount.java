package word.count;

public class wordCount {
	public static void countWord(String sentence) {
		char[] data=sentence.toCharArray();
		int ch=sentence.toCharArray().length;
			System.out.println(ch);
			int countWords=0;
			int countSentence=0;
			for(int i=0;i<ch;i++) {
				if(data[i]==' ') {
					countWords++;
				}
				if(data[i]=='.') {
					countSentence++;
				}
			}
			System.out.println("no 0f words :"+" "+(countWords+1));
			System.out.println("no of sentence :"+" "+countSentence);
		
	}

	public static void main(String[] args) {
		String data="All our dreams can come true, if we have the courage to pursue them. So just follow your dreams.";
		String data1="Great works are performed, not by strength, but by perseverance.";
		countWord(data1);
		countWord(data);

	}

}
