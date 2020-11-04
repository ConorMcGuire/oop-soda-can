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

        System.out.printf("The surface area is %.2fcm2\n", sc1.getSurfaceArea());
        System.out.printf("The volume is %.2fcm3\n", sc1.getVolume());
    }
}
