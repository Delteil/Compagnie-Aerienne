package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class IdVolPersonnelNonNav implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="id_vol")
	private Vol vol;
	
	@ManyToOne
	@JoinColumn(name="id_personnelNonNav")
	private PersonnelNonNav personnelNonNav;

	
}
