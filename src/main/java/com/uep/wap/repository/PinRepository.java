package com.uep.wap.repository;

import com.uep.wap.model.Pin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinRepository extends CrudRepository<Pin, Integer> {


}