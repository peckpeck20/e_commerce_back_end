package e_sell.e_sell_back_end.domain;

import java.util.List;


import org.springframework.data.repository.CrudRepository;


//item is the object of Item and Long its ID 
public interface ItemRepository extends CrudRepository<Item, Long> {
	List<Item> findByTitle(String title);
	
	List<Item> findByCategory(Category categoryid);
	
	List<Item> findByUser(User userid);
	
	List<Item>findAllByOrderByPriceAsc();
	
	List<Item>findAllByOrderByPriceDesc();
	
	List<Item>findAllByOrderByTitleAsc();
	
	List<Item>findAllByOrderByTitleDesc();
	
	List<Item>findAllByOrderByZipcodeAsc();
	
	List<Item>findAllByOrderByZipcodeDesc();
	
	List<Item>findAllByOrderByCategoryAsc();
	
	List<Item>findAllByOrderByCategoryDesc();
	
}
