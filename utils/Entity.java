/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author austen
 */
public class Entity implements Comparable{
    private String name;
    private int initiative;
    
    public Entity(String name, int initiative)
    {
        this.name = name;
        this.initiative = initiative;
    }
    
    public int getInit()
    {
        return this.initiative;
    }
    
    public String getName()
    {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Entity))
        {
            throw new IllegalArgumentException("Comparing to non-entity class");
        }
        return this.initiative - ((Entity)o).getInit();
    }

}
