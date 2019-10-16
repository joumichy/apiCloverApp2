package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MyEntity;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, String>{
	
	String my_request = "SELECT * FROM newschema.test_watch";
	
	@Query(value = my_request+";", nativeQuery = true)
	public List<MyEntity> showall();
	
	@Query(value = my_request+ " WHERE watch_name = :watchname;", nativeQuery = true)
	public List<MyEntity> showname(@Param("watchname") String watchname);

}
