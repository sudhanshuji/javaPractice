package kangaroo.jump;

public class Solution {
//	static int findlcm(int v1,int v2) {
//		int i,l=v1>v2?v1:v2;
//		for(i=l;i<=v1*v2;i=i+l) {
//			if(i%v1==0 && i%v2==0) 
//				break;
//		}
//		System.out.println(i);
//		return i;
//	}

	    // Complete the kangaroo function below.
	    static String kangaroo(int x1, int v1, int x2, int v2) {
	    	if(x1>x2 && v1<v2) {
	    		while(x1!=x2 && x1>x2) {
	    		x1=x1+v1;
	    		x2=x2+v2;
	    		}
	    		if(x1==x2)
	    			return "YES";
	    		else
	    			return "NO";
	    	}
	    	else if(x2>x1 && v2<v1 ) {
	    		while(x1!=x2 && x2>x1) {
		    		x1=x1+v1;
		    		x2=x2+v2;
		    		}
	    		if(x1==x2)
	    			return "YES";
	    		else
	    			return "NO";
	    	}
	    	else
	    		return "both are already at same position";
	    }
	    
	    
	    public static void main(String[] args) {
	    	int x1 = 21,v1 = 6,x2 = 47,v2 = 3;
	    	String result=kangaroo(x1, v1, x2, v2);
	    //	findlcm(50, 27);
	    	System.out.println(result);
	    }
}
