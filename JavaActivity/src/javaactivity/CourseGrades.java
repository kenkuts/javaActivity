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
public class CourseGrades implements Analyzable {

        private GradedActivity labScore;
        private PassFailExam passFailScore;
        private Essay essayScore;
        private FinalExam finalScore;
        private GradedActivity[] grades = {labScore, passFailScore, essayScore, finalScore};
        
        public CourseGrades(GradedActivity lab, PassFailExam score, Essay essay, FinalExam finalExam){
            
            setLab(lab);
            setPassFailExam(score);
            setEssay(essay);
            setFinalExam(finalExam);
            
        }
        
        public void setLab(GradedActivity g){
            this.labScore = g;
        }
        public void setPassFailExam(PassFailExam g){
            this.passFailScore = g;
        }
        public void setEssay(Essay g){
            this.essayScore = g;
        }
        public void setFinalExam(FinalExam g){
            this.finalScore = g;
        }
        
        public double getAverage(){
            double average;
            double accum = 0;
            for(int x = 0; x < grades.length; x++){
                
                accum += grades[x].getScore();
                
            }
            average = accum/grades.length;
            return average;
        }
        
       public GradedActivity getHighest(){
           GradedActivity highest = new GradedActivity();
           
           for(int x = 0; x < grades.length; x++){
                
               if(grades[x].getScore() >= grades[x+1].getScore()){
                 highest.setScore(grades[x].getScore());
               }
               else{
                 highest.setScore(grades[x+1].getScore());
               }
            }
           return new GradedActivity(highest.getScore());
       }
       
       public GradedActivity getLowest(){
           GradedActivity lowest = new GradedActivity();
           
           for(int x = 0; x < grades.length; x++){
                
               if(grades[x].getScore() <= grades[x+1].getScore()){
                 lowest.setScore(grades[x].getScore());
               }
               else{
                 lowest.setScore(grades[x+1].getScore());
               }
            }
           return new GradedActivity(lowest.getScore());
       }
        public String toString(){
            
            String str = "Lab Score " + labScore.getScore() + " Lab Grade: " + labScore.getGrade() +
                          "\nExam Score: " + passFailScore.getScore() + " Exam Pass/Fail: " + passFailScore.getGrade() +
                          "\nEssay Score: " + essayScore.getScore() + " Essay Grade: " + essayScore.getGrade() +
                          "\nFinal Exam: " + finalScore.getScore() + " Final Exam Grade: " + finalScore.getGrade();
              
            return str;
        }
}