package com.alle.san.tennismarchy.models;

public class MatchModel {
    private SetModel setOne,
                     setTwo,
                     setThree,
                     setFour,
                     setFive;

    public MatchModel(SetModel setOne) {
        this.setOne = setOne;
    }

    public MatchModel(SetModel setOne, SetModel setTwo) {
        this.setOne = setOne;
        this.setTwo = setTwo;
    }

    public MatchModel(SetModel setOne, SetModel setTwo, SetModel setThree) {
        this.setOne = setOne;
        this.setTwo = setTwo;
        this.setThree = setThree;
    }

    public MatchModel(SetModel setOne, SetModel setTwo, SetModel setThree, SetModel setFour) {
        this.setOne = setOne;
        this.setTwo = setTwo;
        this.setThree = setThree;
        this.setFour = setFour;
    }

    public MatchModel(SetModel setOne, SetModel setTwo, SetModel setThree, SetModel setFour, SetModel setFive) {
        this.setOne = setOne;
        this.setTwo = setTwo;
        this.setThree = setThree;
        this.setFour = setFour;
        this.setFive = setFive;
    }

    public SetModel getSetOne() {
        return setOne;
    }

    public void setSetOne(SetModel setOne) {
        this.setOne = setOne;
    }

    public SetModel getSetTwo() {
        return setTwo;
    }

    public void setSetTwo(SetModel setTwo) {
        this.setTwo = setTwo;
    }

    public SetModel getSetThree() {
        return setThree;
    }

    public void setSetThree(SetModel setThree) {
        this.setThree = setThree;
    }

    public SetModel getSetFour() {
        return setFour;
    }

    public void setSetFour(SetModel setFour) {
        this.setFour = setFour;
    }

    public SetModel getSetFive() {
        return setFive;
    }

    public void setSetFive(SetModel setFive) {
        this.setFive = setFive;
    }
}
