package com.romanovych;

import org.apache.log4j.Logger;

public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        Hobby obj1 = new Hobby();
        Hobby obj2 = new Hobby("психология");
        Hobby obj3 = new Hobby("psychology",2);

        obj1.setName("психология");
        obj1.setHours(2);
        obj2.setHours(3);

        System.out.println("Мое хобби - " + obj1.getName() + ", на которое я выделяю " + obj1.getHours() + " часа(ов) в неделю.");
        System.out.println(obj2.toString());
        System.out.println(obj3.tellAboutHobby());

        logger.info("obj1: " + obj1.getName());
        logger.error("obj1: " + obj1.getName());
        logger.debug("obj1: " + obj1.getName());
    }
}
