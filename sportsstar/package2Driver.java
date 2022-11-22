//1. Create an abstract class OutdoorGame inside the package ‘sports’. Inherit it for Football and
//Cricket. Create another package ‘sportsstar’. Inside which create two class Footballer and
//Cricketer. Each class shows individual income based on the rating ( where rating is assigned
//based on different bowling or bating avg or total goal done or saved by different sports persons)
//of its different star sports person.

package sportsstar;


import java.util.Scanner;

class Footballer
{
    int individual_income;

    void calculate_income(int rating1)
    {
        this.individual_income=rating1*175000;
        System.out.println("Individual income of footballer is :"+this.individual_income);
    }
}

class Cricketer
{
    int individual_income;

    void calculate_income(int rating2)
    {
        this.individual_income=rating2*155000;
        System.out.println("Individual income of cricketer is "+this.individual_income);

    }

}

public class package2Driver {
    public static void main(String args[])
    {

        System.out.println("welcome to Package2 Sports star");

        Footballer f1=new Footballer();

        System.out.println("Enter the no of football players");
        Scanner sc=new Scanner(System.in);
        int footballer_count=sc.nextInt();
        int[] goals=new int[footballer_count];

        int total_goals=0;
        System.out.println("Enter the no of goals scored or saved by each footballer:");
        for(int i=0;i<footballer_count;i++)
        {
            goals[i]= sc.nextInt();
            total_goals+=goals[i];
        }

        int avg_goals=total_goals/footballer_count;
        f1.calculate_income(avg_goals);

        Cricketer c1=new Cricketer();


        System.out.println("Enter the no of cricket players");

        int cricketer_count=sc.nextInt();
        int[] bat_bowl=new int[cricketer_count];

        int total_cricket_score=0;
        System.out.println("Enter the bating or bowling avg of each cricketer");
        for(int i=0;i<cricketer_count;i++)
        {
            bat_bowl[i]= sc.nextInt();
            total_cricket_score+=bat_bowl[i];
        }

        int avg_bat_bowl=total_cricket_score/cricketer_count;
        c1.calculate_income(avg_bat_bowl);


    }
}
