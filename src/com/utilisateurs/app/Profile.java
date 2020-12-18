package com.utilisateurs.app;

import java.util.ArrayList;

public class Profile  {
	private static int count=0;
private int id ;
private String code;
private String libelle;
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public Profile(String code ,String libelle ) {
		count++;
		this.id=count;
		this.code=code;
		this.libelle=libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

	
	//afficher  List Profile
	/*public ArrayList<Profile> AfficherList(ArrayList<Profile> profileList) {
		ArrayList<Profile> newListProfile = new ArrayList<>();
		for(Profile prof : profileList) {
			if(!newListProfile.contains(prof)) {
				newListProfile.add(prof);
			}
		}
		return newListProfile;
	}*/
	
}
