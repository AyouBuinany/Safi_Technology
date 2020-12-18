package com.utilisateurs.app;

public class Personne {
private int matricule; 
private String firstName;
private String lastName;
private String email;
private String phone;
private double salaire;
	public Personne() {
		// TODO Auto-generated constructor stub
	}
public Personne(int matricule,String firstName,String lastName,String email,String phone,double salaire) {
	this.matricule=matricule;
	this.firstName=firstName;
	this.lastName= lastName;
	this.email=email;
	this.phone=phone;
	this.salaire= salaire;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public double getSalaire() {
	return salaire;
}
public void setSalaire(double salaire) {
	this.salaire = salaire;
}
@Override
public String toString() {
	return "[matricule=" + matricule + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
			+ email + ", phone=" + phone + ", salaire=" + salaire ;
}

}
