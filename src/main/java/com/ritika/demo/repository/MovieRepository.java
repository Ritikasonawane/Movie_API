package com.ritika.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ritika.demo.entity.Movie;

public interface UserRepository extends JpaRepository<Movie, Integer>{
	List<Movie> findByYearOfPublish(int year);

}
