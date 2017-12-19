package mum.edu.cs544.mumBidApp.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.dmain.User;
import mum.edu.cs544.mumBidApp.model.LoginUserDto;

@Repository
public class UserDaoImpl implements UserDao{
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public boolean registerUser(User user) {
		String regUser = "from User u where u.eMail=?";
		Query regQuery = em.createQuery(regUser);
		regQuery.setParameter(1, user.geteMail());
		if(regQuery.getResultList().size()>0) {
			return false;
		}else {
			em.persist(user);
			return true;
		}
	}

	@Transactional
	public boolean loginUser(LoginUserDto user) {
		String loginUser = "from User u where u.eMail=? and u.password=?";
		Query query = em.createQuery(loginUser);
		query.setParameter(1, user.geteMail());
		query.setParameter(2, user.getPassword());
		if(query.getResultList().isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
