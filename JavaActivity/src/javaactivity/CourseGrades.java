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

        private GradedActivity[] grades = new GradedActivity[4];
        
        public CourseGrades(GradedActivity lab, PassFailExam score, Essay essay, FinalExam finalExam){
            
            setLab(lab);
            setPassFailExam(score);
            setEssay(essay);
            setFinalExam(finalExam);
            
        }
        
        public void setLab(GradedActivity g){
            this.grades[0] = g;
        }
        public void setPassFailExam(PassFailExam g){
            this.grades[1] = g;
        }
        public void setEssay(Essay g){
            this.grades[2] = g;
        }
        public void setFinalExam(FinalExam g){
            this.grades[3] = g;
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
               
               double max = grades[0].getScore();
               if(max >= grades[x].getScore()){
                 highest.setScore(max);
               }
               else{
                 highest.setScore(grades[x].getScore());
               }
            }
           return highest;
       }
       
       public GradedActivity getLowest(){
           GradedActivity lowest = new GradedActivity();
           
           for(int x = 0; x < grades.length; x++){
               double min = grades[0].getScore();
               
               if(min <= grades[x].getScore()){
                 lowest.setScore(min);
               }
               else{
                 lowest.setScore(grades[x].getScore());
               }
            }
           return lowest;
       }
       
        public String toString(){
            
            String str = "Lab Score " + grades[0].getScore() + " Lab Grade: " + grades[0].getGrade() +
                          "\nExam Score: " + grades[1].getScore() + " Exam Pass/Fail: " + grades[1].getGrade() +
                          "\nEssay Score: " + grades[2].getScore() + " Essay Grade: " + grades[2].getGrade() +
                          "\nFinal Exam: " + grades[3].getScore() + " Final Exam Grade: " + grades[3].getGrade();
              
            return str;
        }
}