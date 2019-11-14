package apple.Orange;

public class Solution {

	    // Complete the countApplesAndOranges function below.
	    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
	    	int[] rangeOfApples=new int[apples.length];
	    	int[] rangeOfOranges=new int[apples.length];
	    	for(int i=0;i<apples.length;i++) {
	    		rangeOfApples[i]=apples[i]+a;
	    	}
	    	for(int i=0;i<oranges.length;i++) {
	    		rangeOfOranges[i]=oranges[i]+b;
	    	}
	    	int i=0;
	    	int countApple=0;
	    	int countOrange=0;
	    	while(i<apples.length) {
	    	if(rangeOfApples[i]<=t && rangeOfApples[i]>=s) {
	    		i++;
	    		countApple++;
    		}
	    	i++;
	    }
	    	i=0;
	    	while(i<oranges.length) {
	    	if(rangeOfOranges[i]<=t && rangeOfOranges[i]>=s) {
	    		countOrange++;
    		}
	    	i++;
	    	}
	    	
	    	System.out.println(countApple+" "+countOrange);
	    }

	    public static void main(String[] args) {
	    	int s=37455,t=87275,a=35609,b=89610;

	        int[] apples= {};

	        int[] oranges = {5,-6};

	        countApplesAndOranges(s, t, a, b, apples, oranges);

	    }
	

}




