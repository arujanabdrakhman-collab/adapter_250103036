public class BulbAdapter implements SmasrtDevice {
    private final LegacyBulb bulb;
    int i = 0;

    public BulbAdapter(LegacyBulb bulb) {
        if (bulb == null) {
            throw new IllegalArgumentException("LegacyBulb cannot be null.");
        }
        this.bulb = bulb;
    }

    public void turnOn() {
        bulb.setBrightness(255);
    }

    public void turnOff() {
        bulb.setBrightness(0);
    }

    public boolean isOn() {
        if (!bulb.hasPower()) {
            return false;
        }
        return bulb.readBrightness() > 0;
    }

    public int getPowerPercent() {
        if (!bulb.hasPower()) {
            return 0;
        }

        int rawBrightness = bulb.readBrightness();
        if (rawBrightness == 0) {
            return 0;
        }

        int rawPercent = (int) Math.floor((rawBrightness * 100.0) / 255.0);
        int calibratedPercent = rawPercent + i;


        return Math.min(100, calibratedPercent);
    }
}