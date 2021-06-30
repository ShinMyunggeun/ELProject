package standard;
import java.util.ArrayList;

public class Mine1 {
	
	public ArrayList<String> arrTicket = new ArrayList<String>();
	public ArrayList<String> arrAge = new ArrayList<String>();
	public ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public ArrayList<String> arrB = new ArrayList<String>();
			
	public void clearAllData() {
		arrTicket.clear();
	  	arrAge.clear();
	  	arrCount.clear();
	  	arrPrice.clear();
	  	arrB.clear(); }
	
	public void addArray(String ticketType, String age, int Count, int Price, String B) {
		arrTicket.add(ticketType);
		arrAge.add(age);
		arrCount.add(Count);
		arrPrice.add(Price);
		arrB.add(B);
}
	public void Result() {
		for(int index = 0; index < arrTicket.size(); index++) {
		    System.out.printf("%s  %s  X  %d  %d  %s\n", arrTicket.get(index), arrAge.get(index),
				    		  			arrCount.get(index), arrCount.get(index)*arrPrice.get(index), arrB.get(index));
}
			System.out.println("========================================");
}

	public void Arrayadd(String ticketType, String age, int count, int price, String b) {
		// TODO Auto-generated method stub
		
	}
}

