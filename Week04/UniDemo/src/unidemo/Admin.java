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
public class Admin {
    
    public static void assignCourse(UniPeople person, Course course){
        person.setCourse(course);
              
    }
    
    public static void getDetails(UniPeople person){
        
        if (person.course == null)
        System.out.println(person.name +" "+ person.ID);
        
        else
        System.out.println(person.name +" "+ person.ID +" "+ person.course.getCode());
        
    }
}
