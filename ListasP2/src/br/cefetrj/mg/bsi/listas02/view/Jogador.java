

public class Jogador {

	private char jog;

	public Jogador(char j){
		this.jog=j;
	}

	public char getJogador(){
		return jog;
	}

	public void nextPlayer(){
		if(this.jog=='X')
			this.jog='O';
		else
			this.jog='X';
	}
}
