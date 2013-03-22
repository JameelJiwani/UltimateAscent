package org.usfirst.frc3946.UltimateAscent;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    //Joysticks
    public static final int xboxController = 1;
    public static final int leftJoystick = 2;
    
    //XboxController Buttons
    public static final int launchFrisbee = XboxController.ButtonType.kRTrigger.value;
    public static final int loadFrisbee = XboxController.ButtonType.kLTrigger.value;
    public static final int firePiston = XboxController.ButtonType.kX.value;
    public static final int TopClimbingPiston = XboxController.ButtonType.kY.value;
    public static final int BottomClimbingPiston = XboxController.ButtonType.kA.value;
    public static final int StopMotors = XboxController.ButtonType.kB.value;
    public static final int pitchAft = XboxController.ButtonType.kL.value;
    public static final int pitchFore = XboxController.ButtonType.kR.value;
    public static final int AutoAim = XboxController.ButtonType.kStart.value;
    //    public static final int Climb = XboxController.ButtonType.kB.value;
    
    //leftJoystick Buttons
    public static final int adjustUp = 3;
    public static final int adjustLeft = 4;
    public static final int adjustRight = 5;
    public static final int adjustDown = 2;
    
    
    //Motors
    public static final int leftJaguar = 1; //Blue
    public static final int rightJaguar = 2; //Green
    public static final int climbingMotor = 3; //Grey
    public static final int frisbeeFirstWheel = 4; //Yellow
    public static final int frisbeeSecondWheel = 5; //Orange
    
    //Relays (Spikes)
    public static final int compressorRelay = 1; //Red
    public static final int frisbeeLoader = 2; //Purple
    public static final int deflector = 3; //Brown
    
    //Solenoids
    public static final int topPistonRetract = 1; //Red, Black Hose 
    public static final int topPistonExtend = 2; //Yellow, White Hose
    public static final int bottomPistonRetract = 3; //Orange, Black Hose 
    public static final int bottomPistonExtend = 4; //Green, White Hose
    public static final int firePistonRetract = 5; //Purple, Black Hose 
    public static final int firePistonExtend = 6; //Blue, White Hose
    
    //Digital
    public static final int pressureSwitch = 1; //White
    
    //Analog
    public static final int currentSensor = 1; //Black
    
    public static int offset = 0;
    public static int distance = 0;
}
