package org.usfirst.frc.team2881.subsystems;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Spark;

public class ExpoMotor extends SampleRobot {

    //
    // Fields on the ExpoMotor object are next
    //
    XboxController QuinnExMachina;

    //
    // Constructor for the ExpoMotor object is next, called when someone does "new ExpoMotor(...)"
    //
    public ExpoMotor(XboxController QuinnExMachina) {
        this.QuinnExMachina = QuinnExMachina;
    }

    //
    // Methods on the ExpoMotor object below
    //

    public void exponential(int port, SpeedController spark) {
        double electron1 = 0;
        double electron2 = 1;
        double crement = .5 / 200.0;  // <- this is a local variable, not a field

        if (QuinnExMachina.getRawButton(port) == true) {
            spark.set(electron1);
            electron1 = (electron1 + crement) * (1 + .75 / 200);
        } else if (QuinnExMachina.getRawButton(port) == false && electron1 >= 1 && electron2 > 0) {
            spark.set(electron2);
            electron2 = (electron2 - crement) / (1 + .75 / 200);
        } else {
            spark.set(0);
            electron1 = 0;
            electron2 = 1;
        }
        SmartDashboard.putNumber("electron1", electron1);
        SmartDashboard.putNumber("electron2", electron2);
        Timer.delay(0.005);
    }
}
