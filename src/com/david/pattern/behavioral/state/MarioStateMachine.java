package com.david.pattern.behavioral.state;

/**
 * 马里奥状态机~~~
 */
public class MarioStateMachine implements IMario {
    private int score;
    private AbstractMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    @Override
    public void obtainMushRoom() {
        currentState.obtainMushRoom();
    }

    @Override
    public void obtainCape() {
        currentState.obtainCape();
    }

    @Override
    public void obtainFireFlower() {
        currentState.obtainFireFlower();
    }

    @Override
    public void meetMonster() {
        currentState.meetMonster();
    }

    public int getScore() {
        return score;
    }

    public void plusScore(int delta) {
        this.score = this.getScore() + delta;
    }

    public void minusScore(int delta) {
        this.score = this.getScore() - delta;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public AbstractMario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractMario currentState) {
        this.currentState = currentState;
    }
}
