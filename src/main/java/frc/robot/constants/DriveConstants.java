package frc.robot.constants;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;
import frc.robot.subsystems.Drivetrain;


  public final int kLeftMotor1 = 16;

  public final int kLeftMotor2 = -1;
  public final int kRightMotor1 = 15;
  public final int kRightMotor2 = -1;

  
  public double kP = 0.1;
  public double kI = 0.0;
  public double kD = 0.0;

  public final double ConversionDistanceMeters = Units.inchesToMeters(2) *2*Math.PI*2048*12/62;
  public final double ksVolts = 12;
  public final double kvVoltSecondsPerMeter = 0;
  public final double kaVoltSecondsSquaredPerMeter = 0;
  public final double kPDriveVel = 0;

}
 