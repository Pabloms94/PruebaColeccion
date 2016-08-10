
public class Modelo {
	String cadena;
	public Modelo(){
		
	}
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Modelo(String s){
		this.cadena = s;
	}
	
	public void cambiar(){
		this.cadena = "ADIOS";
	}
}
