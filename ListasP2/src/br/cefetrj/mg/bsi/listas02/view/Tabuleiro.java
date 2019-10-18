
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Tabuleiro{
	
	private int nJogadas;
	private JFrame base;
	private JPanel tabuleiro;
	private char[] grelha;
	private JToggleButton botoes[];
	private Jogador j; 
	private boolean empate;
	private static int reg[]={0,0,0};

	public Tabuleiro(){
		start();
	}
	
	private void start(){
		empate=true;
		nJogadas=0;
		botoes=new JToggleButton[9];
		j=new Jogador('X');
		grelha=new char[9];
		
		base=new JFrame(" Jogo do Galo ");
		base.setSize(350,350);
		base.setLocation(400,100);
		base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabuleiro=new JPanel();
		tabuleiro.setLayout(new GridLayout(3,3));

		for(int i=0;i<9;i++){
			botoes[i]=new JToggleButton();
			botoes[i].setFont(new Font("Lucida Sans Unicode",Font.BOLD,80));
			botoes[i].addActionListener(new EventoListener());
			tabuleiro.add(botoes[i]);
		}
		
		base.getContentPane().add(tabuleiro);
		base.setVisible(true);
	}
	
	class EventoListener extends WindowAdapter implements ActionListener {
		
		public void windowClosing(WindowEvent e) {
			restart();
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JToggleButton)
				verificar((JToggleButton)e.getSource());
		}
	}
		
	public void verificar(JToggleButton botao){
		
		botao.setText(""+j.getJogador()); // marca no tabuleiro

		int pos=-1;
		for(int i=0;i<9 && pos==-1;i++){
			if(botoes[i]==botao)
				pos=i;
		}
		
		grelha[pos]=j.getJogador(); // marca na grelha
		nJogadas++; 
		
		if(nJogadas>=5){ // necessário pelo menos 5 jogadas para que alguém ganhe
			
			if((grelha[0]==grelha[1]) && (grelha[0]==grelha[2]) && (grelha[0]!='\0')) // primeira linha
				vitoria(j.getJogador());
			
			if((grelha[1]==grelha[4]) && (grelha[1]==grelha[7]) && (grelha[1]!='\0')) // segunda linha
				vitoria(j.getJogador());
			
			if((grelha[2]==grelha[5]) && (grelha[2]==grelha[8]) && (grelha[2]!='\0')) // terceira linha
				vitoria(j.getJogador());
				
			if((grelha[0]==grelha[4]) && (grelha[0]==grelha[8]) && (grelha[0]!='\0')) // diagonal
				vitoria(j.getJogador());
			
			if((grelha[2]==grelha[4]) && (grelha[2]==grelha[6]) && (grelha[2]!='\0')) // diagonal
				vitoria(j.getJogador());
			
			if((grelha[0]==grelha[3]) && (grelha[0]==grelha[6]) && (grelha[0]!='\0')) // primeira coluna
				vitoria(j.getJogador());

			if((grelha[3]==grelha[4]) && (grelha[3]==grelha[5]) && (grelha[3]!='\0')) // segunda coluna
				vitoria(j.getJogador());

			if((grelha[6]==grelha[7]) && (grelha[6]==grelha[8]) && (grelha[6]!='\0')) // terceira coluna
				vitoria(j.getJogador());
		}
		
		j.nextPlayer();	

		botao.setEnabled(false);

		if(nJogadas==9)
			restart();
		
	}
	
	private void restart(){

		if(empate==true)
			reg[2]++;
		
		base.setVisible(false);
		
		base=null;
		tabuleiro=null;
		botoes=null;
		grelha=null;
		j=null;
		
		start();
	}
	
	private void vitoria(char c){
		
		if(c=='X')
			reg[0]++;
		else
			reg[1]++;
		
		empate=false;
		
		JFrame janela=new JFrame(" Jogo do Galo ");
		
		JPanel gpanel=new JPanel();
		gpanel.setLayout(new GridLayout(4,0));
		gpanel.setBackground(Color.white);

		JLabel l0=new JLabel();
		l0.setFont(new Font("Lucida Sans Unicode",Font.BOLD,14));
		l0.setText(" Jogador "+c+" venceu!");
		
		JLabel l1=new JLabel();
		l1.setFont(new Font("Lucida Sans Unicode",Font.BOLD,14));
		l1.setText(" Jogador X: "+reg[0]+" victorias. ");
		
		JLabel l2=new JLabel();
		l2.setFont(new Font("Lucida Sans Unicode",Font.BOLD,14));
		l2.setText(" Jogador O: "+reg[1]+" victorias. ");

		JLabel l3=new JLabel();
		l3.setFont(new Font("Lucida Sans Unicode",Font.BOLD,14));
		l3.setText(" Empates: "+reg[2]);
		
		gpanel.add(l0);
		gpanel.add(l1);
		gpanel.add(l2);
		gpanel.add(l3);

		janela.getContentPane().add(gpanel);
		
		janela.setSize(250,100);
		janela.setLocation(900,500);
		
		base.setEnabled(false);
		janela.setVisible(true);
		
		janela.addWindowListener(new EventoListener());
	}

	public static void main(String args[]){
		new Tabuleiro();
	}	
}
