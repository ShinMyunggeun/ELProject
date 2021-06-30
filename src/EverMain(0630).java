package standard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Mine2{
	public static void main(String[] args) {
		Mine everProcess = new Mine(); 
		Mine1 everArray = new Mine1();
		everProcess.todayDate();	
		
		while(true) {
		
		do {
    	everProcess.inputDate();
    	everProcess.ticketType();
    	System.out.println(everProcess.ticketType);
  		System.out.println("ㅡ");
  		everProcess.givenBirth();
  		if(everProcess.registNumber.equals("0")) {continue;}
  		everProcess.dateBirth();
  		everProcess.dataCount();
  		everProcess.InputPrior();
  		if(everProcess.Prior == 0) {continue;}
  		System.out.println("ㅡ");
  		everProcess.EventCP();
  		everProcess.moreOver();
  		everArray.Arrayadd (everProcess.ticketType, everProcess.age,
  					 	   everProcess.Count, everProcess.Price, everProcess.b, everProcess.isEventCoupon);
      	}while(everProcess.addOrder == 1);
      	everArray.Result();   
      	break;
		}
	}
}
