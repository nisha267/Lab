package lab;
/*Problem Statement 1:
	 Write a program to display the current system date in the following formats.
	Tue Nov 04 20:14:11 EST 2003
	 11/4/03 8:14 PM
	8:14:11 PM
	Nov 4, 2003 8:14:11 PM
	8:14 PM
	8:14:11 PM
	8:14:11 PM EST
	11/4/03 8:14 PM
	Nov 4, 2003 8:14 PM
	November 4, 2003 8:14:11 PM EST

	Note: Sample date is used for illustration. 
	Hint: Use simple and Date formatter to format the date.

	Problem Statement 2:
	Write a program which increments the current date with 10 days and display it in console.
	Hint:  Use Calendar object.
	Problem Statement 3:
	Write a program to print the current system date in the following format using Canada  locale.
	Thursday, 19 January 2012*/



import java.text.DateFormat;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        //  a new Date objectfor util.date to initialize to the current time.
        Date d = new Date();

        // See what toString() returns
        System.out.println( d.toString());//to show the default timing

        
        System.out.println(DateFormat.getInstance().format(d));//printing the default format
        System.out.println( DateFormat.getTimeInstance().format(d));//only showing time
        System.out.println( DateFormat.getDateTimeInstance().format(d));
        System.out.println( DateFormat.getTimeInstance(DateFormat.SHORT).format(d));
        System.out.println( DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d));
        System.out.println(  DateFormat.getTimeInstance(DateFormat.LONG).format(d));
        System.out.println( DateFormat.getDateTimeInstance ( DateFormat.SHORT, DateFormat.SHORT).format(d));
        System.out.println( DateFormat.getDateTimeInstance( DateFormat.MEDIUM, DateFormat.SHORT).format(d));
        System.out.println( DateFormat.getDateTimeInstance( DateFormat.LONG, DateFormat.LONG).format(d));
    }
}
