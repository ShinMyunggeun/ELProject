package standard;

import java.text.SimpleDateFormat;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Everland {
=======
import java.util.Date;
import java.util.Scanner;

public class Everlanddd {
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36

   public static void main(String[] args) {
      // TODO Auto-generated method stub

	Scanner myInput = new Scanner(System.in) ;
	int todayYear, todayDate, birthYear, birthMonth, birthDay, birthDate, resDate, Prior, Count = 0, Age, Price = 0;
<<<<<<< HEAD
    int totalPrice=0;
	int qty = 0; 
	String ticketType, registNumber, age = null ;
	String b = "";
	int addOrder = 0, orderCount = 0 ;	
	
	ArrayList<String> arrTicket = new ArrayList<String>();
	ArrayList<String> arrAge = new ArrayList<String>();
	ArrayList<Integer> arrCount = new ArrayList<Integer>();
	ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	ArrayList<String> arrB = new ArrayList<String>();
=======
	String ticketType, registNumber, age = null ;
	String b = "";
	int addOrder = 0, orderCount = 0 ;
	String[] saveTicket = new String[100];
	String[] saveAge = new String[100];
	int[] saveCount = new int[100];
	int[] savePrice = new int[100];
	String[] saveb = new String[100];
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
      
	String pattern1 = "YYYYMMDD";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
	String today = simpleDateFormat.format(new Date());
<<<<<<< HEAD
=======
	System.out.println(today);
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
	todayYear = Integer.parseInt(today.substring(0,4));
    todayDate = Integer.parseInt(today.substring(4,8));

    while(true) {
<<<<<<< HEAD
    	arrTicket.clear();
    	arrAge.clear();
    	arrCount.clear();
    	arrPrice.clear();
    	arrB.clear();
    do {
    while(true) {
    	  System.out.println("--------------------------------------");
    	  System.out.println("ÀÌ¿ë³¯Â¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.	 e.g) 20210601 ");
=======
   	  orderCount = 0;
    do {
    while(true) {
    	  System.out.println("--------------------------------------");
    	  System.out.println("ì´ìš©ë‚ ì§œë¥¼ ìž…ë ¥í•´ì£¼ì„¸ìš”.	 e.g) 20210601 ");
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
    	  System.out.print(": ");
    	  Scanner myInput1 = new Scanner(System.in);
    	  resDate = myInput1.nextInt();

<<<<<<< HEAD
    	 if(resDate == 20210904 || resDate == 20210905 || resDate == 20210911 || resDate == 20210912 || resDate == 20210918 || 
    	    resDate == 20210919 || resDate == 20210920 || resDate == 20210921 || resDate == 20210922 || resDate == 20210925 || 
    	    resDate == 20210926 || resDate == 20211002 || resDate == 20211003 || resDate == 20211009 || resDate == 20211010 ||
    	    resDate == 20211016 || resDate == 20211017 || resDate == 20211023 || resDate == 20211024 || resDate == 20211030 ||
    	    resDate == 20211031 || resDate == 20211106 || resDate == 20211107) {
    		ticketType = "Aticket";
    		break;
=======
   if(resDate == 20210904 || resDate == 20210905 || resDate == 20210911 || resDate == 20210912 || resDate == 20210918 || 
	  resDate == 20210919 || resDate == 20210920 || resDate == 20210921 || resDate == 20210922 || resDate == 20210925 || 
	  resDate == 20210926 || resDate == 20211002 || resDate == 20211003 || resDate == 20211009 || resDate == 20211010 ||
	  resDate == 20211016 || resDate == 20211017 || resDate == 20211023 || resDate == 20211024 || resDate == 20211030 ||
	  resDate == 20211031 || resDate == 20211106 || resDate == 20211107) {
	  ticketType = "Aticket";
	  break;
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
   }else if(resDate == 20210703 || resDate == 20210704 || resDate == 20210710 || resDate == 20210711 || resDate == 20210717 || 
		    resDate == 20210718 || resDate == 20210724 || resDate == 20210725 || resDate == 20210729 || resDate == 20210730 || 
		    resDate == 20210731 || resDate == 20210801 || resDate == 20210802 || resDate == 20210803 || resDate == 20210807 || 
		    resDate == 20210808 || resDate == 20210814 || resDate == 20210815 || resDate == 20210821 || resDate == 20210822 || 
		    resDate == 20210828 || resDate == 20210829 || resDate == 20210903 || resDate == 20210906 || resDate == 20210907 || 
		    resDate == 20210908 || resDate == 20210909 || resDate == 20210910 || resDate == 20210913 || resDate == 20210914 || 
		    resDate == 20210915 || resDate == 20210916 || resDate == 20210917 || resDate == 20210923 || resDate == 20210924 || 
		    resDate == 20210927 || resDate == 20210928 || resDate == 20210929 || resDate == 20210930 || resDate == 20211001 || 
		    resDate == 20211004 || resDate == 20211005 || resDate == 20211006 || resDate == 20211007 || resDate == 20211008 || 
		    resDate == 20211011 || resDate == 20211012 || resDate == 20211013 || resDate == 20211014 || resDate == 20211015 || 
		    resDate == 20211018 || resDate == 20211019 || resDate == 20211020 || resDate == 20211021 || resDate == 20211022 || 
		    resDate == 20211025 || resDate == 20211026 || resDate == 20211027 || resDate == 20211028 || resDate == 20211029 || 
		    resDate == 20211101 || resDate == 20211102 || resDate == 20211103 || resDate == 20211104 || resDate == 20211105 || 
		    resDate == 20211108 || resDate == 20211109 || resDate == 20211110 || resDate == 20211111 || resDate == 20211112 || 
		    resDate == 20211113 || resDate == 20211114 || resDate == 20211120 || resDate == 20211121 || resDate == 20211127 || 
		    resDate == 20211128) {
			ticketType = "Bticket";
			break;
   }else if(resDate == 20210628 || resDate == 20210629 || resDate == 20210630 || resDate == 20210701 || resDate == 20210702 || 
		    resDate == 20210705 || resDate == 20210706 || resDate == 20210707 || resDate == 20210708 || resDate == 20210709 || 
		    resDate == 20210712 || resDate == 20210713 || resDate == 20210714 || resDate == 20210715 || resDate == 20210716 || 
		    resDate == 20210719 || resDate == 20210720 || resDate == 20210721 || resDate == 20210722 || resDate == 20210723 || 
		    resDate == 20210726 || resDate == 20210727 || resDate == 20210728 || resDate == 20210804 || resDate == 20210805 || 
		    resDate == 20210806 || resDate == 20210809 || resDate == 20210810 || resDate == 20210811 || resDate == 20210812 || 
		    resDate == 20210813 || resDate == 20210816 || resDate == 20210817 || resDate == 20210818 || resDate == 20210819 || 
		    resDate == 20210820 || resDate == 20210823 || resDate == 20210824 || resDate == 20210825 || resDate == 20210826 ||
		    resDate == 20210827 || resDate == 20210830 || resDate == 20210831 || resDate == 20210901 || resDate == 20210902 ||
		    resDate == 20211115 || resDate == 20211116 || resDate == 20211117 || resDate == 20211118 || resDate == 20211119 ||
		    resDate == 20211122 || resDate == 20211123 || resDate == 20211124 || resDate == 20211125 || resDate == 20211126 || 
		    resDate == 20211129 || resDate == 20211130) {  
	   		ticketType = "Cticket";
	   		break;
    }else {
<<<<<<< HEAD
   		   	System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
   		   	continue;}
    	  	}		   
		   		   
	if(ticketType == "A ticket") {
		  Price = 60000;
		}else if(ticketType == "B ticket") {
		  Price = 56000;
		}else {
		  Price = 50000;}
		System.out.println(ticketType);
		System.out.println("¤Ñ");

		while(true) {
			System.out.print("ÁÖ¹Î¹øÈ£ ¾ÕÀÚ¸®¸¦ ÀÔ·ÂÇÏ¼¼¿ä.(e.g 910222)(0 ´©¸£¸é Ã³À½À¸·Î)\n");
=======
   		   	System.out.println("ë‹¤ì‹œ ìž…ë ¥í•´ ì£¼ì„¸ìš”.");
   		   	continue;
   	   			}
    	  	}		   
		   		   
	if(ticketType == "A ticket") {
		  Price = Price + 60000;
		} else if(ticketType == "B ticket") {
		  Price = Price + 56000;
		} else {
		  Price = Price + 50000;
		}
		System.out.println(ticketType);
		System.out.println("ã…¡");

		while(true) {
			System.out.print("ì£¼ë¯¼ë²ˆí˜¸ ì•žìžë¦¬ë¥¼ ìž…ë ¥í•˜ì„¸ìš”.(ìˆ«ìžë¡œë§Œ 950916)(0 ëˆ„ë¥´ë©´ ì²˜ìŒìœ¼ë¡œ)\n");
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
			System.out.print(": ");
			Scanner myInput2 = new Scanner(System.in);
			registNumber = myInput2.nextLine();
			if(registNumber.equals("0")) {
				break;
			} else if(registNumber.length() != 6) {
<<<<<<< HEAD
				System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
=======
				System.out.println("ë‹¤ì‹œ ìž…ë ¥í•´ ì£¼ì„¸ìš”.");
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
				continue;
			} else if(registNumber.length() == 6) {
				birthMonth = Integer.parseInt(registNumber.substring(2,4));
				birthDay = Integer.parseInt(registNumber.substring(4,6));
				if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)  ) {	
					break;
				} else {
<<<<<<< HEAD
					System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
					continue;}					
			} else {
				break;}
		}if (registNumber.equals("0")) {
			continue;}
			else {
		}birthYear = Integer.parseInt(registNumber.substring(0,2));
=======
					System.out.println("ë‹¤ì‹œ ìž…ë ¥í•´ ì£¼ì„¸ìš”.");
					continue;
				}					
			} else {
				break;
			}
		}
				if (registNumber.equals("0")) {
					continue;			
				} else {
		}
	
		birthYear = Integer.parseInt(registNumber.substring(0,2));
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
		birthDate = Integer.parseInt(registNumber.substring(2,6));

		if(0 <= birthYear && birthYear <= 30) {
			birthYear += 2000;
		} else {
			birthYear += 1900;
		}
		Age = todayYear - birthYear;
		if(todayDate < birthDate) {
			Age = Age - 1;
		} else {
<<<<<<< HEAD
			Age = Age + 0;}

		System.out.printf("¸¸ %d\n", Age);
=======
			Age = Age + 0;
		}

		System.out.printf("ë§Œ %d\n", Age);
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36

		if((19 <= Age) && (Age <= 64 ))  {
			age = "Adult";	
		} else if(65 <= Age) {
<<<<<<< HEAD
			age = "°æ·Î";
		} else if((3 <= Age) && (Age <= 12 )) {
			age = "¾î¸°ÀÌ";
=======
			age = "ê²½ë¡œ";
		} else if((3 <= Age) && (Age <= 12 )) {
			age = "ì–´ë¦°ì´";
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
			if(ticketType == "A ticket") {
				Price = 48000;
			} else if(ticketType == "B ticket") {
				Price = 44000;
			} else {
				Price = 40000;
			}
		} else if(Age < 3) {
			age = "Infant";
<<<<<<< HEAD
			Price = 0;} 
		else {
			age = "Teenager";
		}
		System.out.println("¤Ñ");

		while(true) {
			System.out.println("¸î°³¸¦ ÁÖ¹®ÇÏ½Ã°Ú½À´Ï±î?(0 ´©¸£¸é Ã³À½À¸·Î)");
			System.out.print(": ");
			Scanner input = null;
			Scanner myInput3 = new Scanner(System.in);
			Count = myInput3.nextInt();
			if(Count == 0) {
				break;
			} else {
				break;}
		}
		if(Count == 0) {
			return;}
			System.out.println("¤Ñ");

		while(true) {
			System.out.println("¿ì´ë»çÇ×À» ¼±ÅÃÇÏ¼¼¿ä.(0 ´©¸£¸é Ã³À½À¸·Î)");
			System.out.println("1. ¾øÀ½ (³ªÀÌ ¿ì´ë´Â ÀÚµ¿Ã³¸®)");
			System.out.println("2. Àå¾ÖÀÎ");
			System.out.println("3. ±¹°¡À¯°øÀÚ");
			System.out.println("4. ´ÙÀÚ³à");
			System.out.println("5. ÀÓ»êºÎ");
=======
			Price = 0;
		} else {
			age = "Teenager";
		}
		System.out.println("ã…¡");

		while(true) {
			System.out.println("ëª‡ê°œë¥¼ ì£¼ë¬¸í•˜ì‹œê² ìŠµë‹ˆê¹Œ?(0 ëˆ„ë¥´ë©´ ì²˜ìŒìœ¼ë¡œ)");
			System.out.print(": ");
			Scanner myInput3 = new Scanner(System.in);
			Count = myInput3.nextInt();
			if(Count == 0) {
				break;
			} else {
				break;
			}
		}
		if(Count == 0) {
			return;
		}
			System.out.println("ã…¡");

		while(true) {
			System.out.println("ìš°ëŒ€ì‚¬í•­ì„ ì„ íƒí•˜ì„¸ìš”.(0 ëˆ„ë¥´ë©´ ì²˜ìŒìœ¼ë¡œ)");
			System.out.println("1. ì—†ìŒ (ë‚˜ì´ ìš°ëŒ€ëŠ” ìžë™ì²˜ë¦¬)");
			System.out.println("2. ìž¥ì• ì¸");
			System.out.println("3. êµ­ê°€ìœ ê³µìž");
			System.out.println("4. ë‹¤ìžë…€");
			System.out.println("5. ìž„ì‚°ë¶€");
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
			System.out.print(": ");
			Scanner myInput4 = new Scanner(System.in);
			Prior = myInput4.nextInt();
			if(0 <= Prior && Prior <=5 ) {
				break;
			} else {
<<<<<<< HEAD
				System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			continue;}
		}if(Prior == 0) {
		continue;}
		
		switch(Prior) {
		case 1: b = "¿ì´ëÀû¿ë ¾øÀ½"; break;
		case 2: b = "Àå¾ÖÀÎ ¿ì´ëÀû¿ë"; 
		if(ticketType == "A ticket") {
			if(age == "Adult") {Price = 36000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 28000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult") {Price = 33000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 26000;}
		} else {
			if(age == "Adult") {Price = 30000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 24000;}
		} break;
		case 3: b = "±¹°¡À¯°øÀÚ ¿ì´ëÀû¿ë"; 
		if(ticketType == "A ticket") {
			if(age == "Adult") {Price = 30000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 24000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult") {Price = 28000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 22000;}
		} else {
			if(age == "Adult") {Price = 25000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 20000;}
		} break;
		case 4: b = "´ÙÀÚ³à ¿ì´ëÀû¿ë"; 
		if(ticketType == "A ticket") {
			if(age == "Adult" || age == "Teenager") {Price = 48000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 38000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult" || age == "Teenager") {Price = 44000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 35000;}
		} else {
			if(age == "Adult" || age == "Teenager") {Price = 40000;
			} else if(age == "Infant") {Price = 0;
			} else {Price = 32000;}
		} break;
		case 5: b = "ÀÓ»êºÎ ¿ì´ëÀû¿ë"; 
		if(ticketType == "A ticket") {
			if(age == "Infant") {Price = 0;
			} else {Price = 51000;}
		} else if(ticketType == "B ticket") {
			if(age == "Infant") {Price = 0;
			} else {Price = 47000;}
		} else {
			if(age == "Infant") {Price = 0;
			} else {Price = 42000;}
		} break;
	}
		System.out.print("1. Ãß°¡±¸¸Å, 2. ±¸¸ÅÁ¾·á");
		Scanner myInput5 = new Scanner(System.in);
		addOrder = myInput5.nextInt();  
		
		arrTicket.add(ticketType);		
		arrAge.add(age);
		arrCount.add(Count);
		arrPrice.add(Price);
		arrB.add(b);
		orderCount ++ ;
    }while(addOrder == 1);
    
    for(int i=0; i<arrPrice.size();i++) {
    	totalPrice += arrPrice.get(i) * arrCount.get(i);}
    
    System.out.println("°¡°ÝÀº" + totalPrice +"¿øÀÔ´Ï´Ù. \n°¨»çÇÕ´Ï´Ù.");
    System.out.println("=============== ¿¡¹ö·£µå =================");     
	
    for(int index = 0; index < orderCount; index++) {
    System.out.printf("%s  %s  X  %d  %d  %s\n", arrTicket.get(index), arrAge.get(index),
    		  						arrCount.get(index), arrPrice.get(index)*arrCount.get(index), arrB.get(index));
      			}
	System.out.println("========================================");
   		}
   }
}
=======
				System.out.println("ë‹¤ì‹œ ìž…ë ¥í•´ ì£¼ì„¸ìš”.");
				continue;
			}
		}
			if(Prior == 0) {
				continue;
		}
		
		switch(Prior) {
		case 1: b = "ìš°ëŒ€ì ìš© ì—†ìŒ"; break;
		case 2: b = "ìž¥ì• ì¸ ìš°ëŒ€ì ìš©"; 
		if(ticketType == "A ticket") {
			if(age == "Adult") {
				Price = 36000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 28000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult") {
				Price = 33000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 26000;}
		} else {
			if(age == "Adult") {
				Price = 30000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 24000;}
		} break;
		case 3: b = "êµ­ê°€ìœ ê³µìž ìš°ëŒ€ì ìš©"; 
		if(ticketType == "A ticket") {
			if(age == "Adult") {
				Price = 30000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 24000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult") {
				Price = 28000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 22000;}
		} else {
			if(age == "Adult") {
				Price = 25000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 20000;}
		} break;
		case 4: b = "ë‹¤ìžë…€ ìš°ëŒ€ì ìš©"; 
		if(ticketType == "A ticket") {
			if(age == "Adult" || age == "Teenager") {
				Price = 48000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 38000;}
		} else if(ticketType == "B ticket") {
			if(age == "Adult" || age == "Teenager") {
				Price = 44000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 35000;}
		} else {
			if(age == "Adult" || age == "Teenager") {
				Price = 40000;
			} else if(age == "Infant") {
				Price = 0;
			} else {Price = 32000;}
		} break;
		case 5: b = "ìž„ì‚°ë¶€ ìš°ëŒ€ì ìš©"; 
		if(ticketType == "A ticket") {
			if(age == "Infant") {
				Price = 0;
			} else {Price = 51000;}
		} else if(ticketType == "B ticket") {
			if(age == "Infant") {
				Price = 0;
			} else {Price = 47000;}
		} else {
			if(age == "Infant") {
				Price = 0;
			} else {Price = 42000;}
		} break;
		
		}
		System.out.print("1. ì¶”ê°€êµ¬ë§¤, 2. êµ¬ë§¤ì¢…ë£Œ");
		Scanner myInput5 = new Scanner(System.in);
		addOrder = myInput5.nextInt();
		
		saveTicket[orderCount] = ticketType;
		saveAge[orderCount] = age;
		saveCount[orderCount] = Count;
		savePrice[orderCount] = Price;
		saveb[orderCount] = b;
		orderCount ++ ;
      }while(addOrder == 1);
      
      System.out.println("ê°€ê²©ì€" + Price +"ì›ìž…ë‹ˆë‹¤. \nê°ì‚¬í•©ë‹ˆë‹¤.");
      System.out.println("=============== ì—ë²„ëžœë“œ =================");
     
	for(int index = 0; index < orderCount; index++) {
    System.out.printf("%s  %s  X  %d  %d  %s\n", saveTicket[index], saveAge[index],
    		  						saveCount[index], savePrice[index], saveb[index]);
	}
    System.out.println("========================================");
    break;
      			}

   		}
}
>>>>>>> e95421018a241daa401d6712a7359f27e51f0a36
