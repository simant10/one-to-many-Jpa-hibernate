package sp.brother.onetomany.userorderrelation.service;

import java.util.List;

import sp.brother.onetomany.userorderrelation.entity.UserEntity;
import sp.brother.onetomany.userorderrelation.model.User;

public interface UserService {
	int saveOrder(UserEntity userEntity);
	List<User> getOrders();
}
