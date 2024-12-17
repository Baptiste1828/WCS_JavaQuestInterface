public class Eagle extends Bird implements Fly {

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

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.isFlying() && this.getAltitude() == 0) {
            this.setFlying(true);;
            System.out.println("Hawkeye takes off in the sky.");
        }
    }

    @Override
    public void ascend(int meters) {
        if(this.isFlying()) {
            this.setAltitude(this.getAltitude() + meters);
            System.out.println("Hawkeye flies upward, altitude: " + this.getAltitude());
        }
    }

    @Override
    public void glide() {
        if (this.isFlying()) {
            System.out.println("glides into the air.");
        }
    }

    @Override
    public void descend(int meters) {
        if (this.isFlying()) {
            this.setAltitude(Math.max(this.getAltitude() - meters, 1));
            System.out.println("Hawkeye flies downward, altitude: " + this.getAltitude());
        }
    }

    @Override
    public void land() {
        if (this.getAltitude() <= 1) {
            this.setAltitude(0);;
            this.setFlying(false);;
            System.out.println("Hawkeye lands on the ground.");
        } else {
            System.out.println("Hawkeye is too high, it can't land.");
        }
    }
}
