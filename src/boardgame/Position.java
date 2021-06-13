package boardgame;

public class Position {
   private int row; //private só o método da classe tem acesso
   private int column;
   //btdir Source/Generated Constructor Using Fields
   public Position(int row, int column) {
	   //super();
	   this.row = row;
	   this.column = column;
   }
   //btdir Source/Generated Getters and Setters
   public int getRow() {	//consegue-se acessar os dados de row e col só com get
	   return row;          //mas não diretamente
   }
   public void setRow(int row) {
	   this.row = row;
   }
   public int getColumn() {
	   return column;
   }
   public void setColumn(int column) {
	   this.column = column;
   }
   //btdir Source/Generated toString
   @Override
   public String toString() {
	   return row + ", " + column;
   }
   
  
   
   
}
