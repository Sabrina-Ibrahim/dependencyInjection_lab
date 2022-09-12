package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon lightsaber = new Lightsaber();
        Sword sword = new Sword();
        Attacker robot_one = new Robot(lightsaber);
        //System.out.println(robot_one.name);
        robot_one.Attack();

        Attacker wolf_one = new Werewolf("Hairy", 35);

    wolf_one.Attack();
    }
}