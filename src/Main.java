import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n ****************** Empleados **************** ");
		Director o_director = new Director();
		Administracion o_administracion = new Administracion();
		Informatico o_informatico = new Informatico();
		//introducir datos
		System.out.println("\n Introduce nombre");
			o_director.setNombre(sc.next());
		System.out.println("\n Introduce apellido");
			o_director.setApellido(sc.next());
		System.out.println("\n Introduce antiguedad");
			o_director.setAntiguedad(sc.nextInt());
		System.out.println("\n Introduce salario");
			o_director.setSalario(sc.nextInt());
			
		System.out.println("\n ****************** DATOS Empleados **************** ");
		System.out.println("\n Nombre: " + o_director.getNombre());
		System.out.println("\n Apellido: " + o_director.getApellido());
		System.out.println("\n Antiguedad: " + o_director.getAntiguedad());
		System.out.println("\n Salario: " + o_director.getSalario());
	}
}