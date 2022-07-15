package vitals;

import vitals.batteries.types.LiionBattery;
import vitals.batteries.utils.BatteryHealthCheckUtility;

public class Main {
   
    public static void main(String[] args) {
    	
    	// happy path
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(25, 70, 0.7f)) == true);

    	// temperature checks
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(-1, 70, 0.7f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(0, 70, 0.7f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(45, 70, 0.7f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(105, 70, 0.7f)) == false);
        
        // Soc checks
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, -5, 0.0f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 2, 0.0f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 80, 0.0f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 85, 0.0f)) == false);
        
        // rate of charge checks
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 70, -0.0f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 70, 0.0f)) == false);
        assert(BatteryHealthCheckUtility.batteryIsOk(new LiionBattery(30, 70, 0.8f)) == false);

        
        System.out.println("tested ok");
    }
}
