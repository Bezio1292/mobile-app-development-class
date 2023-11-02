import java.util.Vector;

public class Board {

    int[][] boardArray = new int[7][7];
   private Vector<Ship> ships;

   public Board(){
        ships = new Vector<Ship>();
       int[][] tmpPos0 =
               {{1,1,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0}};
       ships.add(new Ship(tmpPos0));
       int[][] tmpPos1 =
               {{0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,1,1,0},
                       {0,0,0,0,0,0,0}};
       ships.add(new Ship(tmpPos1));
       int[][] tmpPos2 =
                        {{0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,1,0,0,0,0},
                       {0,0,1,0,0,0,0},
                       {0,0,1,0,0,0,0},
                       {0,0,0,0,0,0,0}};
       ships.add(new Ship(tmpPos2));

   }

   public boolean IsAllShipsDestroyed(){
       return ships.isEmpty();
   }

   public boolean Shoot(int row, int col){
       if(boardArray[row][col]!=0) return false;

       for (Ship s: ships) {
           if(s.HitTest(row,col)){
               if(s.IsDestroyed()){
                   ships.remove(s);
                   System.out.println("Sunken!");
               }
               else{
                   UpdateBoard(row,col, 1);
               }
                   System.out.println("Hit!");
               return true;
           }
           else
               UpdateBoard(row,col, 2);
       }
       return false;
    }

    private void UpdateBoard(int row, int col, int val){
        if(row < 0 || row>= boardArray.length) return;
        if(col < 0 || col>= boardArray.length) return;
        boardArray[row][col] = val;
    }

    public void DrawBoard(){
        int from = -1;

        for (int row=from;row<boardArray.length;++row){
            String rowString = "";
            for (int col=from;col<boardArray.length;++col){

                if(row==from){
                    if(col == from){
                        rowString+= "   ";
                        continue;
                    }
                    rowString += (col+1)+ "  ";
                    if(col == boardArray.length-1) rowString += "X";
                    continue;
                }
                else if(col == from){
                    rowString += (row+1) + " ";
                    continue;
                }

                int val = boardArray[row][col];
                if(val == 0) rowString += " ⬤";
                else if(val == 1) rowString += " ✖";
                else if(val == 2) rowString += "  ◯";
            }
            System.out.println(rowString);
            if(row == boardArray.length - 1)
                System.out.println("Y");
        }
    }

}
