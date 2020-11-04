package oop;

public class SodaCan {

    private int height;
    private int radius;

    public SodaCan()
    {
        height = 0;
        radius = 0;
    }

    public SodaCan(int height, int radius)
    {
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getHeight(){return this.height;}
    public int getRadius(){return this.radius;}

    //formula for the surface area of a cylinder A = 2πrh+2πr^2
    public double getSurfaceArea()
    {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius ^ 2));
    }

    //formula for volume of a cylinder V = πr^2h
    public double getVolume()
    {
        return Math.PI * (radius ^ 2) * height;
    }
}
