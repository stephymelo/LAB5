package model;

import java.util.Comparator;

public class PerroRaza implements Comparator<Perro> {

	
	public int compare(Perro o1, Perro o2) {
		return (o1.getRaza().compareTo(o2.getRaza()));
		
	}
	
 
}
