package pvt.springboot1.springboot1.modelo;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import pvt.springboot1.springboot1.ParentEntity;
@Entity
@Table(name = "Usuario")
@Access(AccessType.FIELD)
public class Usuario extends ParentEntity {

	private static final long serialVersionUID = 6327043537206234312L;

	@Column(name = "nombres", nullable = false, length = 200)
	private String nombres;
	@Column(name = "apellidoPaterno", nullable = false, length = 100)
	private String apellidoPaterno;
	@Column(name = "apellidoMaterno", nullable = false, length = 100)
	private String apellidoMaterno;
	@Column(name = "telefono", nullable = true, length = 9)
	private String telefono;
	@Column(name = "direccion", nullable = true, length = 255)
	private String direccion;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}