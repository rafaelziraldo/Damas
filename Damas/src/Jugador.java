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
	public void PonerFichaA(Casilla casilla ){
		casilla.recibir(fichas.get(a));
		a++;
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
