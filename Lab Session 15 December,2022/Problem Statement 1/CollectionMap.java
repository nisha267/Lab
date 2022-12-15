package assignment;

import java.util.HashMap;

import java.util.Map;

public class CollectionMap {
		
		HashMap<String,String> M1 =new HashMap<String,String>();//creating hashmap
		
		public void storeCountryCapital(String CountryName, String capital) {//1st method
			M1.put(CountryName, capital);
			System.out.println();}
		
		public void retrieveCapital(String CountryName) {
			for(Map.Entry m:M1.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
		}	
		}
		
		public void retrieveCountry(String capitalName) {
			for(Map.Entry m:M1.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
		}}
			
			
		
		
		
		
			
			
public static void main(String[] args) {
	CollectionMap c=new CollectionMap();
	System.out.println("Country and capital name");
	c.storeCountryCapital("India", "Delhi");
	c.storeCountryCapital("USA", "Washington DC");
	c.storeCountryCapital("Japan", "Tokyo");
	System.out.println("------------");
	System.out.println("Show the name of the ");
	c.retrieveCapital("Japan");
	c.retrieveCountry("Delhi");
}			
	
}
