package model;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String [] unoTxt,dosTxt;
	private String [] textSplit1,textSplit2;
	private LinkedList<Perro> listPerro ;
	private PerroNombre perroNombre;
	private PerroRaza perroRaza;
	private PerroEdad perroEdad;
	private String[] downloadTxt;
	

	
	
	




	public Logic(PApplet app) {
		this.app = app;
		listPerro = new LinkedList<Perro>();
		perroNombre = new PerroNombre();
		perroRaza = new PerroRaza();
		perroEdad = new PerroEdad();
		unoTxt = app.loadStrings("./data/imports/uno.txt");
		dosTxt = app.loadStrings("./data/imports/dos.txt");
		
		
		
	
//		
//		 Object[] objectArray = listPerro.toArray();
//		
//		 
//		 
//		  downloadTxt = new String[objectArray.length];
//	      for(int i =0; i < objectArray.length; i++) {
//
//	         downloadTxt[i] = (String) objectArray[i];
//	      }
//	      System.out.println("Contents of the array: \n"+Arrays.toString(downloadTxt));
//		
		
		
		listaPerros();
		listString();
		
		
		
	}





	private void listaPerros() {


		for (int i = 0; i < dosTxt.length; i++) {
			textSplit2= dosTxt[i].split(",");

			for (int j = 0; j < unoTxt.length; j++) {
				textSplit1=unoTxt[j].split(",");
				int id= Integer.parseInt(textSplit1[0]);
				int edad= Integer.parseInt(textSplit1[2]);
				

				if(textSplit2[0].trim().equals(textSplit1[0].trim())) {
					tabla(id,textSplit1[1],textSplit2[1],edad,textSplit2[2]);
					break;
				}

			}	



		}

//		for(Perro perro : listPerro) {
//		
//		}

	}




	public void tabla(int iD,String nombre, String raza,int edad,String fecha) {
		
		listPerro.add(new Perro(iD,nombre,raza,edad,fecha,100));
		
		nombre=nombre.toLowerCase();
		raza=raza.toLowerCase();
//		downloadTxt=listPerro.toArray((new String[0]));

		
		
//		listPerro.add(new Perro(textSplit1[0],textSplit1[1],textSplit2[1],textSplit2[2],100,app));
	}
	
	private void listString() {
	

		
//		for(Perro perro : listPerro) {
//			for(int j = 0; j < downloadTxt.length; j++)
//			downloadTxt[j]=perro.getNombre();
//			
//		}

	
	}
	
	
	public void downloadString() {
		
	
		
		if(app.mouseX>450&&app.mouseY>500&&app.mouseX<450+150&&app.mouseY<550) {
			
  		app.saveStrings("./data/exports/new.txt",textSplit1);
		
			return;
		}
		
	
		
	}



	public void addSortList() {
		if(app.mouseX>100&&app.mouseY>400&&app.mouseX<100+150&&app.mouseY<450) {
			Collections.sort(listPerro);
			
		}
		

		if(app.mouseX>350&&app.mouseY>400&&app.mouseX<350+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroNombre);	
		}
		
		if(app.mouseX>600&&app.mouseY>400&&app.mouseX<600+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroRaza);
		}
		
		if(app.mouseX>850&&app.mouseY>400&&app.mouseX<850+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroEdad);	
		}
		
		
	}


	public LinkedList<Perro> getListPerro() {
		return listPerro;
	}

	public void setListBall(LinkedList<Perro> listPerro) {
		this.listPerro = listPerro;
	}




}
