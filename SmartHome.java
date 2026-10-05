interface SmartDevice
{
    void turnOn();
    void turnOff();
}
class SmartFan implements SmartDevice
{
    int speed;
    public void turnOn()
    {
        System.out.println("Smart Fan turned On");
    }
    public void turnOff()
    {
        System.out.println("Smart Fan turned Off");
    }
    void setSpeed(int speed)
    {
        this.speed=speed;
        System.out.println("Fan Speed set to: "+speed);
    }
}
class SmartLight implements SmartDevice
{
    int brightness;
    public void turnOn()
    {
        System.out.println("Smart Light turned On");
    }
    public void turnOff()
    {
        System.out.println("Smart Light turned Off");
    }
    void setBrightness(int brightness)
    {
        this.brightness=brightness;
        System.out.println("Light Brightness set to: "+brightness);
    }
}
class SmartAC implements SmartDevice
{
    int temperature;
    public void turnOn()
    {
        System.out.println("Smart AC turned On");
    }
    public void turnOff()
    {
        System.out.println("Smart AC turned Off");
    }
    void setTemperature(int temperature)
    {
        this.temperature=temperature;
        System.out.println("AC temperature set to: "+temperature);
    }
}
class SmartHome
{
    public static void main(String[] args) 
    {
        SmartDevice device;

        device = new SmartFan();
        device.turnOn();
        device.turnOff();
        ((SmartFan) device).setSpeed(3);
        
        device = new SmartLight();
        device.turnOn();
        device.turnOff();
        ((SmartLight) device).setBrightness(75);

        device = new SmartAC();
        device.turnOn();
        device.turnOff();
        ((SmartAC) device).setTemperature(24);
    }
}