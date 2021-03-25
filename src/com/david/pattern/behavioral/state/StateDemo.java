package com.david.pattern.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        MarioStateMachine stateMachine = new MarioStateMachine();
        printMachine(stateMachine);
        stateMachine.obtainMushRoom();
        printMachine(stateMachine);
        stateMachine.obtainCape();
        printMachine(stateMachine);
        stateMachine.obtainFireFlower();
        printMachine(stateMachine);
        stateMachine.meetMonster();
        printMachine(stateMachine);
    }

    private static void printMachine(MarioStateMachine stateMachine) {
        System.out.println(stateMachine.getCurrentState().getState() + " " + stateMachine.getScore());
    }
}
