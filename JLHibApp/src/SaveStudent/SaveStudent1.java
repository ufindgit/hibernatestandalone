/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SaveStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jl.vo.StudentTo;

/**
 *
 * @author Rishitha
 */
public class SaveStudent1 {
    
    public static void main(String args[]){
        
        //In Hibernate the most important thing is SessionFactory
        //With SessionFactory we can request session
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
        //Session is very important 
        //and using session we do every thing in hibernate.
        //Eg We can save,update,delete,load,get etc.........
        Session ses = sf.openSession();
        
        //In our First Example We will See How to save the
        //Student Object using Hibernate.
        
        //In hibernate we need to write sql query to insert
        //When you call session.save
        //hibernate generates insert query
        
        //Let us create our First Student Object
        
        StudentTo first = new StudentTo();
        first.setSid(1);
        first.setSfname("Anilkumar");
        first.setSlname("Chintha");
        Transaction tx = null;
        try{
            tx  = ses.beginTransaction();
            ses.save(first);
            //You can see after save hibernate generates following insert statement
            //insert into StudentTo (sbdate, sfname, slname, sid) values (?, ?, ?, ?)
            tx.commit();
        }catch(Exception e ){
            System.out.println("Error in Saving StudentTo ");
            tx.rollback();
        }
        
        //Notes
        //By using @Table annotation you can rename the table name
        //as you wish
        //By default if you don't specify @Table annotation the class
        //name will be taken as table name
        
        //By using @Column annotation you can rename the column name
        //as you wish
        //By default if you don't specify @column annotation for the property
        //property name will be taken as column name
        
        //@Temporal is used to map the property to date type column
        
        //When you call session.save hibernate generates insert statement
        //automatically
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
