package dev.controller.vm;

import dev.domain.Collegue;
import dev.domain.Role;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Structure modèlisant un collègue servant à communiquer avec l'extérieur (WEB
 * API).
 */
public class CollegueVM {

	private String email;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private LocalDate dateDeNaissance;
	private String imgUrl;
	
	private List<Role> roles = new ArrayList<>();

	public CollegueVM(Collegue col) {
		this.email = col.getEmail();
		this.nom = col.getNom();
		this.prenom = col.getPrenom();
		this.adresse=col.getAdresse();
		this.dateDeNaissance=col.getDateDeNaissance();
		this.imgUrl=col.getImgUrl();
		this.roles = col.getRoles().stream().map(roleCollegue -> roleCollegue.getRole()).collect(Collectors.toList());
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
}
