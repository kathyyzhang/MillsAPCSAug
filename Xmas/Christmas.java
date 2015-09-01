/* Kathy Zhang
 * revision date: 8.31.15
 * purpose: to print out "The Twelve Days of Christmas" :)
 */
public class Christmas
{
    public static void printDay()
    {
        System.out.println(" day of Christmas,\nmy true love sent to me");
    }

    public static void printPart()
    {
        System.out.println("a partridge in a pear tree.");
    }

    public static void printDove()
    {
        System.out.println("two turtle doves, and");
    }

    public static void printHen()
    {
        System.out.println("three French hens,");
    }

    public static void printBird()
    {
        System.out.println("four calling birds,");
    }

    public static void printRing()
    {
        System.out.println("five golden rings,");
    }

    public static void printGeese()
    {
        System.out.println("six geese a-laying,");
    }

    public static void printSwan()
    {
        System.out.println("seven swans a-swimming,");
    }

    public static void printMaid()
    {
        System.out.println("eight maids a-milking,");
    }

    public static void printLady()
    {
        System.out.println("nine ladies dancing,");
    }

    public static void printLord()
    {
        System.out.println("ten lords a-leaping");
    }

    public static void printPiper()
    {
        System.out.println("eleven pipers piping,");
    }

    public static void printDrum()
    {
        System.out.println("Twelve drummers drumming,");
    }
    
    public static void printFiveGroup()
    {
        printRing();
        printBird();
        printHen();
        printDove();
        printPart();
    }
        
    public static void main(String[] args)
    {
        System.out.print("On the first");
        printDay();
        printPart();
        System.out.println();
        System.out.print("On the second");
        printDay();
        printDove();
        printPart();
        System.out.println();
        System.out.print("On the third");
        printDay();
        printHen();
        printDove();
        printPart();
        System.out.println();
        System.out.print("On the fourth");
        printDay();
        printBird();
        printHen();
        printDove();
        printPart();
        System.out.println();
        System.out.print("On the fifth");
        printDay();
        printFiveGroup();
        System.out.println();
        System.out.print("On the sixth");
        printDay();
        printGeese();
        printFiveGroup();
        System.out.println();
        System.out.print("On the seventh");
        printDay();
        printSwan();
        printGeese();
        printFiveGroup();
        System.out.println();
        System.out.print("On the eighth");
        printDay();
        printMaid();
        printSwan();
        printGeese();
        printFiveGroup();
        System.out.println();
        System.out.print("On the ninth");
        printDay();
        printLady();
        printMaid();
        printSwan();
        printGeese();
       printFiveGroup();
        System.out.println();
        System.out.print("On the tenth");
        printDay();
        printLord();
        printLady();
        printMaid();
        printSwan();
        printGeese();
       printFiveGroup();
        System.out.println();
        System.out.print("On the eleventh");
        printDay();
        printPiper();
        printLord();
        printLady();
        printMaid();
        printSwan();
        printGeese();
        printFiveGroup();
        System.out.println();
        System.out.print("On the twelfth");
        printDay();
        printDrum();
        printPiper();
        printLord();
        printLady();
        printMaid();
        printSwan();
        printGeese();
        printFiveGroup();
    }  
}
