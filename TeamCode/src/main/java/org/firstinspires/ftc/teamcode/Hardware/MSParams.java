package org.firstinspires.ftc.teamcode.Hardware;

public class MSParams {
    /*
     * Constants
     */
    public final double DRIVE_TICKS_PER_INCH = 24;
    public final double STRAFE_FACTOR = 0.9;

    public final double ALIGN_ARM_GOLD = 0.45;
    public final double ALIGN_ARM_DOWN = 0.56;
    public final double ALIGN_ARM_MOVE = 0.2;
    public final double ALIGN_ARM_SCORE = 0.87;
    public final double ALIGN_ARM_HIGH = 0.0;

    //extend
    public final double ExtendRight_IN = 0.55;
    public final double Extend_IN = 0.45;
    public final double ExtendRight_CATCH = 0.5;
    public final double Extend_Catch = 0.5;
    public final double ExtendRight_OUT = 0.15;
    public final double Extend_OUT = 0.85;
    public final double ExtendRight_Climbo = 0.23;//20
    public final double Extend_Climbo = 0.77;
    public final double ExtendRight_Climbi = 0.29;//20
    public final double Extend_Climbi = 0.71;
    //bar
    public final double Bar_Up = 0.5;//22
    public final double Bar_Down =0.375;
    public final double Bar_Middle = 0.16;
    public final double Bar_Auto = .45;//3
    public final double Bar_Climb = 0.57;
    public final double Bar_Sweep = .35;


    //buckets
    public final double Bucket_Down = 0.1;
    public final double Bucket_Catch = 0.1;
    public final double Bucket_Dump = 0.80; //0.70

    //LIFT postions
    public final int LIFT_RESET = 20;
    public final int LIFT_MIN_LOW = 0;
    public final int LIFT_CLIP_HIGH = 1420;
    public final int LIFT_CLIP_SCORE = 1065;
    public final int LIFT_CLIP_LOW = 1050;
    public final int LIFT_MAX_HIGH = 2450;
    public final double LIFT_POWER = 0.5;
    public final int LIFT_Top_B = 1970 ;
    public final int LIFT_Bottom_B = 401;

    public final int LIFT_Auto_Park =1000;

    //wrist camands
    public final double Wrist_Up = .98;
    public final double Wrist_Release = 0.4;
    public final double Wrist_Down = 0.1;
    public final double Wrist_Auto = 0.5; //45
    public final double Wrist_Box = 0.68; //45
    public final double Wrist_Climb = .65;
    public final double Wrist_Sweep = .1;
//Claw camands
    public final double CLAW_OPEN = 0.33; //.65
    public final double CLAW_CLOSE = 0.65; //.33

    //twist camands
    public final double TWIST_HORIZONTAL = 0.3;
    public final double TWIST_VERTICAL = 0;

    //Specimen claw
    public final double SPICE_OPEN = 0.3;
    public final double SPICE_CLOSE = .57;

    //Level 1 Flag
    public final double FLAG_DOWN = 0.2;
    public final double FLAG_UP = .59;
}
