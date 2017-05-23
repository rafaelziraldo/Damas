
public class Ficha {
	String color;
	public Ficha(String color) {
		this.color=color;
	}
	
	
	public boolean puedeCapturar(Ficha otraFicha){
		if(this.color.equals(otraFicha.color)){
			return false;
		}
		
		return true;
	}
	
	

}
