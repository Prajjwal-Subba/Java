import java.util.*;
abstract class Vehicle
{
    String vehicleNumber;
    String brand;
    Vehicle(String vehicleNumber, String brand)
    {
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    abstract void startEngine();
    final void showVehicleIdentity()
    {
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Brand: "+brand);
    }
}
class Car extends Vehicle
{
    Car(String vehicleNumber, String brand)
    {
        super(vehicleNumber,brand);
    }
    void startEngine()
    {
        System.out.println("Car engine started");
    }
}
class Bike extends Vehicle
{
    Bike(String vehicleNumber, String brand)
    {
        super(vehicleNumber,brand);
    }
    void startEngine()
    {
        System.out.println("Bike engine started");
    }
}
class VehicleDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car number");
        String cn=sc.nextLine();
        System.out.println("Enter car brand");
        String cb=sc.nextLine();
        Car car=new Car(cn,cb);
        car.startEngine();
        car.showVehicleIdentity();
        System.out.println("Enter bike number");
        String bn=sc.nextLine();
        System.out.println("Enter bike brand");
        String bb=sc.nextLine();
        Bike bike=new Bike(bn,bb);
        bike.startEngine();
        bike.showVehicleIdentity();
    }
}