package app.model;

public class Builder {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Builder nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public Builder apellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}
	
	public Builder dni(String dni) {
		this.dni = dni;
		return this;
	}
	
	public PersonaToBuild build() {
		return new PersonaToBuild(nombre,apellidos, dni);
	}

}
