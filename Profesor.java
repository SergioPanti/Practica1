import java.util.List;

public class Profesor extends Persona{
	

	String str;
	int edad;
	String numeroDeTelefono;
	List<Prestamo> prestamos;
	
	public Profesor(String numeroDeTelefono) {
		super(numeroDeTelefono);
	}
	
	public void printInformationPersonal(){
	 System.out.println("Nombre: "+str);
	 System.out.println("Edad: "+ edad);
	 System.out.println("Telefono "+ numeroDeTelefono);
	}
	
	public void printTodaLaInfo(){
		System.out.println("Nombre: "+str);
		System.out.println("Edad: "+ edad);
		System.out.println("Telefono "+ numeroDeTelefono);
		
		for(Prestamo p: prestamos){
			System.out.println("titulo: "+p.titulo);
			System.out.println("autor: "+p.autor);
			System.out.println("editorial: "+p.editorial);
			System.out.println("año: "+p.año);
		}
	}
}
