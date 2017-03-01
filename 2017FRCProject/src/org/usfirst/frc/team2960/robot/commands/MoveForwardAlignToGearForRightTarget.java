package org.usfirst.frc.team2960.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoveForwardAlignToGearForRightTarget extends CommandGroup {
	public MoveForwardAlignToGearForRightTarget(){
		addSequential(new MoveForward(-75));
		addSequential(new TurnDegree(.75, -60));
		addSequential(new AlignToGear());
		addSequential(new Delay(20));
		addSequential(new MoveForward(-30));
		addSequential(new AlignToGear());
		addSequential(new Delay(20));
		addSequential(new MoveForwardOrHitButton(-35));
		addSequential(new MoveForward(20));
		}
}
