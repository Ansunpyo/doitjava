package Chapter08;

public class VIPcustomer02 {
		private int agentID;
		double saleRatio;
		
		public void GoldCustomer(int customerID, String customerName, int agentID) {
			super(customerID, customerName);
			customerGrade = "Gold";
			bonusRatio = 0.02;
			saleRatio = 0.1;
		}
		
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		}
	
	}


