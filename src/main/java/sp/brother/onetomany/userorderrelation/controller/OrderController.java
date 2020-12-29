package sp.brother.onetomany.userorderrelation.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sp.brother.onetomany.userorderrelation.entity.UserEntity;
import sp.brother.onetomany.userorderrelation.model.User;
import sp.brother.onetomany.userorderrelation.service.UserService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	UserService userService;
	
	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody UserEntity userEntity ) {
		int userId = userService.saveOrder(userEntity);
		return "Record Saved successfully. User Id = "+userId;
	}
	
	@GetMapping("/orderlist")
	public List<User>  orderList(){
		return userService.getOrders();
	}
}
