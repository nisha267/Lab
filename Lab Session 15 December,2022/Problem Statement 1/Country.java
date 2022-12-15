package assignment;

import java.util.HashSet;
import java.util.Iterator;

class Country1 {
	String Country;//instance variable
	HashSet<String>H1=new HashSet<String>();//creating hashset
	public HashSet<String> storeCountryNames(String CountryName){//creating method
	H1.add(CountryName);//adding value
	return H1;
	}
	public void retrieveCountry(String CountryName) {//creating 
		if(H1.contains(CountryName)) {
			System.out.println(CountryName+"is present in HashSet");
		}
		else {
			System.out.println("Null");
		}
			}
	
	public static void main(String[] args) {
		Country1 c=new Country1();
		System.out.println("HashSet Country"+c.storeCountryNames("India"));
		System.out.println("HashSet Country"+c.storeCountryNames("Australia"));
		System.out.println("HashSet country"+ c.storeCountryNames("USA"));
		
		c.retrieveCountry("India");
		c.retrieveCountry("Srilanka");
		
		}}
	
