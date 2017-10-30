package rooms;

import people.Person;
import items.Item;

import java.util.Arrays;

public abstract class Room {

    private boolean[] doors;
    private Person[] npc;
    private Item[] items;
    public boolean explored;
    private int x, y, k;

    public Room(boolean[] doors, Person[] npc, Item[] items, int x, int y, int k)
    {
    	this.x = x;
    	this.y = y;
    	this.k = k;
        this.doors = doors;
        this.npc = npc;
        this.items = items;
        this.explored = false;
    }
    public  Person[] getNpc() {
        return npc;
    }
    public void setNpc(Person[] npc) {
        this.npc = npc;
    }
    public void addNpc(Person p)
    {
        this.npc = Arrays.copyOf(this.npc,this.npc.length+1);
        this.npc[this.npc.length-1] = p;
    }
    //need to add a remove npc function
    public boolean[] getDoors()
    {
    	return doors;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    public Item[] getItems()
    {
    	return items;
    }
    public void isExplored()
    {
    	this.explored = true;
    }
    public abstract void print(int k2, int j, int i);
}
