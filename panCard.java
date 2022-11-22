//4. Implement a java program to check the validity of the PAN Card number. The fifth letter of the PAN
//card should be the first letter of the name of the PAN card Holder. Raise an user defined exception
//named withInvalidPanException and display the relevant message.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class InvalidPanException extends Exception {
    public InvalidPanException(String s)
    {

        super(s);
    }
}


public class panCard {

    public static void main(String[] args) throws IOException {

        String panCardno=new String();

        String Name=new String();

        System.out.println("Enter the name of the pan card holder:");

        //Scanner sc=new Scanner(System.in);

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Name=bf.readLine();

        System.out.println("Enter the pan card number:");

        panCardno= bf.readLine();


        try
        {
            if(Name.charAt(0)==panCardno.charAt(4))
            {
                System.out.println("First char in name "+Name.charAt(0));

                System.out.println("fifth char in pan card "+panCardno.charAt(4));

                System.out.println("Valid pan card no");
            }
            else {
                throw new InvalidPanException("invalid pan card number");
            }
        }
        catch (InvalidPanException e)
        {
            System.out.println(e);

        }



    }

}