package oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n*** SodaCan App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        SodaCan sc1 = new SodaCan(10,3);

        System.out.println();

    }
}
