package com.david.pattern.behavioral.state;

public class FireMario extends AbstractMario {
    public FireMario(MarioStateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public State getState() {
        return State.FIRE;
    }

    @Override
    public void meetMonster() {
        stateMachine.minusScore(300);
        stateMachine.setCurrentState(new SmallMario(stateMachine));
    }
}
