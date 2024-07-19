package com.thirdhibernate.SpringYut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Human obj = new Yogesh();
//        obj.brocode();
//        obj.basicNeeds();
        
//        Vishal v = new Vishal();
//        v.brocode();
//        v.basicNeeds();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/thirdhibernate/SpringYut/config.xml");
    	System.out.println(context);
    	
    	Yogesh objYogesh = context.getBean("yogesh",Yogesh.class);
    	// first id name then clas name
         objYogesh.brocode();
    }
}
