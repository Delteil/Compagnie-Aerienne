package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vol")

public class Vol {
	
	@Id
	@Column(name="id_vol")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idVol;
	
	@OneToMany
	@JoinColumn(name="id_avion")
	private Set<Avion> avions;
	
	@OneToMany(mappedBy = "pk.vol_personnel_nav")
	private Set<VolPersonnelNav> volPersonnelsNavs = new HashSet<VolPersonnelNav>();

	@OneToMany(mappedBy = "pk.vol_perdsonnel_non_nav")
	private Set<VolPersonnelNonNav> volPersonnelNonNav = new HashSet<VolPersonnelNonNav>();

	@Column(name="date_depart")
	private LocalDate dateDepart;
	
	@Column(name="heure_depart")
	private LocalDateTime heureDepart;
	
	@Column(name="ville_depart")
	private String villeDepart;
	
	@Column(name="heure_arrivee")
	private LocalDateTime heureArrivee;
	
	@Column(name="ville_arrivee")
	private String villeArrivee;
	
	@Column(name="distance")
	private Float distance;
	
	@Column(name="nombre_passager")
	private int nbrPassager;

	public Vol() {
		super();
	}

	public Integer getIdVol() {
		return idVol;
	}

	public void setIdVol(Integer idVol) {
		this.idVol = idVol;
	}

	public Set<Avion> getAvions() {
		return avions;
	}

	public void setAvions(Set<Avion> avions) {
		this.avions = avions;
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

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalDateTime getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(LocalDateTime heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public LocalDateTime getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(LocalDateTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public int getNbrPassager() {
		return nbrPassager;
	}

	public void setNbrPassager(int nbrPassager) {
		this.nbrPassager = nbrPassager;
	}

	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", avions=" + avions + ", volPersonnelsNavs=" + volPersonnelsNavs
				+ ", volPersonnelNonNav=" + volPersonnelNonNav + ", dateDepart=" + dateDepart + ", heureDepart="
				+ heureDepart + ", villeDepart=" + villeDepart + ", heureArrivee=" + heureArrivee + ", villeArrivee="
				+ villeArrivee + ", distance=" + distance + ", nbrPassager=" + nbrPassager + "]";
	}
	
	

}
