package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DigitalChannelController;

/**
 * Created by jliu on 10/20/15.
 */
public class BaseBot2ColorSensorDemo extends BaseBot2Auton {
    public void auton() throws InterruptedException{
        initRobot();
        deviceInterfaceModule.setDigitalChannelMode(0, DigitalChannelController.Mode.OUTPUT);
        deviceInterfaceModule.setDigitalChannelState(0,false);
        while (opModeIsActive()){
            waitOneFullHardwareCycle();
            telemetry.addData("Red:", colorSensor.red());
            telemetry.addData("Blue:", colorSensor.blue());
            telemetry.addData("Green:",colorSensor.green());

        }
    }
}
