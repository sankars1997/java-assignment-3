//5. Define a new exceptions, called ExceptionLineTooShort and ExceptionLineTooLong,
//that prints out the error message "The input is too long" and "The input is too short". Write
//a program that reads lines from user and throws an exception of type
//ExceptionLineTooLong and ExceptionLineTooShort in the case where a string of the file
//is longer than 10 characters and shorter than 5 characters respectively. Create separate
//method for the length checking & exception throw and handle the exception appropriately.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ExceptionLineTooShort extends Exception
{
    ExceptionLineTooShort(String s)
    {
        super(s);
    }
}

class ExceptionLineTooLong extends Exception
{
    ExceptionLineTooLong(String s)
    {
        super(s);
    }
}



public class stringLengthCheck {

    public static int findLength(String word)
    {
        char[] a=word.toCharArray();
        int len=0;

        for(char ch:a)
        {
            len++;
        }
        return len;
    }

    public static int lengthCheck(int len)
    {
        if(len<5)
        {
            return 0;
        }
        else if (len>10)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Reading lines from user to check exception");


        try
        {


            String currentLine=new String();
            currentLine=sc.nextLine();

            String[] words = currentLine.split(" ");

            for(String word:words)
            {
                int strlen=findLength(word);

                int norm=lengthCheck(strlen);

                if (norm == 0)
                {
                    throw new ExceptionLineTooShort("The input "+word+" is too short");

                }
                else if (norm == 2)
                {
                    throw new ExceptionLineTooLong("The input "+word+" is too long");

                }

                else
                {
                    System.out.println("The input "+word+" is neither too long nor too short");
                }

            }
        }
        catch (ExceptionLineTooShort e)
        {
            System.out.println(e);
        }
        catch (ExceptionLineTooLong e)
        {
            System.out.println(e);
        }

    }
}
