package service;

import model.obstacle.Obstacle;
import model.obstacle.Racetrack;
import model.obstacle.Wall;
import model.participant.Participant;

public class JumpService implements Jump{

    public void jumpCheck(Obstacle obstacle, Participant participant, int height) {
        if (obstacle instanceof Wall) {
            pleaseJump(participant, height);
        }
        else if (obstacle instanceof Racetrack) {
            System.out.println("Can't Jump over the Racetrack");
        }
    }

    @Override
    public boolean pleaseJump(Participant participant, int height) {
        if (participant.abilityJump > height) {
            System.out.println(participant.name + " desires to Jump " + height);
            return participant.flagR = true;
        } else {
            System.out.println(participant.name + " can't Jump " + height);
            System.out.println("Action interrupted");
            return participant.flagJ = false;
        }
    }
}
