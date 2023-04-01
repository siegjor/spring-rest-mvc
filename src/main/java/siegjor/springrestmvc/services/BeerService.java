package siegjor.springrestmvc.services;

import siegjor.springrestmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
