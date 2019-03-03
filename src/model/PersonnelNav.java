package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
//@Entity
//@Table(name="personnel_nav")

public class PersonnelNav implements Serializable {

	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_personnel_nav")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersoNav;

	public PersonnelNav(Integer idPersoNav) {
		this.idPersoNav = idPersoNav;
	}

	public Integer getIdPersoNav() {
		return idPersoNav;
	}

	public void setIdPersoNav(Integer idPersoNav) {
		this.idPersoNav = idPersoNav;
	}

	@Override
	public String toString() {
		return "PersonnelNav [idPersoNav=" + idPersoNav + "]";
	}

}
