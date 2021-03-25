package com.david.pattern.behavioral.state;

public class SmallMario extends AbstractMario {
    public SmallMario(MarioStateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public State getState() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.plusScore(100);
        stateMachine.setCurrentState(new SupperMario(stateMachine));
    }

    @Override
    public void obtainCape() {
        stateMachine.plusScore(200);
        stateMachine.setCurrentState(new CapeMario(stateMachine));
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.plusScore(300);
        stateMachine.setCurrentState(new FireMario(stateMachine));
    }

}
