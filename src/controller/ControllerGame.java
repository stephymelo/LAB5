package controller;



import java.util.LinkedList;

import model.Logic;
import model.Perro;
import processing.core.PApplet;

public class ControllerGame {

	private Logic logic;

	public ControllerGame(PApplet app) {
		logic = new Logic(app);
	}
	

	public LinkedList<Perro> listPerro() {
		return logic.getListPerro();
	} 
	



	public void mouseClick() {
		logic.addSortList();
		
		logic.swapping();
		logic.downloadString();
		
	}
	
	
	
	
}
