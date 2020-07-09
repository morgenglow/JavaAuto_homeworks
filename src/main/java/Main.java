public class Main {

    public static void main(String[] args) {
//      Robot rob = new Robot("Rob", 10, 9);
//      Human fil = new Human("Fil", 5, 5);
//      Cat john = new Cat("John", 20, 30);

      Wall[] walls = new Wall[5];
        for (int i=0; i<walls.length; i++) {
            int a = (int) ( Math.random() * 30 );
            walls[i]= new Wall(a);
        }

      Racetrack[] racetracks = new Racetrack[5];
        for (int i=0; i<racetracks.length; i++ ) {
            int a = (int) ( Math.random() * 40 );
            racetracks[i]= new Racetrack(a);
        }

      Human [] humans = new Human[5];
        for (int i=0; i<humans.length; i++ ) {
            int a = (int) ( Math.random() * 10 );
            int b = (int) ( Math.random() * 10 );
            humans [i]= new Human ("Человек"+i, a, b);
        }

      for (int i=0; i<humans.length; i++ )
          for (int j=0; j<racetracks.length; j++ ) {
              humans[i].pleaseRun(racetracks[j].length);
              if (humans[i].flagR==false) i++;
          }

      for (int i=0; i<humans.length; i++ )
            for (int j=0; j<walls.length; j++ ) {
                humans[i].pleaseJump(walls[j].height);
                if (humans[i].flagJ==false) i++;
            }


//      rob.pleaseJump(wall.height);
//      rob.pleaseRun(racetrack.length);
//      fil.pleaseJump(wall.height);
//      fil.pleaseRun(racetrack.length);
//      john.pleaseJump(wall.height);
//      john.pleaseRun(racetrack.length);
    }
}
