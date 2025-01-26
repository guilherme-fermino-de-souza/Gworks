import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		int placarX = 0, placarO = 0, numRodadas = 0;
		char jogadaAtual = 'o';
			
			for (int jogo = 0; jogo != 1;) { //Jogo
				char[][] tabuleiro = {{' ', ' ', ' '},  //linha/coluna
						{' ',' ',' '}, 
						{' ', ' ', ' '}}; 
				numRodadas++;
				System.out.println("JOGO DA VELHA\n" + numRodadas + "° Rodada!");
				for (int numeroJogadas = 0; numeroJogadas <= 9; numeroJogadas++) { //Partida
					if (jogadaAtual=='o') {
						jogadaAtual = 'x';
					} else {
						jogadaAtual = 'o';
					}
					System.out.println("\nJogador " + jogadaAtual + " Escolha uma Linha(0 a 2)");
					int linha = ler.nextInt();
					System.out.println("Jogador " + jogadaAtual + " Escolha uma Coluna(0 a 2)");
					int coluna = ler.nextInt();
					
					if (tabuleiro[linha][coluna] == ' ') { //Jogada Válida
						tabuleiro[linha][coluna] = jogadaAtual;
					} else {
						System.out.println("JOGADA INVÁLIDA\n");
					}
					
					if ( (tabuleiro[0][0] == jogadaAtual && tabuleiro[0][1] == jogadaAtual && tabuleiro[0][2] == jogadaAtual) //Verifica vencedor
					|| (tabuleiro[1][0] == jogadaAtual && tabuleiro[1][1] == jogadaAtual && tabuleiro[1][2] == jogadaAtual)
					|| (tabuleiro[2][0] == jogadaAtual && tabuleiro[2][1] == jogadaAtual && tabuleiro[2][2] == jogadaAtual)
					|| (tabuleiro[0][0] == jogadaAtual && tabuleiro[1][0] == jogadaAtual && tabuleiro[2][0] == jogadaAtual)
					|| (tabuleiro[0][1] == jogadaAtual && tabuleiro[1][1] == jogadaAtual && tabuleiro[2][1] == jogadaAtual)
					|| (tabuleiro[0][2] == jogadaAtual && tabuleiro[1][2] == jogadaAtual && tabuleiro[2][2] == jogadaAtual)
					|| (tabuleiro[0][0] == jogadaAtual && tabuleiro[1][1] == jogadaAtual && tabuleiro[2][2] == jogadaAtual)
					|| (tabuleiro[0][2] == jogadaAtual && tabuleiro[1][1] == jogadaAtual && tabuleiro[2][0] == jogadaAtual)) {
						switch (jogadaAtual) {
							case 'x': placarX = placarX + 1;
								break;
							case 'o': placarO = placarO + 1;
								break;			
							}
						System.out.println("O JOGADOR " + jogadaAtual + " É O VENCEDOR!");
						System.out.println("\n     * PLACAR *     \n" + "Jogador X " + placarX + "   |    Jogador O " + placarO + "\n");
						break;
					} else {
						
					}
					
					for (int i = 0; i < 3; i++) { //Tabuleiro
						for (int j = 0; j < 3; j++) {
							System.out.print("|" + tabuleiro[i][j]);
						}
						System.out.print("| \n");
					}
				}
				System.out.println("Deseja sair do jogo(S/N)?");
				String repetir = ler.next();
				if (repetir.equalsIgnoreCase("S")) {
					jogo = 1;
					System.out.println("Saindo...");
				}
			}
	}

}
