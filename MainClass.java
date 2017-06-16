import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {
	
	public static void main(String[] args){
		

		System.out.println("Done!\n\n");
		
		Scanner input = new Scanner(System.in);
		String p1;
		String p2;
		System.out.println("Enter Player One's (Xs) Name , they will go first :");
		p1 = input.nextLine();
		System.out.println("Enter Player 2s Name (Os):");
		p2 = input.nextLine();
		Board board = new Board(p1, p2);
		
		


		
		do{
			String piece;
			String position;
			int[] pos = new int[2];
			
			if(board.current.equals(p1)){
				piece = "X";
			}else piece = "O";

			System.out.println(board.current + ", what position would you like to place your piece? (row, column)");
			position = (input.nextLine()).replaceAll("\\D+","");
			pos[0] = Character.getNumericValue(position.charAt(0));
			pos[1] = Character.getNumericValue(position.charAt(1));
			board.placePiece(piece, new Tuple(pos[0], pos[1]));
		}while(board.gameState > 1);
//		board.placePiece("X", new Tuple(1, 1));
//		board.placePiece("X", new Tuple(1, 2));
//		board.placePiece("O", new Tuple(1, 3));
//		board.placePiece("O", new Tuple(2, 1));
//		board.placePiece("O", new Tuple(2, 2));
//		board.placePiece("X", new Tuple(2, 3));X
//		board.placePiece("X", new Tuple(3, 1));
//		board.placePiece("O", new Tuple(3, 2));
//		board.placePiece("X", new Tuple(3, 3));
		

		


		
	}

}
// X X O
// O O X
// X O X
