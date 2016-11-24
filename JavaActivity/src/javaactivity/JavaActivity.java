/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity;

import java.util.Scanner;
/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("This program uses Polymorphism, Inheritance and Interfaces");
        
        System.out.println("This program recieves your score from various class activities.");
        GradedActivity lab = getLabGrade();
        PassFailExam score = setPassFailScore();
        Essay essay = setEssayScore();
        FinalExam finalExam = setFinalExamScore();
        
        CourseGrades grade = new CourseGrades(lab, score, essay, finalExam);
        System.out.println(grade);
        
        System.out.println("The average score is " + grade.getAverage());
        GradedActivity lowest = grade.getLowest();
        System.out.println("The lowest score is " + lowest.getScore());
        GradedActivity highest = grade.getHighest();
        System.out.println("The highest score is " + highest.getScore());
    }
    
    public static GradedActivity getLabGrade(){
        GradedActivity lab = new GradedActivity();
        System.out.println("\nLab:");
        System.out.println("What is the students lab score?");
        Scanner keyboard = new Scanner(System.in);
        double score = keyboard.nextDouble();
        lab.setScore(score);
        
        return lab;
    }
    
    public static PassFailExam setPassFailScore(){
        int quest = 10;
        double min = 70;
        int missed; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nExam P/F:");
        System.out.println("How many questions did you missed? 0-10");
        missed = keyboard.nextInt();
        
        return new PassFailExam(quest, missed, min);
    }
    
    public static Essay setEssayScore(){
        double gram, spell, len, cont;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEssay Score:");
        System.out.println("How much points did the student get on grammar? 0-30");
        gram = keyboard.nextDouble();
        System.out.println("How much points did the student get on spelling? 0-20");
        spell = keyboard.nextDouble();
        System.out.println("How much points did the student get on length? 0-20");
        len = keyboard.nextDouble();
        System.out.println("How much points did the student get on content? 0-30");
        cont = keyboard.nextDouble();
        
        return new Essay(gram, spell, len, cont);
    }
    
    public static FinalExam setFinalExamScore(){
        int num = 50;
        int missed; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nFinal Exam:");
        System.out.println("How many questions did you missed? 0-10");
        missed = keyboard.nextInt();
        
        return new FinalExam(num, missed);
    }
}
