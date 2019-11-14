package custom.feedback;


public class CustomerFeedback {
	
	public static double calculateFeedback(Customer customers[]) {
		double sum = 0, avg = 0;
		for (Customer s : customers) {
			double d = s.getFeedbackRating();
			sum += d;
		}
		avg = sum / customers.length;

		return avg;
	}

	public static void main(String[] args) {

		Customer customers[] = new Customer[3];
		customers[0] = new Customer("Vijay", 3.0);
		customers[1] = new Customer("Kumar", 4.0);
		customers[2] = new Customer("Vishnu", 5.0);
		double actual = CustomerFeedback.calculateFeedback(customers);
		System.out.println(actual);
		
		Customer customers1[] = new Customer[5];
		customers1[0] = new Customer("Arun", 4.5);
		customers1[1] = new Customer("Babu", 4.5);
		customers1[2] = new Customer("Manasa", 3.5);
		customers1[3] = new Customer("Sara", 2.0);
		customers1[4] = new Customer("Kumar", 4.0);
		double actual1 = CustomerFeedback.calculateFeedback(customers1);
		System.out.println(actual1);
		
		Customer customers11[] = new Customer[2];
		customers11[0] = new Customer("Santhosh", 5.0);
		customers11[1] = new Customer("Savitha", 0.0);
		double actual11 = CustomerFeedback.calculateFeedback(customers11);
		System.out.println(actual11);

	}

}
