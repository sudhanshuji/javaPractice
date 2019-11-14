package day.third;

public class Sulution {

	    // Complete the solve function below.
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {
	        double totalTax=0;
	        double tip=(tip_percent*meal_cost)/100;
	        double tax=(tax_percent*meal_cost)/100;
	        totalTax=meal_cost+tip+tax;
	        int totalCost=round(totalTax);
	        System.out.print(totalCost);
	    }
	    static int round(double totalcost){
	    	
	    	return (int) Math.round(totalcost);
	        
	    }


	    public static void main(String[] args) {
	        double meal_cost =12;

	        int tip_percent =10;

	        int tax_percent =20;

	        solve(meal_cost, tip_percent, tax_percent);

	    }
	}



