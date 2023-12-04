package date.and.time.project;


public class DateAndTimeProject {
        
    public static void main(String[] args) {
        // TODO code application logic here       
       Datee today = new Datee(2004,2,17);
       Datee myBirthday = new Datee(2003,12,23);
       Datee leapYearDay = new Datee(2004,2,29);
       Datee futureDay = new Datee(2050,12,31);
       Datee oldDay = new Datee(1950,12,31);

       looping(today,1,30);
       
      System.out.println("Today:"); 
      System.out.println( today.toString() );
      System.out.println( Datee.printFormatedDate(today));
      
      System.out.println("My birthday:"); 
      System.out.println( myBirthday.toString() );
      System.out.println( Datee.printFormatedDate(myBirthday));
      
      System.out.println("leap year:"); 
      System.out.println( leapYearDay.toString() );
      System.out.println( Datee.printFormatedDate(leapYearDay));
      
      System.out.println("Futre year end:"); 
      System.out.println( futureDay.toString() );
      System.out.println( Datee.printFormatedDate(futureDay));
      
      System.out.println("Old year end:"); 
      System.out.println( oldDay.toString() );
      System.out.println( Datee.printFormatedDate(oldDay));

       

    }
    
    public static void looping(Datee date,int startDay,int endDay) {


    	for (int dayIterrator = startDay; dayIterrator <= endDay; dayIterrator++) {
    		date.setDay(dayIterrator);
			System.out.println(Datee.printFormatedDate(date));
		}
    	
    }
    
  

}