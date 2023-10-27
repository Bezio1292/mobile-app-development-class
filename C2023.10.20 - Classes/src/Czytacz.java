import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Czytacz {

public Czytacz()
{

}
    public void czytaj() {
        Random generator = new Random();
        int x = generator.nextInt(5);
        try {
            int y = 10 / x;
            System.out.println("wartosc: " + y);
        } catch (Exception e) {
            System.out.println("Pewnie zero");
        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            x = Integer.parseInt(bf.readLine());
            System.out.println("Wczytano: " + x);
        } catch (NumberFormatException nfe) {
            System.out.println("Pewnie nieliczba");
        } catch (IOException e) {
            System.out.println("Pewnie problem");
        }
    }
}
