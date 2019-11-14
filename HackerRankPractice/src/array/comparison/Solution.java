package array.comparison;

	import java.util.ArrayList;
import java.util.List;
	public class Solution {

	    // Complete the compareTriplets function below.
	    static List<Integer> compareTriplets  (List<Integer> a, List<Integer> b) {
	    	int[] aary=new int[a.size()];
	    	int[] bary=new int[a.size()];
	    	for (int i=0;i<a.size();i++) {
	    		aary[i]=a.get(i);
	    		bary[i]=b.get(i);
	    	}
	    	List<Integer> finalList=new ArrayList<Integer>();
	    	int suma=0;
	    	int sumb=0;
	    	for(int i=0;i<a.size();i++) {
	    		if(aary[i]>bary[i]) {
	    			suma+=1;
	    		}else if(aary[i]<bary[i]) {
	    			sumb+=1;
	    		}	
	    	}
	    	finalList.add(suma);
	    	finalList.add(sumb);
	    	return finalList;
	    }

	    public static void main(String[] args) {
	    	List<Integer> ainp = new ArrayList<Integer>();
	    	List<Integer> binp = new ArrayList<Integer>();
	    	ainp.add(5);
	    	ainp.add(6);
	    	ainp.add(7);
	    	binp.add(3);
	    	binp.add(6);
	    	binp.add(10);
	    	List<Integer> result=new ArrayList<Integer>();
	    	result=compareTriplets(ainp, binp);
	    	for(int k:result) {
	    		System.out.println(k);
	    	}
	    
	    }
	}



