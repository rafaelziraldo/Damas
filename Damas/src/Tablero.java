

public class Tablero {
	Casilla[][]casillas=new Casilla[10][10];
	public Tablero() {
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas.length;j++){
				if((i+j)%2==0){
				casillas[i][j]=new Casilla("negra");
				}else{
					casillas[i][j]=new Casilla("roja");
				}
			}
			
		}
		
	}
	
	

}
