package com.Main.app;

import java.util.ArrayList;

import com.utilisateurs.app.Profile;
import com.utilisateurs.app.Utilisateur;

public class Main {

	public static void main(String[] args) throws Exception{
		Utilisateur utilisateur= new Utilisateur();
		ArrayList<Utilisateur> ListUtilisateur=  new ArrayList<>();
		Profile p1= new Profile("sssd","MN");
		Profile p2= new Profile("ddds","DG");
		Profile p3= new Profile("ddds","DP");
		Profile p4= new Profile("ddddf","MN");
		ListUtilisateur.add(new Utilisateur(11,"ayoub","reda","ayoub@gmail.com","0997876",2000.0,"log","pass1","serv1",p1));
		ListUtilisateur.add(new Utilisateur(22,"tofik","salah","imad@gmail.com","0997876",3000.0,"log2","pass2","serv2",p1));
		ListUtilisateur.add(new Utilisateur(33,"salima","salma","jawad@gmail.com","0997876",4000,"log","pass3","serv3",p2));
		ListUtilisateur.add(new Utilisateur(44,"jamal","yahaya","yahya@gmail.com","0997876",5000,"log4","pass4","serv4",p2));
		ListUtilisateur.add(new Utilisateur(55,"jamal","aymen","harim@gmail.com","0997876",3050,"log5","pass5","serv5",p3));
		ListUtilisateur.add(new Utilisateur(55,"ahmed","elphor","mirare@gmail.com","0997876",3030,"log6","pass6","serv6",p4));
		ArrayList<Profile> prof= new ArrayList<>();
		for( Utilisateur util : ListUtilisateur ) {
			System.out.println(" Le profile de " + util.getProfile().getLibelle() + " : " + util.toString());
			util.calculerSalaire();	
			prof.add(util.getProfile());
		}
		 prof= utilisateur.AfficherList(prof);
		 System.out.println("\n List des managers. \n");
		for( Profile p : prof ) {
			if(p.getLibelle().equals("MN")) {
			System.out.println(" Le profile Managers est :  " + p.toString() +  " : " );
			}
		}
		
	}
	

}
