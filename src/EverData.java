package standard;
import java.util.ArrayList;

public class Mine1 {
	
	public ArrayList <DataClass> arrData = new ArrayList<DataClass>();
			
		public void Arrayadd(String ticketType, String age, int Count, int Price, String B, String isEventCoupon) {
		DataClass item = new DataClass();
		item.ticketType = ticketType;
		item.Count = Count;
		item.Price = Price;
		item.Age = age;
		item.B = B;
		item.isEventcoupon = isEventCoupon;
		arrData.add(item);
}
		public void Result() {
			int totalPrice=0;
		    
			for(int index=0; index<arrData.size();index++) {
		    	totalPrice += arrData.get(index).Price * arrData.get(index).Count;}
		    System.out.println("가격은" +totalPrice +"원입니다. \n감사합니다.");
		    System.out.println("=============== 에버랜드 =================");  
		    for(int index = 0; index < arrData.size(); index++) {
		    System.out.printf("%s  %s  X  %d  %d  %s\n", arrData.get(index).ticketType, arrData.get(index).Age, arrData.get(index).Count, 
		    		arrData.get(index).Price * arrData.get(index).Count, arrData.get(index).B, arrData.get(index).isEventcoupon);
			}
		    System.out.println("========================================");
			}
}
			