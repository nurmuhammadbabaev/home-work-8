package peaksoft.vseMetody;

import org.hibernate.Session;
import org.hibernate.stat.SessionStatistics;
import peaksoft.entity.Users;
import peaksoft.hibernate.Hibernate;

import java.util.List;
import java.util.Scanner;

public class Methods implements UserDao {

    static Scanner scanner=new Scanner(System.in);
    public long create(List<Users> users) {
        Session session = Hibernate.getSession().openSession();
        session.beginTransaction();

        for (Users user : users) {
            session.save(user);
        }
        session.getTransaction().commit();
        session.close();
        System.out.println("\nДобавлено новый пользователь!! \tThis is a Users Table:");
        System.out.println("#######################################################");
        System.out.println("Id\t|"+"\tName\t|"+"\tsurName\t\t|"+"\tage\t|"+" nationality |");
        System.out.println("----+-----------+---------------+-------+-------------+");
        System.out.println(users);
        System.out.println("#######################################################");

        return users.size();
    }


    public  List<Users> reade(String name, int age){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        List<Users>users=session.createQuery(" FROM Users WHERE age>20 and name IN ('Aza')").getResultList();
        session.getTransaction().commit();
        session.close();
        return  users;
    }
    public  void update(String name){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();

        session.createQuery(" UPDATE Users SET age=18 WHERE name='Aza' ").executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
    public  void cleane(String name){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        session.createQuery("DELETE Users WHERE name='Aza'").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
    public  void delete(){
        Session session=Hibernate.getSession().openSession();
        session.beginTransaction();
        session.createQuery("DELETE Users").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }

}
