package view;

import controller.ControllerGame;
import processing.core.PApplet;

public class Main extends PApplet {

	private ControllerGame controller; 
	private boolean mostrarAyuda,mostrarText;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(1100,600);


	}

	public void setup() {
		controller = new ControllerGame(this);
		mostrarAyuda=true;
		mostrarText=false;

	}

	public void draw() {
		background(255);

		paintButtons();
		for (int i = 0; i < controller.listPerro().size(); i++) {
			controller.listPerro().get(i).draw((i*(100))+70,this);	
		}
	}



	public void paintButtons() {
		textSize(12);
		text("Ordenar Peluditos por",450,height/2);
		noStroke();
		fill(254,180,164);
		rect(100,400,150,50);
		rect(350,400,150,50);
		rect(600,400,150,50);
		rect(850,400,150,50);
		fill(164,250,254);
		rect(450,500,150,50);
		fill(255, 158, 192);
		rect(690,500,150,50);
		fill(0);
		text("Intercambiar posicion",700,530);
		text("ID",170,420);
		text("Nombre",400,420);
		text("Raza",660,420);
		text("Edad",915,420);
		text("Descargar Nuevo TXT",460,530);

		if(mouseX>690&&mouseY>500&&mouseX<690+150&&mouseY<550&&controller.ayuda()!=2&&mostrarAyuda==true) {
			text("Seleccionar dos perros primero",680,490);

			if(controller.ayuda()==0 && controller.ayuda()==1) {
				mostrarAyuda=false;
			}
		}


		if(controller.ayuda()==1) {
			mostrarText=true;
		}
		if(mostrarText==true) {
			text("Seleccionaste",700,300);
			text("Posicion"+controller.a(),800,300);	
		}

		if(controller.ayuda()==2) {
			text("Y",880,300);
			text("Posicion"+controller.b(),900,300);	
		}	
		if(controller.ayuda()==0) {
			mostrarText=false;
			
		}

	}
	
	

	public void mousePressed() {
		controller.mouseClick();
		controller.addSortList();
		
	}
}

	
