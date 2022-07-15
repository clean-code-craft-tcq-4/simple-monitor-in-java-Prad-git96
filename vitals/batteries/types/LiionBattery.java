package vitals.batteries.types;

import vitals.batteries.Battery;
import vitals.batteries.constants.LiionBatteryHealthConstants;

public class LiionBattery extends Battery{
	
	public LiionBattery(){
		minTemperature= LiionBatteryHealthConstants.MIN_TEMPERATURE;
		maxTemperature= LiionBatteryHealthConstants.MAX_TEMPERATURE;
		minSoc=LiionBatteryHealthConstants.MIN_STATE_OF_CHARGE;
		maxSoc=LiionBatteryHealthConstants.MAX_STATE_OF_CHARGE;
		minChargeRate=LiionBatteryHealthConstants.MIN_RATE_OF_CHARGE;
		maxChargeRate=LiionBatteryHealthConstants.MAX_RATE_OF_CHARGE;
	}

	public LiionBattery(int temperature, int soc, double chargeRate) {
		this();
		this.temperature=temperature;
		this.soc=soc;
		this.chargeRate=chargeRate;
	}
	
}
		

