package standard;

import java.util.Scanner;
import java.util.HashMap;

public class Everwork {

	public static void main(String[] args) {		
		HashMap<Integer, String> calendarWithPriceGrade = new HashMap<Integer, String>();
		calendarWithPriceGrade.put(20210601, "B");
		calendarWithPriceGrade.put(20210602, "B");
		calendarWithPriceGrade.put(20210603, "B");
		calendarWithPriceGrade.put(20210604, "B");
		calendarWithPriceGrade.put(20210605, "B");
		calendarWithPriceGrade.put(20210606, "B");
		calendarWithPriceGrade.put(20210607, "B");
		calendarWithPriceGrade.put(20210608, "B");
		calendarWithPriceGrade.put(20210609, "B");
		calendarWithPriceGrade.put(20210611, "B");
		calendarWithPriceGrade.put(20210612, "B");
		calendarWithPriceGrade.put(20210613, "B");
		calendarWithPriceGrade.put(20210614, "C");
		calendarWithPriceGrade.put(20210615, "C");
		calendarWithPriceGrade.put(20210616, "C");
		calendarWithPriceGrade.put(20210617, "C");
		calendarWithPriceGrade.put(20210618, "C");
		calendarWithPriceGrade.put(20210619, "B");
		calendarWithPriceGrade.put(20210620, "B");
		calendarWithPriceGrade.put(20210621, "C");
		calendarWithPriceGrade.put(20210622, "C");
		calendarWithPriceGrade.put(20210623, "C");
		calendarWithPriceGrade.put(20210624, "C");
		calendarWithPriceGrade.put(20210625, "C");
		calendarWithPriceGrade.put(20210626, "B");
		calendarWithPriceGrade.put(20210627, "B");
		calendarWithPriceGrade.put(20210628, "C");
		calendarWithPriceGrade.put(20210629, "C");
		calendarWithPriceGrade.put(20210630, "C");
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
		int date, qty, privilege;
		System.out.print("�̿볯¥�� �Է����ּ���. (���ڷθ� e.g 20210628) \n");
		date = input.nextInt();
		String currentGradeOfDay = calendarWithPriceGrade.get(date);
		System.out.print("�� ���̸� �Է����ּ��� \n");
		int age =input.nextInt();
		int ticketPrice =-1;	
		System.out.print("��� �ֹ��Ͻðڽ��ϱ�? \n");
		qty = input.nextInt();
		System.out.print("�������� �����ϼ���. \n");
		System.out.print("1. ����(���� ���� �ڵ�ó��) \n2. ����� \n3. ���������� \n4. ���ڳ� \n5. �ӻ�� \n");
		privilege = input.nextInt();
	
		String byAge ="nothing";
		switch(privilege) {
		case 1:
			if(3<age & age <13  ) {
				byAge = "kidOrElderly";		
			}
			else if(14 < age & age <65) {
				byAge ="adultOrTeenager";
			} else {
				byAge = "kidOrElderly";
			}
			
			if(byAge == "adultOrTeenager") {
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 60000;
					break;
				case "B" :
					ticketPrice = 56000;
					break;
				case "C" :
					ticketPrice = 50000;
				}
			}
			else if(byAge == "kidOrElderly") {
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 48000;
					break;
				case "B" :
					ticketPrice = 44000;
					break;
				case "C" :
					ticketPrice = 40000;
				}
			}
		break;
		case 2:
			if(19<age & age <=65) {
				byAge ="adult";
			} else {
				byAge ="kidOrTeanagerOrElderly";
			}
			if(byAge=="adult") {
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 36000;
					break;
				case "B" :
					ticketPrice = 33000;
					break;
				case "C" :
					ticketPrice = 30000;
				}
			} else if(byAge == "kidOrTeanagerOrElderly") {
				switch(currentGradeOfDay) {
			case "A" :
				ticketPrice = 28000;
				break;
			case "B" :
				ticketPrice = 26000;
				break;
			case "C" :
				ticketPrice = 24000;
				break;
			}
			}
			break;
		case 3:
			if(19<age & age <=65) {
				byAge ="adult";
			} else {
				byAge ="kidOrTeanagerOrElderly";
			}
			if(byAge=="adult") {
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 30000;
					break;
				case "B" :
					ticketPrice = 28000;
					break;
				case "C" :
					ticketPrice = 25000;
				}
			} else if(byAge == "kidOrTeanagerOrElderly") {
				switch(currentGradeOfDay) {
			case "A" :
				ticketPrice = 24000;
				break;
			case "B" :
				ticketPrice = 22000;
				break;
			case "C" :
				ticketPrice = 20000;
				break;
			}
			}
		break;
		case 4:
			if(13<=age & age <=65) {
				byAge ="adultOrTeenager";
			} else {
				byAge ="kidOrElderly";
			}
			
			if(byAge=="adultOrTeenager") {
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 48000;
					break;
				case "B" :
					ticketPrice = 44000;
					break;
				case "C" :
					ticketPrice = 40000;
				}
			} else if(byAge == "kidOrElderly") {
				switch(currentGradeOfDay) {
			case "A" :
				ticketPrice = 38000;
				break;
			case "B" :
				ticketPrice = 35000;
				break;
			case "C" :
				ticketPrice = 32000;
				break;
			}
			}
		break;	
		case 5:
			byAge = "adult";
		
				switch(currentGradeOfDay) {
				case "A" :
					ticketPrice = 51000;
					break;
				case "B" :
					ticketPrice = 47000;
					break;
				case "C" :
					ticketPrice = 42000;
				}
				break;			
		}
		String byAgeText ="";
		switch(byAge) {
		case "adult" :
			byAgeText="����";
			break;
		case "kid" :
			byAgeText="����";
			break;
		case "elderly" :
			byAgeText="���";
			break;
		case "teenager" : 
			byAgeText ="û�ҳ�";
			break;
		case "adultOrTeenager":
			byAgeText ="����/û�ҳ�";
			break;
		case "kidOrElderly":
			byAgeText = "����/���";
			break;
		case "kidOrTeanagerOrElderly":
			byAgeText ="�Ҿ�/û�ҳ�/���";
			break;
		}	
		String privilegeText="nothing";
		switch(privilege) {
		case 1:
			privilegeText ="����";
			break;
			
		case 2:
			privilegeText ="����� �������";
			break;
			
		case 3:
			privilegeText ="���������� �������";
			break;
			
		case 4:
			privilegeText ="���ڳ� ��� �������";
			break;
			
		case 5:
			privilegeText ="�ӻ�� ��� ����";
			break;	
		}
		System.out.println("=============== �������� ================");
		System.out.println(currentGradeOfDay+ "Ƽ�� "+ byAgeText+" X"+ qty+ "  " +ticketPrice * qty +"��  * "+ privilegeText  );
		System.out.println("=============== �������� ================");
		System.out.println("������ " +ticketPrice * qty +"�� �Դϴ�. \n�����մϴ�."  );
	}
}
