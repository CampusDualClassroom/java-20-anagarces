package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}
	public void getDetails(){
		System.out.println("Nombre completo: " + name + " " + surname + " " + "Escuadrón: " + squad);
	}
}
