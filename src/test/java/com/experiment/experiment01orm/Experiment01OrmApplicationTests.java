package com.experiment.experiment01orm;

import com.experiment.experiment01orm.Repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Experiment01OrmApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager em;
    @Test
    public void contextLoads() {

    }

    @Test
    public void test() {
        userRepository.addUserAddress();
    }

}
