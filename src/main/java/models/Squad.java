package models;

import java.util.ArrayList;
import java.util.Collection;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private int squadId;
    private static ArrayList<Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();
    public Squad (String name, int size, String cause){
        this.name = name;
        this.size = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();

    }

    public static Squad setUpNewSquad(String name, int size, String cause) {
        return new Squad("lions",5,"fueling");
    }

    public static Squad findBySquadId(int id) {
       return instances.get(id-1);
    }

    public static ArrayList<Squad> getAll() {
        return instances;
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
    public ArrayList<Squad> clearAllSquads() {
        return instances;
    }
    public ArrayList<Squad> clearAllSquadMembers() {
        return instances;
    }
}
