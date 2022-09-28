package btkjava.hibernateAndJpa.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import btkjava.hibernateAndJpa.entities.UsState;

// JPA standardı (JPA aslında ilk etapta ORM tekniği olarak ortaya çıktı)
// JPA : Javax Persistence API

@Repository
public class HibernateUsStateDal implements UsStateDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateUsStateDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional   // <-- AOP : Aspect Oriented Programming
    public List<UsState> getAll() {
        Session session =  entityManager.unwrap(Session.class);

        List<UsState> usStates 
        = session.createQuery("from UsState",UsState.class).getResultList();

        return usStates;
    }

    @Override
    public void add(UsState usState) {
        Session session =  entityManager.unwrap(Session.class);
        session.saveOrUpdate(usState);
    }

    @Override
    public void update(UsState usState) {   // <--- 200 dönüyor ama güncelleme yapmıyor!!
        Session session =  entityManager.unwrap(Session.class);

        UsState usState2 = session.get(UsState.class, usState.getStateId());
        session.saveOrUpdate(usState2);
        session.close();
    }

    @Override
    public void delete(UsState usState) {   // <--- 200 dönüyor ama silme yapmıyor!!
        Session session =  entityManager.unwrap(Session.class);

        UsState usState2 = session.get(UsState.class, usState.getStateId());
        session.delete(usState2);
    }

    @Override
    public UsState getById(int stateId) {
        Session session =  entityManager.unwrap(Session.class);

        UsState usState = session.get(UsState.class,stateId);
        return usState;
    }

}
