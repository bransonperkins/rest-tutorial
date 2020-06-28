package com.win2020.resttutorial.repository;

import com.win2020.resttutorial.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
