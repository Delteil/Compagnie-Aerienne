package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "avion")

public class Avion {

	@Id
	@Column(name = "id_avion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAvion;

	@OneToMany(mappedBy = "avion")
	private Set<Vol> vol;

	@Column(name = "marque")
	private String marque;

	@Column(name = "type")
	private String type;

	@Column(name = "capacite_max_passager")
	private Integer capacitePassager;

	@Column(name = "capacite_max_reservoir")
	private Integer capaciteReservoir;

	@Column(name = "consommation_moy_par_100km")
	private Float consoMoyPar100;

	@Column(name = "coef_surconso_par_100passager")
	private Float coefSurconsoPar100;

	public Avion() {
		super();
	}

	public Integer getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}

	public Set<Vol> getVol() {
		return vol;
	}

	public void setVol(Set<Vol> vol) {
		this.vol = vol;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCapacitePassager() {
		return capacitePassager;
	}

	public void setCapacitePassager(Integer capacitePassager) {
		this.capacitePassager = capacitePassager;
	}

	public Integer getCapaciteReservoir() {
		return capaciteReservoir;
	}

	public void setCapaciteReservoir(Integer capaciteReservoir) {
		this.capaciteReservoir = capaciteReservoir;
	}

	public Float getConsoMoyPar100() {
		return consoMoyPar100;
	}

	public void setConsoMoyPar100(Float consoMoyPar100) {
		this.consoMoyPar100 = consoMoyPar100;
	}

	public Float getCoefSurconsoPar100() {
		return coefSurconsoPar100;
	}

	public void setCoefSurconsoPar100(Float coefSurconsoPar100) {
		this.coefSurconsoPar100 = coefSurconsoPar100;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", vol=" + vol + ", marque=" + marque + ", type=" + type
				+ ", capacitePassager=" + capacitePassager + ", capaciteReservoir=" + capaciteReservoir
				+ ", consoMoyPar100=" + consoMoyPar100 + ", coefSurconsoPar100=" + coefSurconsoPar100 + "]";
	}

}
