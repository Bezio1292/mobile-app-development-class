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
    public boolean HitTest(int x, int y){
        x -= 1;
        y -= 1;
        if(x < 0 || x>= position.length) return false;
        if(y < 0 || y>= position.length) return false;

        if(position[x][y] == 1) {
            position[x][y] = -1;
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
