package standard;

import java.util.Scanner;
import java.util.HashMap;

public class Everwork {

	public static void main(String[] args) {		
		HashMap<Integer, String> calendarWithPriceGrade = new HashMap<Integer, String>();
calendarWithPriceGrade.put(20210601, "B"); calendarWithPriceGrade.put(20210602, "B"); calendarWithPriceGrade.put(20210603, "B"); calendarWithPriceGrade.put(20210604, "B");
calendarWithPriceGrade.put(20210605, "B"); calendarWithPriceGrade.put(20210606, "B"); calendarWithPriceGrade.put(20210607, "B"); calendarWithPriceGrade.put(20210608, "B");
calendarWithPriceGrade.put(20210609, "B"); calendarWithPriceGrade.put(20210611, "B"); calendarWithPriceGrade.put(20210612, "B"); calendarWithPriceGrade.put(20210613, "B");
calendarWithPriceGrade.put(20210614, "C"); calendarWithPriceGrade.put(20210615, "C"); calendarWithPriceGrade.put(20210616, "C"); calendarWithPriceGrade.put(20210617, "C");
calendarWithPriceGrade.put(20210618, "C"); calendarWithPriceGrade.put(20210619, "B"); calendarWithPriceGrade.put(20210620, "B"); calendarWithPriceGrade.put(20210621, "C");
calendarWithPriceGrade.put(20210622, "C"); calendarWithPriceGrade.put(20210623, "C"); calendarWithPriceGrade.put(20210624, "C"); calendarWithPriceGrade.put(20210625, "C");
calendarWithPriceGrade.put(20210626, "B"); calendarWithPriceGrade.put(20210627, "B"); calendarWithPriceGrade.put(20210628, "C"); calendarWithPriceGrade.put(20210629, "C");
calendarWithPriceGrade.put(20210630, "C"); 
calendarWithPriceGrade.put(20210701, "C"); calendarWithPriceGrade.put(20210702, "C"); calendarWithPriceGrade.put(20210703, "B");
calendarWithPriceGrade.put(20210704, "B"); calendarWithPriceGrade.put(20210705, "C"); calendarWithPriceGrade.put(20210706, "C"); calendarWithPriceGrade.put(20210707, "C");
calendarWithPriceGrade.put(20210708, "C"); calendarWithPriceGrade.put(20210709, "C"); calendarWithPriceGrade.put(20210710, "B"); calendarWithPriceGrade.put(20210711, "B");
calendarWithPriceGrade.put(20210712, "C"); calendarWithPriceGrade.put(20210713, "C"); calendarWithPriceGrade.put(20210714, "C"); calendarWithPriceGrade.put(20210715, "C");
calendarWithPriceGrade.put(20210716, "C"); calendarWithPriceGrade.put(20210717, "B"); calendarWithPriceGrade.put(20210718, "B"); calendarWithPriceGrade.put(20210719, "C");
calendarWithPriceGrade.put(20210720, "C"); calendarWithPriceGrade.put(20210721, "C"); calendarWithPriceGrade.put(20210722, "C"); calendarWithPriceGrade.put(20210723, "C");
calendarWithPriceGrade.put(20210724, "B"); calendarWithPriceGrade.put(20210725, "B"); calendarWithPriceGrade.put(20210726, "C"); calendarWithPriceGrade.put(20210727, "C");
calendarWithPriceGrade.put(20210728, "C"); calendarWithPriceGrade.put(20210729, "B"); calendarWithPriceGrade.put(20210730, "B"); calendarWithPriceGrade.put(20210731, "B");
calendarWithPriceGrade.put(20210801, "B"); calendarWithPriceGrade.put(20210802, "B"); calendarWithPriceGrade.put(20210803, "B"); calendarWithPriceGrade.put(20210804, "C"); 
calendarWithPriceGrade.put(20210805, "C"); calendarWithPriceGrade.put(20210806, "C"); calendarWithPriceGrade.put(20210807, "B"); calendarWithPriceGrade.put(20210808, "B"); 
calendarWithPriceGrade.put(20210809, "C"); calendarWithPriceGrade.put(20210810, "C"); calendarWithPriceGrade.put(20210811, "C"); calendarWithPriceGrade.put(20210812, "C"); 
calendarWithPriceGrade.put(20210813, "C"); calendarWithPriceGrade.put(20210814, "B"); calendarWithPriceGrade.put(20210815, "B"); calendarWithPriceGrade.put(20210816, "C"); 
calendarWithPriceGrade.put(20210817, "C"); calendarWithPriceGrade.put(20210818, "C"); calendarWithPriceGrade.put(20210819, "C"); calendarWithPriceGrade.put(20210820, "C"); 
calendarWithPriceGrade.put(20210821, "B"); calendarWithPriceGrade.put(20210822, "B"); calendarWithPriceGrade.put(20210823, "C"); calendarWithPriceGrade.put(20210824, "C"); 
calendarWithPriceGrade.put(20210825, "C"); calendarWithPriceGrade.put(20210826, "C"); calendarWithPriceGrade.put(20210827, "C"); calendarWithPriceGrade.put(20210828, "B"); 
calendarWithPriceGrade.put(20210829, "B"); calendarWithPriceGrade.put(20210830, "C"); calendarWithPriceGrade.put(20210831, "C"); 
calendarWithPriceGrade.put(20210901, "C"); calendarWithPriceGrade.put(20210902, "C"); calendarWithPriceGrade.put(20210903, "B"); calendarWithPriceGrade.put(20210904, "A");
calendarWithPriceGrade.put(20210905, "A"); calendarWithPriceGrade.put(20210906, "B"); calendarWithPriceGrade.put(20210907, "B"); calendarWithPriceGrade.put(20210908, "B");
calendarWithPriceGrade.put(20210909, "B"); calendarWithPriceGrade.put(20210910, "B"); calendarWithPriceGrade.put(20210911, "A"); calendarWithPriceGrade.put(20210912, "A");
calendarWithPriceGrade.put(20210913, "B"); calendarWithPriceGrade.put(20210914, "B"); calendarWithPriceGrade.put(20210915, "B"); calendarWithPriceGrade.put(20210916, "B");
calendarWithPriceGrade.put(20210917, "B"); calendarWithPriceGrade.put(20210918, "A"); calendarWithPriceGrade.put(20210919, "A"); calendarWithPriceGrade.put(20210920, "A");
calendarWithPriceGrade.put(20210921, "A"); calendarWithPriceGrade.put(20210922, "A"); calendarWithPriceGrade.put(20210923, "B"); calendarWithPriceGrade.put(20210924, "B");
calendarWithPriceGrade.put(20210925, "A"); calendarWithPriceGrade.put(20210926, "A"); calendarWithPriceGrade.put(20210927, "B"); calendarWithPriceGrade.put(20210928, "B");
calendarWithPriceGrade.put(20210929, "B"); calendarWithPriceGrade.put(20210930, "B");

		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
		int date, qty, privilege;
		System.out.print("�̿볯¥�� �Է����ּ���. (���ڷθ� e.g 20210625) \n");
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
				byAge = "kidOrElderly";	}
			else if(14 < age & age <65) {
				byAge ="adultOrTeenager";
			}else {
				byAge = "kidOrElderly";}
			if(byAge == "adultOrTeenager") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 60000;
				break;
			case "B" : ticketPrice = 56000;
				break;
			case "C" : ticketPrice = 50000;}
			}else if(byAge == "kidOrElderly") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 48000;
				break;
			case "B" : ticketPrice = 44000;
				break;
			case "C" : ticketPrice = 40000;}
			}break;
			case 2:
			if(19<age & age <=65) {
				byAge ="adult";
			} else {
			byAge ="kidOrTeanagerOrElderly";
			} if(byAge=="adult") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 36000;
				break;
			case "B" : ticketPrice = 33000;
				break;
			case "C" : ticketPrice = 30000;}
			} else if(byAge == "kidOrTeanagerOrElderly") {
				switch(currentGradeOfDay) {
			case "A" : ticketPrice = 28000;
				break;
			case "B" : ticketPrice = 26000;
				break;
			case "C" : ticketPrice = 24000;
				break;}
			}break;
			case 3:
			if(19<age & age <=65) {byAge ="adult";
			} else {byAge ="kidOrTeanagerOrElderly";
			} if(byAge=="adult") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 30000;
				break;
			case "B" : ticketPrice = 28000;
				break;
			case "C" : ticketPrice = 25000;}
			} else if(byAge == "kidOrTeanagerOrElderly") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 24000;
			break;
			case "B" : ticketPrice = 22000;
			break;
			case "C" : ticketPrice = 20000;
			break;}}
			break;
			case 4:
			if(13<=age & age <=65) {
			byAge ="adultOrTeenager";
			} else {byAge ="kidOrElderly";
			}if(byAge=="adultOrTeenager") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 48000;
			break;
			case "B" : ticketPrice = 44000;
			break;
			case "C" : ticketPrice = 40000;}
			} else if(byAge == "kidOrElderly") {
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 38000;
			break;
			case "B" : ticketPrice = 35000;
			break;
			case "C" : ticketPrice = 32000;
			break;
			}}
			break;	
			case 5:
			byAge = "adult";
			switch(currentGradeOfDay) {
			case "A" : ticketPrice = 51000;
			break;
			case "B" : ticketPrice = 47000;
			break;
			case "C" : ticketPrice = 42000;}
			break;}
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
			break;}	
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
			break;	}
		System.out.println("=============== �������� ================");
		System.out.println(currentGradeOfDay+ "Ƽ�� "+ byAgeText+" X"+ qty+ "  " +ticketPrice * qty +"��  * "+ privilegeText  );
		System.out.println("=============== �������� ================");
		System.out.println("������ " +ticketPrice * qty +"���Դϴ�. \n�����մϴ�."  );
	}
}