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
public class Student extends UniPeople{
    
    public Student(int ID, String name) {
        super(ID, name);
    }
    
    public void attendClass()
    {
        System.out.println(this.name + " is attending " + this.course.getCode() 
                + " in " + this.course.getRoom());
    }
    
    public void doCourseWork()
    {
        System.out.println(this.name + " is doing coursework" + this.course.getCoursework()); 
    }
    
}
