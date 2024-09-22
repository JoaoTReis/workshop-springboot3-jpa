package com.webservice.springService.repositories;

import com.webservice.springService.entities.OrderItem;
import com.webservice.springService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
