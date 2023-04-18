package siegjor.springrestmvc.mappers;

import org.mapstruct.Mapper;
import siegjor.springrestmvc.entities.Customer;
import siegjor.springrestmvc.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
