package com.springapp.mvc.services;

import com.springapp.mvc.models.Author;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 23.10.2016
 */
@Service("authorsService")
@Repository
public class AuthorsServiceImpl implements IAuthorsService {
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Override
    public Author getById(int id) {
        try {
            return (Author) em.createQuery("select a from Author a where a.id = :id")
                    .setParameter("id", id).getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Author> getAll() {
        return (List<Author>) em.createQuery("select a from Author a")
                .getResultList();

    }

    @Override
    public Author getByPhone(String phone) {
        return null;
    }
}
