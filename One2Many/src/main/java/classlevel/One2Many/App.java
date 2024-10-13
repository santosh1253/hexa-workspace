package classlevel.One2Many;

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
        Address add1=new Address(1,"Devulapalli");
        Address add2=new Address(2,"Hanmakonda");
        Address add3=new Address(3,"Warangal");
        List<Address> al=new ArrayList<Address>();
        al.add(add1);al.add(add2);al.add(add3);
        User u=new User(1,al);
        session.save(u);
        t.commit();
        System.out.println("Completed");
        
        
        
    }
}
