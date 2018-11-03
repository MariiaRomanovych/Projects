package com.romanovych;

public class Hobby1 extends Hobby {

    private String place;
    private int time;

    public Hobby1(String name, int hours, String place, int time) {
        super(name, hours);
        this.place = place;
        this.time = time;
    }

    public Hobby1(String name, String place) {
        super(name);
        this.place = place;
    }

    @Override
    public String tellAboutHobby() {
        return "My hobby is " + super.getName() + ". I spend " + super.getHours() +
                " hours a week on the hobby. Meeting in a " + place + " after " + time + " hours.";
    }
}
