package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class PowerJeff {

    public DcMotor frontLeftWheel;
    public DcMotor frontRightWheel;
    public DcMotor backLeftWheel;
    public DcMotor backRightWheel;

    public PowerJeff(){
    }

    HardwareMap hwMap;

    public void initialize(HardwareMap tHwMap) {

        hwMap = tHwMap;
        frontLeftWheel = hwMap.get(DcMotor.class, "frontLeftWheel");
        frontRightWheel = hwMap.get(DcMotor.class, "frontRightWheel");
        backLeftWheel = hwMap.get(DcMotor.class, "backLeftWheel");
        backRightWheel = hwMap.get(DcMotor.class, "backRightWheel");

        frontLeftWheel.setDirection(DcMotor.Direction.REVERSE);
        frontRightWheel.setDirection(DcMotor.Direction.FORWARD);
        backLeftWheel.setDirection(DcMotor.Direction.REVERSE);
        backRightWheel.setDirection(DcMotor.Direction.FORWARD);

        frontLeftWheel.setPower(0);
        frontRightWheel.setPower(0);
        backLeftWheel.setPower(0);
        backRightWheel.setPower(0);

    }


}
