package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contact_personnel")

public class ContactPersonnel {

	@Id
	@Column(name = "id_contact_passager")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContactPassager;

	@OneToOne(mappedBy = "contact_personnel")
	private Personnel personnel;

	@Column(name = "rue")
	private String rue;

	@Column(name = "ville")
	private String ville;

	@Column(name = "code_postal")
	private Integer codePostal;

	@Column(name = "telephone")
	private int telephone;

	@Column(name = "email")
	private String email;

	public ContactPersonnel() {
		super();
	}

	public Integer getIdContactPassager() {
		return idContactPassager;
	}

	public void setIdContactPassager(Integer idContactPassager) {
		this.idContactPassager = idContactPassager;
	}

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactPersonnel [idContactPassager=" + idContactPassager + ", rue=" + rue + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", telephone=" + telephone + ", email=" + email + "]";
	}

}
