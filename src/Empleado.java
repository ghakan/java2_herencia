class Empleado {
    private String nombre;
    private String apellido;
    //set
    public void setNombre(String dato) {
    	this.nombre = dato;
    }
    public void setApellido(String dato) {
    	this.apellido = dato;
    }
    //get
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
}