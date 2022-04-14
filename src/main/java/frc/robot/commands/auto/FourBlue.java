// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.commands.arm.ArmDown;
import frc.robot.commands.arm.ArmUp;
import frc.robot.commands.drive.DriveAuto;
import frc.robot.commands.drive.DriveAutoJank;
import frc.robot.commands.drive.TurnAutoJank;
import frc.robot.commands.drive.TurnAutoCreative;
import frc.robot.commands.intake.AdmitCargo;
import frc.robot.commands.intake.EjectCargo;
import frc.robot.commands.intake.StopIntake;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;

public class FourBlue extends SequentialCommandGroup {
  public FourBlue(Drivetrain drivetrain, Arm arm, Intake intake) {
    super(
      new AdmitCargo(intake),
      new ArmDown(arm),

      new DriveAuto(drivetrain, +36.0),
      new StopIntake(intake),

      new ArmUp(arm).alongWith(new AdmitCargo(intake)),

      new DriveAuto(drivetrain, -62.0),
      new StopIntake(intake),
      new TurnAutoJank(drivetrain, +162.0),

      new EjectCargo(intake),
      new WaitCommand(0.5),
      new StopIntake(intake),

      new TurnAutoJank(drivetrain, +284.5),

      new ArmUp(arm),
      new WaitUntilCommand(arm::isDown),
      new EjectCargo(intake),

      new WaitCommand(0.1),

      new DriveAutoJank(drivetrain, +178.0, 0.20, true)
        .alongWith(
          new WaitUntilCommand(() -> drivetrain.getEncPosition() >= +120.0)
            .andThen(new AdmitCargo(intake))),

      new WaitCommand(1.0),

      new StopIntake(intake),

      new DriveAutoJank(drivetrain, -155.0),

      new WaitCommand(1.0),

      new TurnAutoCreative(drivetrain, +155.0),

      new ArmDown(arm),
      new DriveAuto(drivetrain, +40.0, true),
      new EjectCargo(intake),
      new WaitCommand(1.0),
      new StopIntake(intake)
    );
  }
}
