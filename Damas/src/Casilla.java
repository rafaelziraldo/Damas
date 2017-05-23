import java.util.ArrayList;

public class Casilla {
	ArrayList<Ficha>ficha=new ArrayList<Ficha>();
	public Casilla() {
		
	} 
	public void recibir(Ficha f){
		ficha.add(f);
	}
	public void Sacar(Ficha f){
		ficha.clear();
	}
	public void PasarA(Casilla otraCasilla,Ficha f){
		this.Sacar(f);
		otraCasilla.recibir(f);
	}
	public boolean tieneFicha(Casilla casilla){
		if(ficha.size()==1){
			return true;
		}
		return false;
	}

}
