package Chapter08;

public class CustomerTest extends Customer{
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPcustomer(19929, "������", 12345);
		customerkim.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "����" + leePrice + "�� �����Ͽ����ϴ�");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + "����" + kimPrice + "�� �����Ͽ����ϴ�");
		System.out.println(customerLee.showCustomerInfo());
		
		
	}

}
