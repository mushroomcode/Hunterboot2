package com.Impl;

import com.Entity.Hunter;
import com.Entity.HunterEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class JpaHunterRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Hunter hunter) {
        entityManager.persist(hunter);
        return hunter.getUserId();
    }

    public void delete(Long userId) {
        Query query = entityManager.createQuery("DELETE FROM HUNTER WHERE ID = ?1");
        query.setParameter(1, userId);
        query.executeUpdate();
    }

    @SuppressWarnings("uncheck")
    public Hunter selectOne(Long userId)
    {
        Query query = entityManager.createQuery("SELECT o FROM HUNTER o WHERE o.ID = ?1");
        query.setParameter(1, userId);
        return (Hunter) query.getSingleResult();
    }

    @SuppressWarnings("uncheck")
    public List<Hunter> selectAll()
    {
        return (List<Hunter>) entityManager.createQuery("SELECT o FROM HUNTER o").getResultList();
    }

}
