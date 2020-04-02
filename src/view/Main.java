package view;

import controller.ControllerGame;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private ControllerGame controller; 
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(1100,600);
	}

	public void setup() {
		controller = new ControllerGame(this);
//        controller.addDogList(controller.listPerro());
		
	}

	public void draw() {
		background(255);
		
		paintButtons();
		for (int i = 0; i < controller.listPerro().size(); i++) {
			controller.listPerro().get(i).draw((i*(100))+70,this);
		}
		
	
	}
	
	
	
	public void paintButtons() {
		text("Ordenar Peluditos por",450,height/2);
		noStroke();
		fill(254,180,164);
		rect(100,400,150,50);
		rect(350,400,150,50);
		rect(600,400,150,50);
		rect(850,400,150,50);
		fill(164,250,254);
		rect(450,500,150,50);
		fill(0);
		text("ID",170,420);
		text("Nombre",420,420);
		text("Raza",670,420);
		text("Edad",920,420);
		text("Descargar Nuevo TXT",470,530);
	}
	
	
	public void mousePressed() {
		
		
		controller.mouseClick();

		
		
	}
}
