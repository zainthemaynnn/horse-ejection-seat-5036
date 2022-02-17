package frc.robot;

public class RobotMap {
    public static enum DIO {
        LEFT_ENCODER_IN         (0),
        LEFT_ENCODER_OUT        (1),
        RIGHT_ENCODER_IN        (3),
        RIGHT_ENCODER_OUT       (2),
        ARM_BOTTOM_LIMIT_SWITCH (4);

        private final int port;

        private DIO(int port) {
            this.port = port;
        }

        public int port() {
            return port;
        }
    }

    public static enum PWM {
        BLINKIN (9);

        private final int port;

        private PWM(int port) {
            this.port = port;
        }

        public int port() {
            return port;
        }
    }

    public static enum CAN {
        // placeholders
        BACK_MOTOR_LEFT     (1),
        BACK_MOTOR_RIGHT    (3),
        FRONT_MOTOR_LEFT    (2),
        FRONT_MOTOR_RIGHT   (4),
        INTAKE_TOP          (7),
        INTAKE_BOTTOM       (6),
        ARM                 (5);

        private final int id;

        private CAN(int id) {
            this.id = id;
        }

        public int id() {
            return id;
        }
    }

    public static enum Gamepad {
        DRIVER  (1);

        private final int port;

        private Gamepad(int port) {
            this.port = port;
        }

        public int port() {
            return port;
        }
    }
}
