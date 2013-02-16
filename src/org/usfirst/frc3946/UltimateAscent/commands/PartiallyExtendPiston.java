/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3946.UltimateAscent.commands;

/**
 *
 * @author 10374778
 */
public class PartiallyExtendPiston extends CommandBase {
    
    public PartiallyExtendPiston() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires (climbingPiston);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout (1);
        climbingPiston.extend();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        climbingPiston.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
