//1. Create an abstract class OutdoorGame inside the package ‘sports’. Inherit it for Football and
//Cricket. Create another package ‘sportsstar’. Inside which create two class Footballer and
//Cricketer. Each class shows individual income based on the rating ( where rating is assigned
//based on different bowling or bating avg or total goal done or saved by different sports persons)
//of its different star sports person.

package sports;


abstract class OutdoorGame
{
    abstract void play();
}

class Football extends OutdoorGame
{
    void play()
    {
        System.out.println("playing football");
    }
}

class Cricket extends OutdoorGame
{
    void play()
    {
        System.out.println("playing cricket");
    }
}
public class package1Driver {

    public static void main(String args[])
    {
        System.out.println("welcome to Package Sports");

        Football f1=new Football();
        f1.play();

        Cricket c1=new Cricket();
        c1.play();
    }
}
