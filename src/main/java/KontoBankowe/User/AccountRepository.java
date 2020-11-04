package KontoBankowe.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AccountRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Account account){
        entityManager.persist(account);

    }
}
