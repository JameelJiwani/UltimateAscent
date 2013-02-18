/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3946.UltimateAscent.commands;

/**
 *
 * @author Makaylah
 */
public class StartLaunchWheels extends CommandBase {
    
    public StartLaunchWheels() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(frisbeeWheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //if the frisbee wheels are stopped
        //then we need some warmup time before
        //next command is allowed to run
        if(!frisbeeWheels.isRunning()) {
            setTimeout(2.2);
        } else {
            setTimeout(0);
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        frisbeeWheels.set(0.5, -.9);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
