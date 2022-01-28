// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class NEO {
        // TODO
    }

    public static final double CURVATURE_TURN_SENS = 1.0;
    public static final double TRACK_WIDTH = Units.inchesToMeters(21.0);
    public static final double WHEEL_RADIUS = Units.inchesToMeters(3.0);
    public static final int ENCODER_RESOLUTION = 512;
    public static final double MAX_VELOCITY = Units.feetToMeters(12.98);
    public static final double MAX_ACCELERATION = 2.0; // TODO: this is an estimate. get the actual one once the robot is complete.
    public static final double DRIVE_MAX_VOLTAGE = 10.0; // ten's a good number, right?
}
