package eventos.tresventanas;

public class Cliente {

	// Atributos.
	private String nombre;
	private String apellido;
	private String nif;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Cliente(String nombre, String apellido, String nif) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.nif = nif;
	}

	public Cliente() {

	}

	@Override
	public String toString() {
		return "     Nombre: " + nombre + "     Apellido : " + apellido + "     NIF: " + nif;
	}

}
