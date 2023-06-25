package com.uep.wap.repository;

import com.uep.wap.model.MainPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainPageRepository extends CrudRepository<MainPage, Integer> {


}