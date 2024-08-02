import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("wynikiRoot.txt");
        boolean exists = file.exists();
        System.out.println(exists);
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        Scanner scanner = new Scanner(file);
        String linia1 = scanner.nextLine();
        System.out.println(linia1);

        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String name = System.getProperty("user.name");
        System.out.println(name);

        String pathSeparator = System.getProperty("path.separator");
        System.out.println(pathSeparator);

        File file2 = new File("wynikiFileReader.txt");
        boolean exists2 = file.exists();
        System.out.println(exists2);
        FileReader fileReader = new FileReader(file2);
        int i;
        while((i = fileReader.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}