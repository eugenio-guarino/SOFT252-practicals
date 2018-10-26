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
public class Lecturer extends UniPeople implements ITeach {
    
    public Lecturer(int ID, String name) {
        super(ID, name);
       
    }

    @Override
    public void setCourseWork(String coursework) {
        this.course.setCoursework(coursework);
    
    }

    @Override
    public void teach(){
        
        System.out.println(this.name + " is teaching" + this.course.getCode() + " in room " + this.course.getRoom());

    
    }
    
}
