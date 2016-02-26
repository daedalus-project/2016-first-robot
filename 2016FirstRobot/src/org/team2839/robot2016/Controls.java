package org.team2839.robot2016;

import org.team2839.robot2016.commands.CatapultShootCommand;
import org.team2839.robot2016.commands.DriveToggleCommand;
import org.team2839.robot2016.commands.GroupBallEjectCommand;
import org.team2839.robot2016.commands.GroupBallInCommand;
import org.team2839.robot2016.commands.GroupLowBarCommand;
import org.team2839.robot2016.commands.GroupReadyToShootCommand;
import org.team2839.robot2016.utils.Gamepad;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Controls {

    public static Joystick leftDriveJoystick, rightDriveJoystick;
    public static Gamepad gamepad;

    private static Button driveTank, driveArcade, driveGamepadTank, driveStop, driveToggle, driveGamepadToggle;

    private static Button grabberTuck, grabberUp, grabberOut;

    private static Button clawTuck, clawMid, clawOut;

    private static Button ballIn, shooterReady, shoot, travelMode, ballEject;

    public static void init() {
        leftDriveJoystick = new Joystick(0);
        rightDriveJoystick = new Joystick(1);
        gamepad = new Gamepad(2);

//        driveTank = new JoystickButton(leftDriveJoystick, 2);
//        driveTank.whenPressed(new DriveTankCommand());

//        driveToggle = new JoystickButton(leftDriveJoystick, 11);
//        driveToggle.whenPressed(new DriveToggleCommand());
        
//        driveGamepadTank = new JoystickButton(gamepad, Gamepad.BUTTON_RIGHT_THUMB);
//        driveGamepadTank.whenPressed(new DriveGamepadTankCommand());
        
        driveGamepadToggle = new JoystickButton(gamepad, Gamepad.BUTTON_RIGHT);
        driveGamepadToggle.whenPressed(new DriveToggleCommand());

//        ballIn = new JoystickButton(gamepad, Gamepad.BUTTON_Y);
//        ballIn.whenPressed(new GroupBallInCommand());
//
//        shooterReady = new JoystickButton(gamepad, Gamepad.BUTTON_B);
//        shooterReady.whenPressed(new GroupReadyToShootCommand());
//        
//        ballEject = new JoystickButton(gamepad, Gamepad.BUTTON_X);
//        ballEject.whenPressed(new GroupBallEjectCommand());
//
//        shoot = new JoystickButton(gamepad, Gamepad.BUTTON_RIGHT_TRIGGER);
//        shoot.whenPressed(new CatapultShootCommand());
//
//        travelMode = new JoystickButton(gamepad, Gamepad.BUTTON_A);
//        travelMode.whenPressed(new GroupLowBarCommand());

//        clawTuck = new JoystickButton(leftDriveJoystick, 7);
//        clawTuck.whenPressed(new PortcullisClawTuckCommand());
//
//        clawOut = new JoystickButton(leftDriveJoystick, 8);
//        clawOut.whenPressed(new PortcullisClawExtendCommand());
//        
//        clawMid = new JoystickButton(leftDriveJoystick, 9);
//        clawMid.whenPressed(new PortcullisClawMidpointCommand());

        // driveArcade = new JoystickButton(leftDriveJoystick, 4);
        // driveArcade.whenPressed(new DriveArcadeCommand());
        //
        // driveGamepadTank = new JoystickButton(leftDriveJoystick, 5);
        // driveGamepadTank.whenPressed(new DriveGamepadTankCommand());
        //
        // driveStop = new JoystickButton(leftDriveJoystick, 2);
        // driveStop.whenPressed(new DriveStopCommand());
        //
        // driveToggle = new JoystickButton(leftDriveJoystick, 1);
        // driveToggle.whenPressed(new DriveToggleCommand());
        //
        // driveGamepadToggle = new JoystickButton(gamepad,
        // Gamepad.BUTTON_RIGHT);
        // driveGamepadToggle.whenPressed(new DriveToggleCommand());

        // grabberUp = new JoystickButton(leftDriveJoystick, 8);
        // grabberUp.whenPressed(new GrabberHingeInCommand());
        //
        // grabberOut = new JoystickButton(leftDriveJoystick, 9);
        // grabberOut.whenPressed(new GrabberHingeOutCommand());
        //

    }

}
