package sp.brother.onetomany.userorderrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sp.brother.onetomany.userorderrelation.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{

}
