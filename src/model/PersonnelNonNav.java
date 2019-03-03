package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable

//@Entity
//@Table(name="personnel_non_nav")
public class PersonnelNonNav implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_personnel_non_nav")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersoNonNav;

	public PersonnelNonNav(Integer idPersoNonNav) {
		this.idPersoNonNav = idPersoNonNav;
	}

	public Integer getIdPersoNonNav() {
		return idPersoNonNav;
	}

	public void setIdPersoNonNav(Integer idPersoNonNav) {
		this.idPersoNonNav = idPersoNonNav;
	}

	@Override
	public String toString() {
		return "PersonnelNonNav [idPersoNonNav=" + idPersoNonNav + "]";
	}

}
