package by.itacademy.entity;

import by.itacademy.entity.Gender;
import by.itacademy.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;

public class SetUsers {

    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
        try(Session session = SESSION_FACTORY.openSession()) {
            Transaction transaction = session.beginTransaction();
            Users user = new Users();
            user.setName("Hulk");
            user.setGender(Gender.MALE);
            user.setCreationDate(LocalDateTime.now());

            session.saveOrUpdate(user);

            transaction.commit();
        }
        SESSION_FACTORY.close();
    }
}

