import java.io.File;
import java.io.IOException;

public class FileClassDemo
{
    public static void main(String[] args)
    {
        File file = new File("test.txt");
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File created:" +file.getName());
            }
            else
            {
                System.out.println("File already exists");
            }

            System.out.println("File path:" +file.getAbsolutePath());
            System.out.println("File readable:" +file.canRead());
            System.out.println("File writable:" +file.canWrite());
            System.out.println("File size:" +file.length()+ "bytes");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred:" +e.getMessage());

        }

    }
}

