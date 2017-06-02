package by.itacademy.dao;

import by.itacademy.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UserDao {
    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();

    public Users getDefaultUsername() {
        try (Session session = SESSION_FACTORY.openSession()) {
            Transaction transaction = session.beginTransaction();
            Users user = session.get(Users.class, 2L);
            transaction.commit();
            return user;


        }


    }

    public static void finish() {
        SESSION_FACTORY.close();
    }

}
