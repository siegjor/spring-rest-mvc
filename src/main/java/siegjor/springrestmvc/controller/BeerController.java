package siegjor.springrestmvc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import siegjor.springrestmvc.model.Beer;
import siegjor.springrestmvc.services.BeerService;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("Get beer by id - in controller: " + id.toString());

        return beerService.getBeerById(id);
    }
}
