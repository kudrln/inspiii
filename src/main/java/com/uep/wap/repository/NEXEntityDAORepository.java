package com.uep.wap.repository;

import com.uep.wap.model.NEXEntityDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NEXEntityDAORepository extends CrudRepository<NEXEntityDAO, Integer> {


}