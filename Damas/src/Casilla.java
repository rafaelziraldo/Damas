import java.util.ArrayList;

public class Casilla {
	ArrayList<Ficha>ficha=new ArrayList<Ficha>();
	public Casilla() {
		
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
