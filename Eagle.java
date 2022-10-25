public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.printf("%s takes off in the sky.%n", getName());        
    }

    @Override
    public int ascend(int meters) {  
        altitude = getAltitude() + meters;      
        System.out.printf("%s flies upward, altitude: %d .%n", getName(), altitude);
        return altitude;
    }

    @Override
    public int descend(int meters) {
        altitude = Math.max(getAltitude() - meters, 0); 
        System.out.printf("%s flies downward, altitude: %d.%n", getName(), altitude);
        return altitude;
    }

    @Override
    public void land() {
        System.out.println("Hawkeye lands on the ground.");
        
    }
}
