package org.usfirst.frc.team2881.robot;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // PWM Outputs (0-9)
    //IMPORTANT NOTE: We have 4 Spark controllers on one test board and 8 on the other, so sticking to 0-3 is better
    //so we don't accidentally try to run a motor that doesn't exist.  For CANTalons we have 0-3 as well.
    public final static Spark spark0 = new Spark(0);//the number corresponds to the PWM port on the robot/test board
    public final static Spark spark1 = new Spark(1);
    public final static Spark spark2 = new Spark(2);
    public final static Spark spark3 = new Spark(3);
    public final static Spark spark4 = new Spark(4);
    public final static Spark spark5 = new Spark(5);
    public final static Spark spark6 = new Spark(6);
    public final static Spark spark7 = new Spark(7);


    public final static CANTalon talon0 = new CANTalon(0);
    public final static CANTalon talon1 = new CANTalon(1);
    public final static CANTalon talon2 = new CANTalon(2);
    public final static CANTalon talon3 = new CANTalon(3);
    public final static CANTalon talon4 = new CANTalon(4);
    public final static CANTalon talon5 = new CANTalon(5);

    public RobotMap() {
    }
}
