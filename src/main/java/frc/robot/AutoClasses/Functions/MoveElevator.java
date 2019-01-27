package frc.robot.AutoClasses.Functions;

import frc.robot.AutoClasses.Setup.RobotFunction;
import frc.robot.Subsystems.Elevator;

public class MoveElevator extends RobotFunction {

    private int position;

    /**
     * Initializes all needed variables
     */
    public MoveElevator() {
        position = 0;
    }

    /**
     * Stores the desired position of the elevator
     */
    @Override
    public void collectInputs(int pos) {
        position = pos;
    }

    /**
     * Sets the elevator to the desired set position
     */
    @Override
    public void run() {
        Elevator.setPosition(position);
    }

    /**
     * @return: is the elevator finished moving?
     */
    @Override
    public boolean finished() {
        return Elevator.elevatorDoneMoving();
    }

    /**
     * Stops the elevator
     */
    @Override
    public void stop() {
        Elevator.stop();
    }
}