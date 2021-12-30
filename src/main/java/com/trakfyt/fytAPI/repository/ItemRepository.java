package com.trakfyt.fytAPI.repository;

import com.trakfyt.fytAPI.repository.entity.Item;
import org.springframework.data.repository.CrudRepository;


public interface ItemRepository extends CrudRepository<Item, Integer> {

}
