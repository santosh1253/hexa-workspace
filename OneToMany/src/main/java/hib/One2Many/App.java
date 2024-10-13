package hib.One2Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.hbm.xml").build();
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf=meta.getSessionFactoryBuilder().build();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        List<String> l1=new ArrayList<String>();
        l1.add("Java is a programming language");
        l1.add("Java is OOP oriented lang");
        Question q=new Question(1,"What is java",l1);
        session.save(q);
        t.commit();
        System.out.println("Saved Successfully");
       
        
    }
}
