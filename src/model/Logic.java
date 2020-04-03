package model;

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
	private int diferentDownload;
	private boolean click;

	

	public Logic(PApplet app) {
		this.app = app;
		listPerro = new LinkedList<Perro>();
		perroNombre = new PerroNombre();
		perroRaza = new PerroRaza();
		perroEdad = new PerroEdad();
		unoTxt = app.loadStrings("./data/imports/uno.txt");
		dosTxt = app.loadStrings("./data/imports/dos.txt");
		diferentDownload=0;
		
	
		 
		listaPerros();

		
		 
		
	}





	private void listaPerros() {


		for (int i = 0; i < dosTxt.length; i++) {
			textSplit2= dosTxt[i].split(",");

			for (int j = 0; j < unoTxt.length; j++) {
				textSplit1=unoTxt[j].split(",");
				
				int id= Integer.parseInt(textSplit1[0]);
				int edad= Integer.parseInt(textSplit1[2]);
				String nombre = textSplit1[1];
				String raza = textSplit2[1];
				String fechaNacimiento = textSplit2[2];
				

				if(textSplit2[0].trim().equals(textSplit1[0].trim())) {
					tabla(id,nombre,raza,edad,fechaNacimiento);
					break;
				}
			}	
		}

	}




	public void tabla(int iD,String nombre, String raza,int edad,String fecha) {
		
		listPerro.add(new Perro(iD,nombre,raza,edad,fecha,100));
		

		
		
//		listPerro.add(new Perro(textSplit1[0],textSplit1[1],textSplit2[1],textSplit2[2],100,app));
	}
	

	
	public void swapping() {

//		
//		Collections.swap(listPerro, a, b);
//		

		
		
		
		for (int i = 0; i < listPerro.size(); i++) {
			
			Perro perro = listPerro.get(i);
			
			
			if(app.mouseX>perro.getPosX()&&app.mouseY>perro.getPosY()&&app.mouseX<perro.getPosX()+100&&app.mouseY<perro.getPosY()+100) {
//				
				System.out.println(listPerro.indexOf(perro)+"indice");
				
				
			}
	
		}
		
		
	}
	

	
	public void downloadString() {
		
		String[] downloadTxt;
		downloadTxt = new String [listPerro.size()];
		
		
		for (int i = 0; i < listPerro.size(); i++) {

			String id = "id:" + listPerro.get(i).getId();
			String nombre = " nombre:" + listPerro.get(i).getNombre().toLowerCase();
			String edad = " edad:" + listPerro.get(i).getEdad();
			String raza = " raza:" + listPerro.get(i).getRaza().toLowerCase();
			String fechaN = " fecha de Nacimiento:" + listPerro.get(i).getFecha();

			downloadTxt[i] = id + nombre + edad + raza + fechaN;
			
			
		}
		
	
		switch (diferentDownload) {
		
		
		
		case 1:
			if(app.mouseX>450&&app.mouseY>500&&app.mouseX<450+150&&app.mouseY<550) 
			app.saveStrings("./data/exports/id.txt",downloadTxt);
			break;

		case 2:
			if(app.mouseX>450&&app.mouseY>500&&app.mouseX<450+150&&app.mouseY<550) 
			app.saveStrings("./data/exports/nombre.txt",downloadTxt);
			break;

		case 3:
			if(app.mouseX>450&&app.mouseY>500&&app.mouseX<450+150&&app.mouseY<550) 
			app.saveStrings("./data/exports/raza.txt",downloadTxt);
			break;

		case 4:
			if(app.mouseX>450&&app.mouseY>500&&app.mouseX<450+150&&app.mouseY<550) 
				app.saveStrings("./data/exports/edad.txt",downloadTxt);
				break;


			
		}
		
	
		
	}



	public void addSortList() {
		if(app.mouseX>100&&app.mouseY>400&&app.mouseX<100+150&&app.mouseY<450) {
			Collections.sort(listPerro);
			diferentDownload=1;
			
		}

		if(app.mouseX>350&&app.mouseY>400&&app.mouseX<350+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroNombre);	
			diferentDownload=2;
		}
		
		if(app.mouseX>600&&app.mouseY>400&&app.mouseX<600+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroRaza);
			diferentDownload=3;
		}
		
		if(app.mouseX>850&&app.mouseY>400&&app.mouseX<850+150&&app.mouseY<450) {
			Collections.sort(listPerro,perroEdad);	
			diferentDownload=4;
		}
		
		
	}


	public LinkedList<Perro> getListPerro() {
		return listPerro;
	}

	public void setListBall(LinkedList<Perro> listPerro) {
		this.listPerro = listPerro;
	}




}
