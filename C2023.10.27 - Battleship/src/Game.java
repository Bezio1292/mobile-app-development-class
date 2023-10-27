import java.awt.*;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    public Game(){}

    public void Play(){
        boolean gameOn = true;

        Board board = new Board();
        while(gameOn){

            board.DrawBoard();
            Point p = GetPointFromUser();

            boolean hit = board.Shoot(p.y, p.x);

            if(hit){
                if(board.IsAllShipsDestroyed()){
                    gameOn = false;
                    System.out.println("You Won");
                    board.DrawBoard();
                }

            }
            else
                System.out.println("Miss!");
        }
    }

    private Point GetPointFromUser(){
        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.print("Y: ");
        int y = scanner.nextInt();

        return new Point(x-1,y-1);
    }

}
