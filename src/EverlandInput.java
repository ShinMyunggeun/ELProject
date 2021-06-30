package standard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Mine2{
		Mine everProcess = new Mine(); 
		Mine1 everArray = new Mine1();
		everProcess.todayDate();	
		while(true) {
		everArray.clearAllData();
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
  		everProcess.moreOver();
  		everArray.Arrayadd(everProcess.ticketType, everProcess.age,
  					 	   everProcess.Count, everProcess.Price, everProcess.b);
		System.out.println("감사합니다.");
	    System.out.println("=============== 에버랜드 =================");
      	}while(everProcess.addOrder == 1);
      	everArray.Result();   
      	break;
		}
	}
}