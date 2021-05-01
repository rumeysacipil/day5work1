package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin=new IndividualCustomer();
        engin.customerNumber="1234";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();				
         hepsiBurada.customerNumber="56898";
         
         CustomerManager customerManager=new CustomerManager();
        
         Customer[] customers= {engin,hepsiBurada};
         customerManager.addMultiple(customers);
         
         
	}

}
