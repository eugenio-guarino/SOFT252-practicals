/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author eguarino
 */
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Lecturer lecturer1 = new Lecturer(5438624, "Nigel");
        Student student1 = new Student (10754430, "Gino");
        Course computerScience = new Course ("COM112", "BGB 117");
        
        Admin.getDetails(student1);
        
        Admin.assignCourse(lecturer1, computerScience);
        
        Admin.assignCourse(student1, computerScience);
        
        student1.doCourseWork();
        
        lecturer1.setCourseWork("Traffic Light project");
        
        student1.doCourseWork();
        
        Admin.getDetails(lecturer1);
        
        
        
        
    }
    
}
