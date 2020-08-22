package service;

import model.obstacle.Obstacle;
import model.obstacle.Racetrack;
import model.obstacle.Wall;
import model.participant.Participant;

public class RunService implements Run{

    public void runCheck(Obstacle obstacle, Participant participant, int length) {
        if (obstacle instanceof Racetrack) {
        pleaseRun(participant, length);
        }
        else if (obstacle instanceof Wall) {
        System.out.println("Can't Run into the Wall");
        }
        }

    @Override
    public boolean pleaseRun (Participant participant, int length) {
            if (participant.abilityRun > length) {
                System.out.println(participant.name + " will Run " + length);
                return participant.flagR = true;
            } else {
                System.out.println(participant.name + " can't Run" + length);
                System.out.println("Action interrupted");
                return participant.flagR = false;
            }
        }
    }
