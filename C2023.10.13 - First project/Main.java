import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Person[] people = {
                new Person("Ba","Kow"),
                new Person("Jan","Now")
        };

        for (Person p:people) {
            System.out.println(p.GetFullName());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        String newName = null;
        String newSurname = null;
        Integer newAge = 0;
        try {
            newName = br.readLine();
            newSurname = br.readLine();
            newAge = scanner.nextInt();
        } catch (IOException e) {
            newName = "";
            newSurname = "";
            //throw new RuntimeException(e);
        } catch (NumberFormatException e){
            newAge = new Random().nextInt(64);
        } catch (InputMismatchException e){
            newAge = new Random().nextInt(64);
        }

        Person p1 = new Person(newName,newSurname);
        p1.Age = newAge;
        System.out.println(p1.GetFullName());
    }
}