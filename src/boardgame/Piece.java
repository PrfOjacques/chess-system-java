package boardgame;

public class Piece {
	
	protected Position position; // nao queremos que essa posicao seja visivel  
	                             // para outra classe (Board, por exemplo)
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //o java joga o valor null (sendo didático)
	}
	
    //somente classes dentro do pacote boardgame e subclasses de Piece
	//poderao acessar o tabuleiro de uma peça. Para evitar que se cometa
	//erros
	protected Board getBoard() {
		return board;
	}
    //não permitir que o o tabuleiro seja alterado
	/*
	public void setBoard(Board board) {
		this.board = board;
	} */
	
	
	
}
