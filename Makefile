MainClass.class : Mainclass.java
	javac MainClass.java

run : MainClass.class
	java MainClass

clean : 
	rm MainClass.class
	rm Board.class
	rm Piece.class
	rm Tuple.class