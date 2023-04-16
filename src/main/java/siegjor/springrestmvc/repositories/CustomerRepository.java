package siegjor.springrestmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import siegjor.springrestmvc.entities.Customer;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
