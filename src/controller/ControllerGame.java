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
	
//	public void listaPerros(){
//	   logic.listaPerros();		
//	}
	
	public LinkedList<Perro> listPerro() {
		return logic.getListPerro();
	} 
	

//	public void addElementList(){
//		logic.tabla(iD,nombre,raza,edad);		
//	}
//	

	public void mouseClick() {
		logic.addSortList();
		logic.downloadString();
		
	}
	
	
	
	
}
