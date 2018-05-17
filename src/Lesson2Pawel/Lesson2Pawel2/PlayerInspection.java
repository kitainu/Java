package Lesson2Pawel.Lesson2Pawel2;

public class PlayerInspection {
    public static void main(String[] args) {
        FootBallPlayer footBallPlayer = new FootBallPlayer("Ronaldo", 21, "GoalKeeper", "FC Barcelona");
        footBallPlayer.getName();
        //footBallPlayer.setCurrentTeam();
        System.out.println(footBallPlayer.getName());
        footBallPlayer.getAge();
        System.out.println(footBallPlayer.getAge());
        footBallPlayer.methodRun();
        footBallPlayer.methodShoot();
        footBallPlayer.methodPassBall();
        footBallPlayer.methodFakeInjury();
        footBallPlayer.setCurrentTeam("WKS");
        System.out.println(footBallPlayer.getCurrentTeam());
        footBallPlayer.setPositionOnTheField("Seeker");
        System.out.println(footBallPlayer.getPositionOnTheField());




    }
}
