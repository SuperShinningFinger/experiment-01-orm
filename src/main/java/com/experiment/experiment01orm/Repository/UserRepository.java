package com.experiment.experiment01orm.Repository;

import com.experiment.experiment01orm.Entity.Address;
import com.experiment.experiment01orm.Entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress(){
        User user = new User("TEST");
        em.persist(user);
        Address address1 = new Address("add 1 ");
        Address address2 = new Address("add 2 ");
        address1.setUser(user);
        address2.setUser(user);
        em.persist(address1);
        em.persist(address2);
    }
}
