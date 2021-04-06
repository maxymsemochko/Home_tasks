package com.softserve.tasks;

public class Main {

    public static void main(String[] args) {

        NonFlyingBird chicken = new NonFlyingBird();
        chicken.setName("Chicken");
        chicken.setFeathers(true);
        chicken.setLayEggs(true);

        NonFlyingBird penguin = new NonFlyingBird();
        penguin.setName("Penguin");
        penguin.setFeathers(false);
        penguin.setLayEggs(true);

        FlyingBird eagle = new FlyingBird();
        eagle.setName("Eagle");
        eagle.setFeathers(true);
        eagle.setLayEggs(true);

        FlyingBird swallow = new FlyingBird();
        swallow.setName("Swallow");
        swallow.setFeathers(true);
        swallow.setLayEggs(true);


        Bird[] birds=new Bird[4];

        birds[0]=chicken;
        birds[1]=penguin;
        birds[2]=swallow;
        birds[3]=eagle;

        for (int i = 0; i < birds.length; i++) {

            if (birds[i].isFeathers())
            {
                System.out.println("I'm "+birds[i].getName()+" and i have feathers");
            }
            else
            {
                System.out.println("I'm "+birds[i].getName()+" and i don't have feathers");
            }
            birds[i].fly();
            System.out.println();
        }





    }
}
