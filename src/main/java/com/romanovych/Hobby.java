package com.romanovych;

public abstract class Hobby {

    private String name;
    private int hours;

    private byte hoursWeek;
    private short hoursMonth;
    private char hoursYear;
    private long secondsYear;
    private float daysYear;
    private double weeksYear;
    private boolean week;

    public Hobby(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public Hobby() {

    }

    public Hobby(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }

    public abstract String tellAboutHobby();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(byte hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public short getHoursMonth() {
        return hoursMonth;
    }

    public void setHoursMonth(short hoursMonth) {
        this.hoursMonth = hoursMonth;
    }

    public char getHoursYear() {
        return hoursYear;
    }

    public void setHoursYear(char hoursYear) {
        this.hoursYear = hoursYear;
    }

    public float getDaysYear() {
        return daysYear;
    }

    public void setDaysYear(float daysYear) {
        this.daysYear = daysYear;
    }

    public double getWeeksYear() {
        return weeksYear;
    }

    public void setWeeksYear(double weeksYear) {
        this.weeksYear = weeksYear;
    }

    public boolean isWeek() {
        return week;
    }

    public void setWeek(boolean week) {
        this.week = week;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getSecondsYear() {
        return secondsYear;
    }

    public void setSecondsYear(long secondsYear) {
        this.secondsYear = secondsYear;
    }
}
