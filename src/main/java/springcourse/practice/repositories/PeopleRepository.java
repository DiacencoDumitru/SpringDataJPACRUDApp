package springcourse.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springcourse.practice.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
