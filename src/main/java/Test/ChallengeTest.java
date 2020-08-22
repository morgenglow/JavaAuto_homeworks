package Test;

import model.obstacle.Obstacle;
import model.obstacle.Racetrack;
import model.obstacle.Wall;
import model.participant.Cat;
import model.participant.Participant;
import org.junit.Assert;
import org.junit.Test;
import service.Challenge;

import static org.junit.Assert.*;

public class ChallengeTest {
@Test
    public void getName()
    {
        Participant boris = new Cat(8, 40, "Boris");
        Obstacle wall = new Wall(4);
        Obstacle race = new Racetrack(100);
        Challenge challenge = new Challenge();
        boolean check = challenge.check(wall, boris);
        Assert.assertTrue(check);
    }
}