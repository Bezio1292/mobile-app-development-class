import java.util.Vector;

public class Board {

   private Vector<Ship> ships;

   public Board(){
        ships = new Vector<Ship>();
       int[][] tmpPos0 =
               {{0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,1,1},
               {0,0,0,0,0,0,0}};
       ships.add(new Ship(tmpPos0));
       int[][] tmpPos1 =
               {{0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0},
                       {0,0,0,1,1,1,0},
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

    public boolean Shoot(int x, int y){
        for (Ship s: ships) {
            if(s.HitTest(x,y)){
                if(s.IsDestroyed()){
                    ships.remove(s);
                    System.out.println("Sinken!");
                }
                return true;
            }
        }
        return false;
    }
}
