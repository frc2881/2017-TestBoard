package org.usfirst.frc.team2881.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    //
    // CAN bus addresses (0-63)

    public final PowerDistributionPanel pdp = new PowerDistributionPanel(10);

    private final int pneumaticsControlModule = 11;
    public final Compressor compressor = new Compressor(0);

    //
    // PWM Outputs (0-9)
    //IMPORTANT NOTE: We have 4 Spark controllers on one test board and 8 on the other, so sticking to 0-3 is better
    //so we don't accidentally try to run a motor that doesn't exist.  For CANTalons we have 0-3 as well.
    private final Spark rearLeftMotor = new Spark(2);//the number corresponds to the PWM port on the robot/test board
    private final Spark rearRightMotor = new Spark(3);
    private final Spark frontLeftMotor = new Spark(0);
    private final Spark frontRightMotor = new Spark(1);
    public final RobotDrive robotDrive = new RobotDrive(
            frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

    public final CANTalon climberRatchetMotor = new CANTalon(0);

    public final CANTalon testMotorCANTalon2 = new CANTalon(2);
    public final CANTalon gearIntakeMotor = new CANTalon(1);
    public final int gearIntakeMotorPdpChannel = 3;

    //
    // Pneumatics Outputs (0-7)

    public final Solenoid driveShifter1 = new Solenoid(pneumaticsControlModule, 0);
    public final Solenoid driveShifter2 = new Solenoid(pneumaticsControlModule, 3);
    public final Solenoid gearIntakePiston = new Solenoid(pneumaticsControlModule, 2);

    //
    // Additional configuration

    public RobotMap() {
        rearRightMotor.setInverted(false);
        frontRightMotor.setInverted(false);

        LiveWindow.addActuator("Drive Train", "Front Left Motor", frontLeftMotor);
        LiveWindow.addActuator("Drive Train", "Front Right Motor", frontRightMotor);
        LiveWindow.addActuator("Drive Train", "Rear Left Motor", rearLeftMotor);
        LiveWindow.addActuator("Drive Train", "Rear Right Motor", rearRightMotor);
        LiveWindow.addActuator("Drive Train", "Shifter 1", driveShifter1);
        LiveWindow.addActuator("Drive Train", "Shifter 2", driveShifter2);

        LiveWindow.addActuator("Climber Motor", "Climber Motor", climberRatchetMotor);

        LiveWindow.addActuator("Gear Pouch", "Intake Motor", gearIntakeMotor);
    }
}
