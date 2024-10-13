package sample.hibernate_example;

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
       Employee e=new Employee(1,"Guru");
       System.out.println(e.toString());
       session.save(e);
       t.commit();
       System.out.println("Saved Successfully");
    }
}
