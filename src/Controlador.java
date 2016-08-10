
public class Controlador {
	Coleccion c;
	static Modelo x = new Modelo();
	int indice = 0;
	public Controlador (Coleccion c){
		this.c = c;
		llenar();
		accion();
		accion();
		accion();
		x.cambiar();
		c.setCosa(x);
		c.imprime();
	}
	
	public void accion(){
		x.cambiar();
		c.setCosa(x);
		c.imprime();
		indice++;
	}
	
	public void llenar(){
		x.setCadena("HOLA");
		c.setCosa(x);
	}
}
