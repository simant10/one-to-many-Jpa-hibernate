package sp.brother.onetomany.userorderrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sp.brother.onetomany.userorderrelation.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

}
