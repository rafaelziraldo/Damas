import java.util.ArrayList;

public class Jugador {
	ArrayList<Ficha>fichas=new ArrayList<Ficha>();
	int cantidadDeFichas=15;
	int a=0;
	public Jugador(String color) {
		for(int i=0;i<cantidadDeFichas;i++){
			fichas.add(new Ficha(color));
		}
		
		
	}
	public void PonerFichaA(Tablero tablero ){
		for(int i=0;i<fichas.size();i++){
			for(int j=0;j<fichas.size();j++)
		tablero.casillas[i][j].recibir(fichas.get(i));
		
		fichas.remove(i);
		}
	}
	public void gana(){
		
	}
	public boolean pierde(){
		if(fichas.size()==0){
			return true;
		}
		return false;
	}
	

}
