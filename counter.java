//3. Write a program when supplied with a multiple line of input, count the number of lines,
//words and vowels in the text. For the purposes of this program, a word is any sequence of
//characters delimited by spaces, tabs and newlines.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class counter
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int vowelCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try
        {
            reader = new BufferedReader(new FileReader("D:\\javaprojects\\src\\linesoftext.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for (int i=0 ; i<currentLine.length(); i++)
                {
                    char ch = currentLine.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    {
                        vowelCount++;
                    }
                }

                currentLine = reader.readLine();
            }
            System.out.println("Number of vowels in file : "+ vowelCount);
            System.out.println("Number of words in file : "+wordCount);
            System.out.println("Number of lines in file : "+lineCount);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
