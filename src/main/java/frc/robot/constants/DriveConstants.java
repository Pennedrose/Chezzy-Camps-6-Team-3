package frc.robot.constants;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;
import frc.robot.subsystems.Drivetrain;

public class DriveConstants {

  public final int kLeftMotor1 = 16;

  public final int kLeftMotor2 = -1;
  public final int kRightMotor1 = 15;
  public final int kRightMotor2 = -1;

  
  public double kLP = 38.587;
  public double kLI = 0.0;
  public double kLD = 2.1058;
  public double vkLP = 0.79667;
  public double vkLI = 0.0;
  public double vkLD = 0.0;
  public double kRP = 32.46;
  public double kRI = 0.0;
  public double kRD = 1.327;
  public double vkRP = 0.75728;
  public double vkRI = 0.0;
  public double vkRD = 0.0;

  public final double ConversionDistanceMeters = Units.inchesToMeters(2) *2*Math.PI*2048*12/62;
  public final double ksVolts = 0.65876;
  public final double kvVoltSecondsPerMeter = 0.8394;
  public final double kaVoltSecondsSquaredPerMeter = 0.042781;
  
  public final double kPDriveVel = 0;

}
 