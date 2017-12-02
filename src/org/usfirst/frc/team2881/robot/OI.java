package org.usfirst.frc.team2881.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2881.robot.commands.DriveWithJoysticks;
import org.usfirst.frc.team2881.robot.commands.FlipBackward;
import org.usfirst.frc.team2881.robot.commands.FlipForward;
import org.usfirst.frc.team2881.robot.commands.PickupGear;
import org.usfirst.frc.team2881.robot.commands.ScoreGear;
import org.usfirst.frc.team2881.robot.utils.AmpMonitor;

import static org.usfirst.frc.team2881.robot.Robot.robotMap;

import java.time.Duration;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// The FRC Driver Station should show the following in green:
    //  0 Controller (XBOX 360 For Windows)  [IN GREEN]
    //  1 Wireless Controller                [IN GREY]
    //  2 Controller (Gamepad F310)          [IN GREY]
	// It's ok if the Gamepad is in position 0, but rumble feedback won't work

    /** Configure XboxController */
	public final XboxController driverController = new XboxController(0);

	//Map functions on the controller
	public final Button highGear = new JoystickButton(driverController,6);		//assign highGear to bumper button
	public final Button flipForward = new JoystickButton(driverController,3); 	//assign pink box button makes robot drive facing forwards
	public final Button flipBackward = new JoystickButton(driverController,2); 	//assign red circle button makes robot drive facing backwards
	public final Button scoreGear = new JoystickButton(driverController,4);  	//assign left bumper to score the gear


    //Other possible Press buttons:
    public final Button blueX = new JoystickButton(driverController,1);					//maps blue X button
    public final Button greenTriangle = new JoystickButton(driverController, 5);			//maps green triangle button
public final Button dualScreenButton = new JoystickButton(driverController,7);		//maps small upper left button (dual screen button)
    public final Button optionsButton = new JoystickButton(driverController,8);			//maps small upper right options button
    public final Button leftJoystickPress = new JoystickButton(driverController,9);		//maps pressing down left joystick
    public final Button rightJoystickPress = new JoystickButton(driverController,10);	//maps pressing down right joystick

    //Axis Buttons for driving you should use in a separate driveWithJoysticks class, but if you want to
    //get a simple "this is pressed" from one of the axis buttons, do it like this.
    public final Button pickupGear = buttonFromAxis(driverController,3);  //assign right trigger button to picking up gear

    //Since we don't have an operator joystick in our test system, bind climber to left lower trigger
    public final DoubleSupplier climbJoystick = () -> driverController.getTriggerAxis(Hand.kLeft);  		//maps simple press of left lower trigger


    //POV button is more complicated so we'll add that later

    public void initCommands() {    //Now that we've mapped all the buttons, now we can set what happens when they are pressed/activated
        highGear.whileHeld(new DriveWithJoysticks(true));

        // Holding down gearIntake runs intake, releasing it stops intake.  Release the button when
        // the gamepad rumbles to indicate a gear is in the pouch.
        pickupGear.whileHeld(new PickupGear());

        // Hold down the gearEject button, drive away, release the button (maybe too simple, needs testing)
        scoreGear.whileHeld(new ScoreGear());

        // Swap the idea of front-to-back
        flipForward.whenActive(new FlipForward());
        flipBackward.whenActive(new FlipBackward());

        //Insert here any new commands you want a button to run

    }

    //with XboxController, there isn't a way to just see if a trigger axis button is pressed, so this method turns it into a button from an axis
    private Button buttonFromAxis(GenericHID controller, int axis) {
        return new Button() {
            @Override
            public boolean get() {
                return Math.abs(controller.getRawAxis(axis)) > 0.05;
            }
        };
    }
}
