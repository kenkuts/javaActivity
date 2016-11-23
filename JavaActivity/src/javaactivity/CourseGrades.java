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
public class CourseGrades{

        private GradedActivity labScore;
        private PassFailExam passFailScore;
        private Essay essayScore;
        private FinalExam finalScore;
        //private GradedActivity[] grades = {labScore, passFailScore, essayScore, finalScore};
        
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
       
        public String toString(){
            
            String str = "Lab Score " + labScore.getScore() + " Lab Grade: " + labScore.getGrade() +
                          "\nExam Score: " + passFailScore.getScore() + " Exam Pass/Fail: " + passFailScore.getGrade() +
                          "\nEssay Score: " + essayScore.getScore() + " Essay Grade: " + essayScore.getGrade() +
                          "\nFinal Exam: " + finalScore.getGrade() + " Final Exam Grade: " + finalScore.getGrade();
              
            return str;
        }
}