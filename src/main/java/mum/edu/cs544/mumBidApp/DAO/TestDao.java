package mum.edu.cs544.mumBidApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.model.User;

@Repository
@Transactional
public class TestDao {
	
	/*  @Autowired
	    private SessionFactory _sessionFactory;

	    private Session getSession() {
	        return _sessionFactory.getCurrentSession();
	    }

	    public void save(User user) {
	        getSession().save(user);
	        return;
	    }*/

}
