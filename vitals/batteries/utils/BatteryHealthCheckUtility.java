package vitals.batteries.utils;

import vitals.batteries.Battery;
import vitals.batteries.types.LiionBattery;

public class BatteryHealthCheckUtility {

	public static boolean isTemperatureOk(Battery battery) {
		if(battery.temperature <= battery.minTemperature || battery.temperature >= battery.maxTemperature) {
            System.out.println("Temperature is out of range!");
            return false;
        }
		return true;
	}
	
	public static boolean isStateOfChargeOk(Battery battery) {
		 if(battery.soc <= battery.minSoc || battery.soc >= battery.maxSoc) {
	            System.out.println("State of Charge is out of range!");
	            return false;
	        } 
		 return true;
	}
	
	public static boolean isChargeRateOk(Battery battery) {
		 if(battery.chargeRate<=battery.minChargeRate || battery.chargeRate >= battery.maxChargeRate) {
			   System.out.println("Charge Rate is out of range!");
	            return false;
	        } 
		 return true;
	}
	
	 public static boolean batteryIsOk(LiionBattery liionBattery) {
	        return isTemperatureOk(liionBattery) && isStateOfChargeOk(liionBattery) && isChargeRateOk(liionBattery);
	 }

}
