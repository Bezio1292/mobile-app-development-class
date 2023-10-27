public class Ship implements IDestroyed{
    private int hitCounter = 0;
    private int shipLength = 0;
    private final int[][] position;

    public Ship(int[][] pos){

        position = pos;
        for(int i = 0; i < pos.length;++i){
            for(int j=0;j< pos.length;++j){
                if(pos[i][j] == 1) ++shipLength;
            }
        }

    }
    public boolean HitTest(int row, int col){

        if(row < 0 || row>= position.length) return false;
        if(col < 0 || col>= position.length) return false;

        if(position[row][col] == 1) {
            position[row][col] = -1;
            ++hitCounter;
            return true;
        }
        else return false;
    }

    @Override
    public boolean IsDestroyed(){
        return hitCounter == shipLength;
    }

}
