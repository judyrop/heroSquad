package models;

import java.util.ArrayList;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private static ArrayList<Hero>  squadMembers = new ArrayList<>();
    public Squad (String name, int size, String cause){
        this.name = name;
        this.size = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
    }

    public static Squad setUpNewSquad(String lions, int i, String s) {
        return new Squad("lions",5,"fueling");
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

    public String getCause() {
        return cause;
    }

    public ArrayList<Hero> getSquadMembers() {
        return squadMembers;
    }
    public void setSquadMembers(Hero newHero) {
        squadMembers.add(newHero);
    }
    
}
