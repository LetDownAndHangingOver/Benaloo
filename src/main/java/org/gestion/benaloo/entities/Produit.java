package org.gestion.benaloo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="PRODUIT")
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int    idProduit;
	private String nomProduit;
	private String photoProduit;
	private float  prixProduit;
	@ManyToOne
	@JoinColumn(name="CODE_USER")
	private User user;
	
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getPhotoProduit() {
		return photoProduit;
	}

	public void setPhotoProduit(String photoProduit) {
		this.photoProduit = photoProduit;
	}

	public float getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(float prixProduit) {
		this.prixProduit = prixProduit;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Produit() {
		super();
	}

	public Produit(String nomProduit) {
		super();
		this.nomProduit = nomProduit;
	}
}
