package date.and.time.project;

public class Alogo {

	
	static int centauryCode,centauryValue,decadeValue
		,monthCode,weekdayPosition;
	static int year = 1400,month = 01,day = 01;
	static String[] weekChart = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
	static int[] monthChart = {0,3,3,6,1,4,6,2,5,0,3,5};
		
	static int[] centauryChart = {2,0,6,4};
	static int centIndex = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println( findWeekday(1995,6,9) );
    	

	}
	
    public static String findWeekday(int year,int month, int day) {
    	
    	monthCode = monthChart[ month - 1 ];
    	decadeValue = Integer.parseInt(String.valueOf( year ).substring(2, 4));
    	centauryValue = Integer.parseInt(String.valueOf( year ).substring(0, 2));
    	centIndex = (centauryValue - 14) % 4;
    	centauryCode = centauryChart[centIndex];
    	
    	weekdayPosition = day;
    	weekdayPosition =  weekdayPosition % 7;
    	System.out.println( (weekChart[weekdayPosition]) );
    	
    	weekdayPosition = day + monthCode;
    	weekdayPosition =  weekdayPosition % 7;
    	System.out.println( (weekChart[weekdayPosition]) );
    	
    	weekdayPosition = day + monthCode + centauryCode;
    	weekdayPosition =  weekdayPosition % 7;
    	System.out.println( (weekChart[weekdayPosition]) );
    	
    	weekdayPosition = day + monthCode + centauryCode + decadeValue;
    	weekdayPosition =  weekdayPosition % 7;
    	System.out.println( (weekChart[weekdayPosition]) );
    	
    	weekdayPosition = day + monthCode + centauryCode + decadeValue + Math.floorDiv(decadeValue, 4);
    	weekdayPosition =  weekdayPosition % 7;
    	System.out.println( (weekChart[weekdayPosition]) );
    	
        if( isLeapYear( year ) ){
            weekdayPosition -= 1;
            weekdayPosition =  weekdayPosition < 0 ? weekdayPosition + 7 : weekdayPosition;
        }
    	
    	return ( (weekChart[weekdayPosition]) );
    }
    
    public static boolean isLeapYear(int year) {
    	
    	 if( ( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 ) ){
    		 return true;
    	 }else {
    		 return false;
    	 }

    }
    
    public static String fixDate(String date) {

    	
    	
    	
    	return "";
    }

	
}
