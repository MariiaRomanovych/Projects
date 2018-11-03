package com.romanovych;

public class Hobby2 extends Hobby {

    private String place1;
    private int time1;

    public Hobby2(String name, int hours, String place1, int time1) {
        super(name, hours);
        this.place1 = place1;
        this.time1 = time1;
    }

    @Override
    public String tellAboutHobby() {
        return "My hobby is " + super.getName() + ". I spend " + super.getHours() +
                " hours a week on the hobby. Meeting in a " + place1 + " after " + time1 + " hours.";
    }
}
