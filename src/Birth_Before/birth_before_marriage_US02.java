//Auther:Song Xu
package Birth_Before;

import datecheck.checkdate_US01;

public class birth_before_marriage_US02 {
	public static void main(String[] args) {
		System.out.println(birth_before_marriage("28 JAN 2019","28 JAN 2019"));
		System.out.println(birth_before_marriage("17 JAN 2019","28 JAN 2019"));
		System.out.println(birth_before_marriage("28 JAN 2019","28 FEB 2019"));
		System.out.println(birth_before_marriage("28 JAN 2018","28 JAN 2019"));
		System.out.println(birth_before_marriage("28 JAN 2019","18 JAN 2019"));
		System.out.println(birth_before_marriage("28 FEB 2019","28 JAN 2019"));
		System.out.println(birth_before_marriage("28 JAN 2019","28 JAN 2018"));
		
	}
	public static boolean birth_before_marriage(String birth_date,String marriage_date){
		String[] birth=birth_date.split(" ");
		String[] marriage=marriage_date.split(" ");

		if(checkdate_US01.checkyear(marriage[2], birth[2])) {
			if(checkdate_US01.checkmonth(marriage[1], birth[1])) {
				if(checkdate_US01.checkday(marriage[0], birth[0])) {
					return true;
				}
			}
		}
		return false;
	}

}
