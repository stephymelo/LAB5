package model;

import processing.core.PApplet;

public class Perro implements Comparable <Perro>{
	private PApplet app;
	private int posX,posY;
	private String nombre,raza,fecha; 
	private int id,edad;
	
//	pa4.setPalabra(pa4.getPalabra().toUpperCase());

	Perro(int id,String nombre,String raza,int edad,String fecha,int posY) {
		this.nombre=nombre;
		this.raza=raza;
		this.id=id;
		this.edad=edad;
		this.fecha=fecha;
		this.posY=posY;	
		
	}

	
	Perro(PApplet app){
		this.app = app;
	}
	
	
	public void draw(int posX,PApplet app) {
		app.fill(0);
		app.noFill();
		app.stroke(0);
		app.rect(posX-15,posY-10,100,100);
		app.textSize(10);
		app.text(fecha,posX, posY+80);
		app.text(edad,posX, posY+65);
		app.text(id,posX+5,posY+10);
		app.text(nombre,posX,posY+30);
		app.text(raza,posX,posY+50);
		
	
		
		
	}
	
	
	
	public int compareTo(Perro id) {
		return  this.id-id.getId();

	}
	
	
	
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza
				+ ", id=" + id + ", edad=" + edad + "]";
	}

	

	
	

}
