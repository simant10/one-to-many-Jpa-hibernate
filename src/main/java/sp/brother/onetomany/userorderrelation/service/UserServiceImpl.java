package sp.brother.onetomany.userorderrelation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sp.brother.onetomany.userorderrelation.dao.UserDao;
import sp.brother.onetomany.userorderrelation.entity.UserEntity;
import sp.brother.onetomany.userorderrelation.model.User;
import sp.brother.onetomany.userorderrelation.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao ;
	@Autowired
	UserRepository userRepository;
	@Override
	@Transactional
	public int saveOrder(UserEntity userEntity) {
		 UserEntity savedRecord = userRepository.save(userEntity);
		 return savedRecord.getUserId();
		//return userDao.saveOrder(userEntity);
	}

	@Override
	public List<User> getOrders() {
		List<User> orderList = new ArrayList<User>();
		List<UserEntity> orderEntity = userDao.getOrderList();
		orderEntity.forEach(order->{
			User user = new User();
			user.setUserName(order.getUserName());
			user.setEmail(order.getEmail());
			user.setMobile(order.getMobile());
			user.setUserId(order.getUserId());
			user.setProducts(order.getProducts());
			orderList.add(user);
		});
		return orderList;
	}

}
