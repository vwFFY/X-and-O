
public class Piece {
	
	public String type;
	
	public Piece(){
		this.type = "_";
	}
	
	public Piece(String type){
		this.type = type;
	}
	
	public String show(){
		return this.type;
	}
	
	public void place(String type){
		if (this.type.equals("_")) this.type = type;
	}
	

}
