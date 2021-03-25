package com.david.pattern.behavioral.state;

public abstract class AbstractMario implements IMario {
    protected MarioStateMachine stateMachine;

    public AbstractMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public abstract State getState();

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
