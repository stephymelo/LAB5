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
	
	
	public int ayuda() {
		return logic.getS();
	}

	public int a() {
		return logic.getA();
	}
	public int b() {
		return logic.getB();
	}

	
	
	public void addSortList() {
		logic.addSortList();
	}

	public void mouseClick() {
		
		logic.swapping();
		logic.downloadString();
		
	}
	
	
	
	
}
