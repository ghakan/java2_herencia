class Informatico extends Empleado {
    private int antiguedad;
    private int salario;
    
    //set
    public void setAntiguedad(int dato) {
    	this.antiguedad = dato;
    }
    public void setSalario(int dato) {
    	this.salario = dato;
    }
    //get
	public int getAntiguedad(){
		return this.antiguedad;
	}
	public int getSalario(){
		return this.salario;
	}
}