package peaksoft.vseMetody;

import org.hibernate.Session;
import org.hibernate.stat.SessionStatistics;
import peaksoft.entity.Users;
import peaksoft.hibernate.Hibernate;

import java.util.List;
import java.util.Scanner;

public class Methods {

    static Scanner scanner=new Scanner(System.in);

    public static long create(Users users){

        Session session= Hibernate.getSession().openSession();
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        session.close();

        System.out.println("\nДобавлено новый пользователь!! \tThis is a Users Table:");

        System.out.println(users);


        return users.getId();
    }

    public static List<Users> reade(){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        List<Users>users=session.createQuery(" FROM Users WHERE age>20 and name IN ('Aza')").getResultList();
        session.getTransaction().commit();
        session.close();
        return  users;
    }
    public static void update(){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();

        session.createQuery(" UPDATE Users SET age=18 WHERE name='Aza' ").executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
    public static  void cleane(){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        session.createQuery("DELETE Users WHERE name='Aza'").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
    public static void delete(){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        session.createQuery("DELETE Users").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
    
}
