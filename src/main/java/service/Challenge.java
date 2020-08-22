package service;

import model.obstacle.Obstacle;
import model.obstacle.Racetrack;
import model.obstacle.Wall;
import model.participant.Participant;

public class Challenge {

//    private List<Participant> participants;
//    private List<Obstacle> obstacles;
    JumpService jumpService = new JumpService();
    RunService runService = new RunService();

    public boolean check(Obstacle obstacle, Participant participant) {
        if (obstacle instanceof Wall) {
            jumpService.jumpCheck(obstacle, participant, obstacle.height);
            return participant.flagR;
        }
        else if (obstacle instanceof Racetrack) {
            runService.runCheck(obstacle, participant, obstacle.length);
            return participant.flagJ;
        }
        return false;
    }
}
