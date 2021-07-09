package com.greeting.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greeting.main.model.Greeting;
@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long>{
}
