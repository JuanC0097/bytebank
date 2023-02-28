package bytebank;

public class Cliente {
	
	//Atributos con modificador de acceso
	/*
	 * Public: Permite el acceso desde cualquier parte del codigo
	 * Private: protege los atributos del objeto, solo los atributos y metodos son accesibles dentro 
	 * de la clase de los declara.
	 */
	private String nombre; 
	private String numeroIdentidad; 
	private String profesion;
	
	//obtener nombre
	public String getNombre() {
		return nombre;
	}
	
	//asignar nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//obtener numero de indentidad
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	
	//asignar numero de identidad
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	
	
	
}
