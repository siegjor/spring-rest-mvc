package siegjor.springrestmvc.services;

import siegjor.springrestmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);

    void updateById(UUID id, Beer beer);
}
