import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import static java.nio.file.Files.write;


public class Main {
    public static void main(String[] args) throws IOException {
//Scanner
        Scanner scanner = new Scanner(System.in);
//Bufor wprowadzania wartości
        List<String> list = new LinkedList<>();

        //Pytaj o wartości
        while(true) {

            System.out.println("Enter some number");
            String line = scanner.nextLine();
        if (line.equals("QUIT"))
        {
            break;
        }else
        {
            list.add(line);
        }
        }
        //Zapis do pliku
        // System.out.println("Your input was: " + line);

        Files.write(
                Paths.get("D:\\Kamil Grzechnik\\Laborki\\output.txt"),
                list,
                Charset.forName("UTF-8"),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING


        );

    }



}
