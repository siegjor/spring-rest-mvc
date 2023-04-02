package siegjor.springrestmvc.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import siegjor.springrestmvc.model.Beer;
import siegjor.springrestmvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private HashMap<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();

        Beer beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Saint Beer")
                .beerStyle(BeerStyle.IPA)
                .upc("847548")
                .price(new BigDecimal(7.99))
                .quantityOnHand(80)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .version(2)
                .beerName("Asahi")
                .beerStyle(BeerStyle.PILSEN)
                .upc("826472")
                .price(new BigDecimal(12.99))
                .quantityOnHand(30)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .version(3)
                .beerName("Trooper")
                .beerStyle(BeerStyle.RED_ALE)
                .upc("345243")
                .price(new BigDecimal(10.99))
                .quantityOnHand(150)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get beer by id - in service: " + id.toString());

        return beerMap.get(id);
    }
}
