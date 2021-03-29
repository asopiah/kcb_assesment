package com.kcb.iprs.repository;

import com.kcb.iprs.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
