package com.mycompany.project1;

import java.util.ArrayList;

class Player{
    public String PlayerName;
    Player(String PlayerName){
        this.PlayerName=PlayerName;
    }

    String getPlayerName(){
        return PlayerName;
    }
}

class Team{
    String TeamName;
    ArrayList<Player> players;

    Team(String TeamName){
        this.TeamName = TeamName;
        players = new ArrayList<>();
    }

    void addPlayer(Player player){
        players.add(player);
    }

    String getTeamName(){
        return TeamName;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }
}

class Tournament{
    String TournamentName;
    ArrayList<Team> teams;

    Tournament(String TournamentName){
        this.TournamentName=TournamentName;
        teams=new ArrayList<>();
    }

    void addTeam(Team team){
        teams.add(team);
    }

    String getTournamentName(){
        return TournamentName;
    }

    ArrayList<Team> getTeams(){
        return teams;
    }
}

class Event{
    String EventName;
    ArrayList<Tournament> tournaments;

    Event(String EventName){
        this.EventName=EventName;
        tournaments = new ArrayList<>();
    }

    void addTournament(Tournament tournament){
        tournaments.add(tournament);
    }

    Tournament tournament;
    public void displayEvent(){
        System.out.println("Event: " + EventName);
        for(Tournament tournament : tournaments){
            System.out.println("Tournament: " + tournament.getTournamentName());
            for(Team team : tournament.getTeams()){
                System.out.println("Team--" + team.getTeamName());
                for(Player player : team.getPlayers()){
                    System.out.println("--" + player.getPlayerName());
                }
            }
            System.out.println();
        }
    }
}
public class tour{
    public static void main(String[] args) {
        Player player1 = new Player("Anirudh");
        Player player2 = new Player("Ankit");
        Player player3 = new Player("Modi");
        Player player4 = new Player("Amit");

        Team team1 = new Team("Mumbai");
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        Team team2 = new Team("Chennai");
        team2.addPlayer(player3);
        team2.addPlayer(player4);

        Tournament tournament1 = new Tournament("IPL");
        tournament1.addTeam(team1);

        Tournament tournament2 = new Tournament("BJP");
        tournament2.addTeam(team2);

        Event event1 = new Event("India");
        event1.addTournament(tournament1);
        event1.addTournament(tournament2);

        event1.displayEvent();
    }

}
