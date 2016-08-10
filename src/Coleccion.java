import java.util.ArrayList;
import java.util.List;

public class Coleccion {
	private List<Modelo> lista = new ArrayList<Modelo>();

	public void setCosa(Modelo m){
		Modelo newEspectro = new Modelo(m.getCadena());
		this.lista.add(newEspectro);
	}
	
	public void imprime(){
		for (int i = 0; i<lista.size(); i++)
			System.out.println("Elemento "+i+": " + lista.get(i).cadena);
	}
}
