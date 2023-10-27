import java.util.Scanner;

public class Game {

    public Game(){}

    public void Play(){
        boolean gameOn = true;
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        while(gameOn){
            System.out.print("X: ");
            int x = scanner.nextInt();
            System.out.print(" Y: ");
            int y = scanner.nextInt();

            boolean hit = board.Shoot(x,y);
            if(hit){
                System.out.println("Hit!");
                if(board.IsAllShipsDestroyed()){
                    gameOn = false;
                    System.out.println("You Won");
                }

            }
            else
                System.out.println("Miss!");

        }

    }

}
