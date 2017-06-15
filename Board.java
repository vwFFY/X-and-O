
public class Board {
	
	public String player1;
	public String player2;
	public String current;
	public Piece[][] board;
	public int gameState; //-1, 0, 1, 9
	public int turn;
	
	public Board(String p1, String p2){
		this.player1 = p1;
		this.player2 = p2;
		this.current = p1;
		this.gameState = 9;
		this.board = new Piece [3][3];
		this.turn = 0;
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board.length; j++){
				board[i][j] = new Piece();
			}
		}
	}
	
	public void placePiece(String type, Tuple pos){
		if(type.equals("X") || type.equals("O")){
			int x = pos.x -1;
			int y = pos.y -1;
			Piece subject = this.board[x][y];
			if (subject.type.equals("_")){
				subject.place(type);
				this.turn += 1;
				this.show();
				this.checkGameState();
				if(this.gameState > 1) this.switchPlayer();

			}else System.out.println("There's already a piece there!");
			
			
		}else System.out.println("Invalid Piece Type! Please put in 'X' or 'O'");
		
	
	}
	
	public void show(){
		for(int i=0; i<board.length; i++){
			System.out.println((board[i][0].show()) + "    " + (board[i][1].show()) +"    "+ (board[i][2].show()));
			System.out.println("\n");
		}
	}
	
	public void switchPlayer(){
		if (this.current.equals(this.player1)){
			this.current = this.player2;
			System.out.println("Its " +this.current+"'s turn!" );
			return;
		}
		if (this.current.equals(this.player2)){
			this.current = this.player1;
			System.out.println("Its " +this.current+"'s turn!" );
			return;
		}
	}
	
	public void checkGameState(){
		
		for(int i=0; i<board.length; i++){ //horizontal check
			if(board[i][0].type.equals("X") || board[i][0].type.equals("O")){
				if(board[i][0].type.equals(board[i][1].type)  && board[i][0].type.equals(board[i][2].type) ){
					if(board[i][0].type.equals("X")){
						this.gameState = -1;
						System.out.println(this.current+" has won the game!");
					}else{
						this.gameState = 1;
						System.out.println(this.current+" has won the game!");
					}
				}
			}
		}
		
		for(int i=0; i<board.length; i++){ //vertical check
			if(board[0][i].type.equals("X") || board[0][i].type.equals("O")){
				if(board[0][i].type.equals(board[1][i].type)  && board[0][i].type.equals(board[2][i].type) ){
					if(board[0][i].type.equals("X")){
						this.gameState = -1;
						System.out.println(this.current+" has won the game!");
					}else{
						this.gameState = 1;
						System.out.println(this.current+" has won the game!");
					}
				}
			}
		}
		
		if(board[0][0].type.equals("X") || board[0][0].type.equals("O")){
			if(board[0][0].type.equals(board[1][1].type)  && board[0][0].type.equals(board[1][1].type) ){
				if(board[0][0].type.equals("X")){
					this.gameState = -1;
					System.out.println(this.current+" has won the game!");
				}else{
					this.gameState = 1;
					System.out.println(this.current+" has won the game!");
				}
			}
		}
		if(board[0][2].type.equals("X") || board[0][2].type.equals("O")){
			if(board[0][2].type.equals(board[1][1].type)  && board[0][2].type.equals(board[2][0].type) ){
				if(board[0][2].type.equals("X")){
					this.gameState = -1;
					System.out.println(this.current+" has won the game!");
				}else{
					this.gameState = 1;
					System.out.println(this.current+" has won the game!");
				}
			}
		}
		if(this.turn == 9 && this.gameState == 9){
			this.gameState = 0;
			System.out.println("The game is a draw!");
		}
		
	}
	

}
