package com.david.pattern.behavioral.state;

public class CapeMario extends AbstractMario {
    public CapeMario(MarioStateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public State getState() {
        return State.CAPE;
    }


    @Override
    public void meetMonster() {
        stateMachine.minusScore(200);
        stateMachine.setCurrentState(new SmallMario(stateMachine));
    }
}
