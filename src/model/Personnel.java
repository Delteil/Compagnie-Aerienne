package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personnel")
//@Inheritance(strategy= InheritanceType.JOINED)

public class Personnel {

	@Id
	@Column(name = "id_personnel")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersonnel;

	@Embedded
	private PersonnelNav personnelNav;

	@Embedded
	private PersonnelNonNav personnelNonNav;

	@ManyToOne
	@JoinColumn(name = "id_contact_personnel")
	private ContactPersonnel contactPersonnel;

	@OneToMany(mappedBy = "pk.personnel_nav")
	private Set<VolPersonnelNav> volPersonnelsNavs = new HashSet<VolPersonnelNav>();

	@OneToMany(mappedBy = "pk.perdsonnel_non_nav")
	private Set<VolPersonnelNonNav> volPersonnelNonNav = new HashSet<VolPersonnelNonNav>();

	@Column(name = "poste")
	private String poste;

	@Column(name = "nom")
	private String nom;

	@Column(name = "salaire")
	private Float salaire;

	public Personnel() {
	}

	public Integer getId() {
		return idPersonnel;
	}

	public void setId(Integer id) {
		this.idPersonnel = id;
	}

	public PersonnelNav getPersonnelNav() {
		return personnelNav;
	}

	public void setPersonnelNav(PersonnelNav personnelNav) {
		this.personnelNav = personnelNav;
	}

	public PersonnelNonNav getPersonnelNonNav() {
		return personnelNonNav;
	}

	public void setPersonnelNonNav(PersonnelNonNav personnelNonNav) {
		this.personnelNonNav = personnelNonNav;
	}

	public ContactPersonnel getContactPersonnel() {
		return contactPersonnel;
	}

	public void setContactPersonnel(ContactPersonnel contactPersonnel) {
		this.contactPersonnel = contactPersonnel;
	}

	public Set<VolPersonnelNav> getVolPersonnelsNavs() {
		return volPersonnelsNavs;
	}

	public void setVolPersonnelsNavs(Set<VolPersonnelNav> volPersonnelsNavs) {
		this.volPersonnelsNavs = volPersonnelsNavs;

	}

	public Set<VolPersonnelNonNav> getVolPersonnelNonNav() {
		return volPersonnelNonNav;
	}

	public void setVolPersonnelNonNav(Set<VolPersonnelNonNav> volPersonnelNonNav) {
		this.volPersonnelNonNav = volPersonnelNonNav;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getSalaire() {
		return salaire;
	}

	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}

}
