//Movie Theatre Management System, where you can create two classes one is main another one is movie, 
//movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
//MovieTicketPrice as instance variables
package lab;
class Movie
{
	private String moviename;//creating instance variable
	private String movieStarttime;
	private String movieendtime;
	private int MovieTprice;
	public void setMovie(String mn,String mst,String met,int ticket) {
		moviename=mn;
		movieStarttime=mst;
		movieendtime=met;
		MovieTprice=ticket;
	}
	public void getMovie() {
		System.out.println("Movie name: "+moviename+"\nStart Time:"+movieStarttime+"\nEnd Time: "+movieendtime+"\nTicket price:"+MovieTprice );
}}
public class MovieMain {
	public static void main(String[] args) {
		Movie m=new Movie();
		m.setMovie("KGF Chapter 2", "11:30 am", "2:30 pm",250);
		
		m.getMovie();
		
	}
		
	}


