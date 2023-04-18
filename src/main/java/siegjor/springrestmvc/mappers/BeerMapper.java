package siegjor.springrestmvc.mappers;

import org.mapstruct.Mapper;
import siegjor.springrestmvc.entities.Beer;
import siegjor.springrestmvc.model.BeerDTO;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
