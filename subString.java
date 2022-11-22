//2. Java program to find all substrings of a string. For example substrings of “fun” are :- “f”,
//“fu”, “fun”, “u”, “un” and “n”.

import java.util.Scanner;

import java.util.Scanner;

class subString
{
    public static void main(String args[])
    {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to print all its substrings");
        string  = in.nextLine();

        length = string.length();
        System.out.println("subStrings of \""+string+"\" are:");

        for (c = 0; c < length; c++)
        {
            for(i = 1; i <= length - c; i++)
            {
                sub = string.substring(c, c+i);
                System.out.println(sub);
            }
        }
    }
}
