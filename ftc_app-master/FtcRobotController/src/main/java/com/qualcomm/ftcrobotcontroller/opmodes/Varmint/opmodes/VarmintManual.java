package com.qualcomm.ftcrobotcontroller.opmodes.Varmint.opmodes;

/**
 * Created by jliu on 10/22/15.
 */
public abstract class VarmintManual extends VarmintHardware {
    public void runOpMode()throws InterruptedException{
        initRobot();
        setup();
        waitForStart();
        while(opModeIsActive()){
            mainLoop();
            waitOneFullHardwareCycle();
        }
        cleanUp();
        stopRobot();
    }

    protected void setup() throws InterruptedException{
        //this function is designed to be overridden.
        //override this function for any setup work.
        //this function will be called right before the main function starts.
    }

    protected abstract void mainLoop(); //implement this function as the main loop
    //it will be called over and over again when opMode is active.

    protected void cleanUp(){
        //this function is designed to be overridden.
        //override this function for any clean up you need.
        //this will be called right after opmode ends.
    };
}
