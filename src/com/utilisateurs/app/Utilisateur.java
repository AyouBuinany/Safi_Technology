package com.utilisateurs.app;

import java.util.ArrayList;

public class Utilisateur extends Personne {
	private String login;
	private String service;
	private String Password;
	private Profile prof;
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(int matricul,String firstName,String lastName , String email,String phone , double salaire,String login,String password,String service, Profile p) {
		super(matricul,firstName,lastName,email,phone,salaire);
		this.service= service;
		this.Password= password;
		this.login=login;
		this.prof= p;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Profile getProfile() {
		return prof;
	}
	@Override
	public String toString() {
		return " Utilisateur " + super.toString()+ " login=" + login + ", service=" + service + ", Password=" + Password + "]";
	}
	public void calculerSalaire() {
		double total=0;
		if(prof.getLibelle().equals("MN")) {
			total =this.getSalaire() + (this.getSalaire()*0.8);
		}else if(prof.getLibelle()=="DG"){
			total=this.getSalaire() + (this.getSalaire()*0.15);
		}else {
			total=this.getSalaire();
		}
		System.out.println("Total est : " + total);
	}
	
	//afficher  List Profile
	public ArrayList<Profile> AfficherList(ArrayList<Profile> profileList) {
		ArrayList<Profile> newListProfile = new ArrayList<>();
		for(Profile prof : profileList) {
			if(!newListProfile.contains(prof)) {
				newListProfile.add(prof);
			}
		}
		return newListProfile;
	}
	
}
