package com.david.pattern.behavioral.state;

public class SupperMario extends AbstractMario {
    public SupperMario(MarioStateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public State getState() {
        return State.SUPER;
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

    @Override
    public void meetMonster() {
        stateMachine.minusScore(100);
        stateMachine.setCurrentState(new SmallMario(stateMachine));
    }
}
