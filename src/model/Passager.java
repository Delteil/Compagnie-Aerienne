package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="passager")

public class Passager {
	
	@Id
	@Column(name="id_passager")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idPassager;
	
	@ManyToOne
	@JoinColumn(name="id_contact_passager")
	private ContactPassager contactPassager;
	
	@ManyToMany
	@JoinTable(name = "vol_passager", joinColumns = @JoinColumn(name = "id_vol", referencedColumnName = "id_vol"), inverseJoinColumns = @JoinColumn(name = "id_passager", referencedColumnName = "id_passager"))
	private Set<Passager> passagers;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="nationalite")
	private String nationalite;

	public Passager() {
	}

	public Integer getId() {
		return idPassager;
	}

	public void setId(Integer id) {
		this.idPassager = id;
	}

	public ContactPassager getContactPassager() {
		return contactPassager;
	}

	public void setContactPassager(ContactPassager contactPassager) {
		this.contactPassager = contactPassager;
	}

	public Set<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(Set<Passager> passagers) {
		this.passagers = passagers;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	@Override
	public String toString() {
		return "Passager [id=" + idPassager + ", passagers=" + passagers + ", nom=" + nom + ", nationalite=" + nationalite
				+ "]";
	}
	
	
	
}
