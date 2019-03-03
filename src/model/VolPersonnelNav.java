package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity

public class VolPersonnelNav {

	@EmbeddedId
	private IdVolPersonnelNav pk;
	
	@ManyToOne
	@MapsId("id_vol")
	private Vol vol;
	
	@ManyToOne
	@MapsId("id_personnel_nav")
	private PersonnelNav personnelNav;

	@Column(name = "date_depart")
	private LocalDate date;

	@Column(name = "prime")
	private Float prime;

	public VolPersonnelNav() {
	}

	public IdVolPersonnelNav getPk() {
		return pk;
	}

	public void setPk(IdVolPersonnelNav pk) {
		this.pk = pk;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Float getPrime() {
		return prime;
	}

	public void setPrime(Float prime) {
		this.prime = prime;
	}

}
