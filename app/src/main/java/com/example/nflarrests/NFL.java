package com.example.nflarrests;

public class NFL {
    private String Crime;
    private String Player;
    private String Team;
    private String Position;

    public NFL(String crime, String player, String team, String position) {
        Crime = crime;
        Player = player;
        Team = team;
        Position = position;
    }

    public String getCrime() {
        return Crime;
    }

    public void setCrime(String crime) {
        Crime = crime;
    }

    public String getPlayer() {
        return Player;
    }

    public void setPlayer(String player) {
        Player = player;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "NFL{" +
                "Crime='" + Crime + '\'' +
                ", Player='" + Player + '\'' +
                ", Team='" + Team + '\'' +
                ", Position='" + Position + '\'' +
                '}';
    }
}
