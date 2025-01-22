package com.salientype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static com.salientype.controller.UserController.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // addUser(factory,session);

        // findUser(factory,session,2);

        // updateUser(session,3);

        // deleteUser(session,4);

        // findUserHql(factory,session);

        // getRecordById(factory,session);

        // getRecords(session);

        // getMaxSalary(session);

        // getMaxSalaryGroupBy(session);

        namedQueryExample(session);

    }

}