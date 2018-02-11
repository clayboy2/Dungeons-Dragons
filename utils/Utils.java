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
public class Utils {
    
    public class Dice
    {
        private int max;
        private int modifier;
        
        public Dice(int max, int modifier)
        {
            this.max = max;
            this.modifier = modifier;
        }
        
        public int makeRoll()
        {
            return (int) (Math.random()*max)+1+modifier;
        }
    }
}
