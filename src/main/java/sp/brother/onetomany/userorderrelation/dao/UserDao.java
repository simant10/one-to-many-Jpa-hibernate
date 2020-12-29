package sp.brother.onetomany.userorderrelation.dao;

import java.util.List;

import sp.brother.onetomany.userorderrelation.entity.UserEntity;
import sp.brother.onetomany.userorderrelation.model.User;

public interface UserDao {
	int saveOrder(UserEntity userEntity);
	List<UserEntity> getOrderList();
}
