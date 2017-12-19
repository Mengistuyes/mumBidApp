package mum.edu.cs544.mumBidApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.DAO.TestDao;


@Service
public class TestService {

   // private final static Logger logger = LoggerFactory.getLogger(CrudService.class);

	/*private TestDao dao ;
	
    @Autowired
    public TestService(TestDao dao) {
       this.dao = dao;
    }

    @Transactional
    public void save(User user) {
    	TestDao userDao = (TestDao) dao;
        userDao.save(user);
    }*/

}
