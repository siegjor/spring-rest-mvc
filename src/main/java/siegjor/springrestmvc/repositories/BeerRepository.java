package siegjor.springrestmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import siegjor.springrestmvc.entities.Beer;
import siegjor.springrestmvc.entities.Customer;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
