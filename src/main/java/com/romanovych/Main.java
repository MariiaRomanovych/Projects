package com.romanovych;

public class Main {

    public static void main(String[] args) {

        Hobby1 obj1 = new Hobby1("psychology", 2, "cafe1", 6);
        Hobby2 obj2 = new Hobby2("psychology1", 3, "cafe2", 5);

        Hobby [] mas = new Hobby [2];

        mas [0] = obj1;
        mas [1] = obj2;

        for(Hobby i : mas) System.out.println(i.tellAboutHobby());
    }
}
