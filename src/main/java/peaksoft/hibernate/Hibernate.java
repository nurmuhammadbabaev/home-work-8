package peaksoft.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
private static SessionFactory session=buildSessionFactory();

public static SessionFactory buildSessionFactory(){
    try {
return new Configuration().configure("hibernate.cfg.hml.tld").buildSessionFactory();
    }catch (Throwable exception){
        System.out.println("Kata! "+exception);
throw new ExceptionInInitializerError(exception);
    }
}
public static SessionFactory getSession(){

    return session;
}
public static  void zakryvat(){
     getSession().close();
}
}
