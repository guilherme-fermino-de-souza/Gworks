import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		int placarX = 0, placarO = 0,  rodada = 0;
		char jogador = 'X';
		char [][] tabuleiro = {{' ', ' ', ' '},
								{' ',' ',' '},
								{' ', ' ',' '}};
		for (int i = 0 ; i<1;) {
			System.out.println("Placar\n X " + placarX + " points       O " + placarO + " points");
			rodada++;
			System.out.println(rodada + "° Rodada!");
			for (int jogo = 1; jogo < 10; jogo++) { //Jogo
				for (boolean jogadaValida = false; jogadaValida != true;) { //Jogada Atual
					System.out.println("Jogador " + jogador + " escolha uma Linha(0 a 2)");
					int linha = ler.nextInt();
					System.out.println("Jogador " + jogador + " escolha uma Coluna(0 a 2)");
					int coluna = ler.nextInt();
					if (3 > linha >> -1 && 3 > coluna >> -1) {
						if (tabuleiro[linha][coluna] == ' ') {
							tabuleiro[linha][coluna] = jogador;
							for (int l = 0; l < 3; l++) {
								for (int c = 0; c < 3; c++) {
									System.out.print("|" + tabuleiro[l][c]);
								}
								System.out.print("|\n");
							}
							jogadaValida = true;
	
						} else {
							System.out.println("\nEspaço Já Preenchido\n");
						}
					} else {
						System.out.println("\nNúmero Inválido\n");
					}
				}
				
				if ( (tabuleiro[0][0] == jogador && tabuleiro[0][1] == jogador && tabuleiro[0][2] == jogador) //Verifica vencedor
					|| (tabuleiro[1][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[1][2] == jogador)
					|| (tabuleiro[2][0] == jogador && tabuleiro[2][1] == jogador && tabuleiro[2][2] == jogador)
					|| (tabuleiro[0][0] == jogador && tabuleiro[1][0] == jogador && tabuleiro[2][0] == jogador)
					|| (tabuleiro[0][1] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][1] == jogador)
					|| (tabuleiro[0][2] == jogador && tabuleiro[1][2] == jogador && tabuleiro[2][2] == jogador)
					|| (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador)
					|| (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
					System.out.println("O Jogador " + jogador + " Venceu!!!");
					switch (jogador) {
					case 'X':
						jogador = 'O';
						placarX++;
						break;
					case 'O':
						jogador = 'X';
						placarO++;
						break;
					}
					break;
				} else {
					switch (jogador) {
					case 'X':
						jogador = 'O';
						break;
					case 'O':
						jogador = 'X';
						break;
					}
				}
				if (jogo == 9) {
					System.out.print("Empate");
					break;
				}
			}
		}
	}

}
