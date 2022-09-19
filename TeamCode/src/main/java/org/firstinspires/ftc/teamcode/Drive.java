package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Drive Test Control", group = "CargoBot")
public class Drive extends LinearOpMode {

    PowerJeff robot = new PowerJeff();

    public void runOpMode(){

        telemetry.addData("Status","Initialized");
        telemetry.update();
        robot.initialize(hardwareMap);

        boolean precisionMode = false;
        telemetry.addData("opModeIsActive",opModeIsActive());
        telemetry.update();
        waitForStart();
        while(opModeIsActive()){

            double r = Math.hypot(gamepad1.left_stick_x,-gamepad1.left_stick_y);
            double robotAngle = Math.atan2(-gamepad1.left_stick_y,gamepad1.left_stick_x) - Math.PI / 4;
            double rightX = gamepad1.right_stick_x;
            final double v1 = r * Math.cos(robotAngle) + rightX;
            final double v2 = r * Math.sin(robotAngle) - rightX;
            final double v3 = r * Math.sin(robotAngle) + rightX;
            final double v4 = r * Math.cos(robotAngle) - rightX;

            if(precisionMode) {
                robot.frontLeftWheel.setPower(v1/4);
                robot.frontRightWheel.setPower(v2/4);
                robot.backLeftWheel.setPower(v3/4);
                robot.backRightWheel.setPower(v4/4);
            } else {
                robot.frontLeftWheel.setPower(v1);
                robot.frontRightWheel.setPower(v2);
                robot.backLeftWheel.setPower(v3);
                robot.backRightWheel.setPower(v4);
            }

        }

    }

}