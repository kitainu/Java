package Lesson2Pawel.Lesson2Pawel2;

public class FootBallPlayer {
    private String name;
    private int age;
    private String positionOnTheField;
    private String currentTeam;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public String getPositionOnTheField() {
        return positionOnTheField;
    }


    public void setPositionOnTheField(String positionOnTheField) {
        this.positionOnTheField = positionOnTheField;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public void methodRun() {
        System.out.println("Lubię sobie pobiegać");
    }

    public void methodPassBall() {
        System.out.println("Dałeś ciała");
    }

    public void methodShoot() {
        System.out.println("im więcej tym lepiej");
    }

    public void methodFakeInjury() {
        System.out.println("Ałłłaaaaaa!!!!!!");
    }

    public FootBallPlayer(String name, int age, String positionOnTheField, String currentTeam) {
        this.name = name;
        this.age = age;
        this.positionOnTheField = positionOnTheField;
        this.currentTeam = currentTeam;
    }
}
