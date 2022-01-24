

public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SuccerPlayer beckham=new SuccerPlayer("Beckham");

//        Team liverpool=new Team("Liverpool");
        Team<SuccerPlayer> liverpool=new Team<>("Liverpool");

//        Team<String> brokenTeam=new Team<>("this wont work");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);
        System.out.println(liverpool.numPlayer());

    }
}
