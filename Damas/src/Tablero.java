

public class Tablero {
	Casilla[][]casillas=new Casilla[10][10];
	public Tablero() {
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas.length;j++){
				casillas[i][j]=new Casilla();
			}
			
		}
		
	}
	

}
