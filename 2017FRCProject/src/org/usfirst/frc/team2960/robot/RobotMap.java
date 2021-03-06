package org.usfirst.frc.team2960.robot;

public class RobotMap {
	//motors
	public static int rt1 = 0;
	public static int rt2 = 1; 
	public static int rt3 = 2; 
	public static int lt1 = 3; 
	public static int lt2 = 4; 
	public static int lt3 = 5; 
	public static int shooter = 6;//should be 6
	public static int winch = 7;
	public static int intake = 8;
	public static int winch2 = 9;
	public static int agitator2 = 7;
	public static int agitator = 8;
	//Relay
	public static int ringLight = 0;
	//solenoids
	public static int shift = 0;
	public static int shift2 = 1;
	public static int gearPusher = 2;
	public static int gearPusher2 =  3;
	public static int flap = 4;
 	public static int flap2 = 5;
	//pid
 	//for non omni
	//public static double p1 = 0.0035;
	//public static double i1 = 0.0001;
	//public static double d1 = 0.002;
	
 	public static double p1 = 0.005;
 	public static double i1 = 0.00012;
 	public static double d1 = 0.004;
 	//55
	public static double p2 = .000007;//65
	public static double i2 = .0001;
	public static double d2 = .0000377;//375
	//4
	
	
	public static double p3 = 0.000017;
	public static double i3 = 0.0002;
	public static double d3 = 0;
	//analog
	public static int Gyro = 0;
	//Gear Pusher Timer
	public static int gearPushTime = 2;
	
	
	
	//DIO
	public static int GearSensor = 0;
	public static int GearPushButton = 1;
	//public static int ShooterPhotoeye = 2;
	
}
