import java.util.ArrayList;

public class Casilla {
	ArrayList<Ficha>ficha=new ArrayList<Ficha>();
	String color;
	public Casilla(String color) {
		this.color=color;
	} 
	public void recibir(Ficha f){
		ficha.add(f);
	}
	public void sacar(Ficha f){
		ficha.clear();
	}
	public void pasarA(Casilla otraCasilla,Ficha f){
		
		this.sacar(f);
		otraCasilla.recibir(f);
	}
	public void moverA(Casilla otraCasilla,Ficha f){
		if(!otraCasilla.tieneFicha(otraCasilla)){
			this.pasarA(otraCasilla, f);
		}
	}
	public void captura(Ficha otraFicha,Casilla casilla,Casilla casillaDestino){
		if(ficha.get(0).puedeCapturar(otraFicha)&&casilla.tieneFicha(casilla)&& !casillaDestino.tieneFicha(casillaDestino)){
			this.pasarA(casillaDestino,ficha.get(0));
		}
		
	}
	public boolean tieneFicha(Casilla casilla){
		if(ficha.size()==1){
			return true;
		}
		return false;
	}

}
