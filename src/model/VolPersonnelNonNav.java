package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="vol_naviguant")
public class VolPersonnelNonNav {

	@EmbeddedId
	private IdVolPersonnelNonNav pk;
	
	@ManyToOne
	@MapsId("id_vol")
	private Vol vol;
	
	@ManyToOne
	@MapsId("id_personnel_non_naviguant")
	private PersonnelNonNav personnelNonNaviguant;

	@Column(name = "date_depart")
	private LocalDate date;

	public VolPersonnelNonNav() {
	}

	public IdVolPersonnelNonNav getPk() {
		return pk;
	}

	public void setPk(IdVolPersonnelNonNav pk) {
		this.pk = pk;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
