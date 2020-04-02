package model;

import java.util.Comparator;

public class PerroEdad implements Comparator<Perro> {

	
	public int compare(Perro o1, Perro o2) {
		return o1.getEdad() - o2.getEdad();
		
	}
	
 

}
