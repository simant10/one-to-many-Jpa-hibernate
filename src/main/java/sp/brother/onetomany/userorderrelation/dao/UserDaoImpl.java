package sp.brother.onetomany.userorderrelation.dao;

import java.util.List;


import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sp.brother.onetomany.userorderrelation.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public int saveOrder(UserEntity userEntity) {
		Session currentSession = entityManager.unwrap(Session.class);
		return (int) currentSession.save(userEntity);
	}

	@Override
	public List<UserEntity> getOrderList() {
		List<UserEntity> orderList;
		Session currentSession = entityManager.unwrap(Session.class);
		Query<UserEntity> query = currentSession.createQuery("From UserEntity",UserEntity.class);
		orderList = query.getResultList();
		return orderList;
	}
	
	

}
