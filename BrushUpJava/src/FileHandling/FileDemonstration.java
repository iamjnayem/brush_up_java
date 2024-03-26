package FileHandling;

import java.io.File;
import java.util.Scanner;

public class FileDemonstration {

    public static void takeInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file or directory: ");
        analyzePath(input.nextLine());
    }

    public static void analyzePath(String path)
    {
        File name = new File(path);
        if(name.exists())
        {
            System.out.println(name.getName());
            System.out.println(name.isFile());
        }
    }

}

