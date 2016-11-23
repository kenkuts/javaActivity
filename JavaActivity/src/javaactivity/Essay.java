/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class Essay extends GradedActivity{
    
    private double grammar;
    private double spelling;
    private double length;
    private double content;
    
    public Essay(double gram, double spell, double len, double cont){
        this.grammar = gram;
        this.spelling = spell;
        this.length = len;
        this.content = cont;
        
        double grade = grammar + spelling + length + content;
        setScore(grade);
    }
    
    @Override
    public char getGrade(){
        
        return super.getGrade();
    }
}
