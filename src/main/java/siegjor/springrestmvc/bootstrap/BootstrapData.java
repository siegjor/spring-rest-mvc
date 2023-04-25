package siegjor.springrestmvc.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siegjor.springrestmvc.entities.Beer;
import siegjor.springrestmvc.entities.Customer;
import siegjor.springrestmvc.model.BeerStyle;
import siegjor.springrestmvc.repositories.BeerRepository;
import siegjor.springrestmvc.repositories.CustomerRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final BeerRepository beerRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerData();
        loadCustomerData();
    }


    private void loadBeerData() {
        if (beerRepository.count() == 0) {
            Beer beer1 = Beer.builder()
                    .beerName("Saint Beer")
                    .beerStyle(BeerStyle.IPA)
                    .upc("847548")
                    .price(new BigDecimal(7.99))
                    .quantityOnHand(80)
                    .createdDate(LocalDateTime.now())
                    .updateDate(LocalDateTime.now())
                    .build();

            Beer beer2 = Beer.builder()
                    .beerName("Asahi")
                    .beerStyle(BeerStyle.PILSEN)
                    .upc("826472")
                    .price(new BigDecimal(12.99))
                    .quantityOnHand(30)
                    .createdDate(LocalDateTime.now())
                    .updateDate(LocalDateTime.now())
                    .build();

            Beer beer3 = Beer.builder()
                    .beerName("Trooper")
                    .beerStyle(BeerStyle.RED_ALE)
                    .upc("345243")
                    .price(new BigDecimal(10.99))
                    .quantityOnHand(150)
                    .createdDate(LocalDateTime.now())
                    .updateDate(LocalDateTime.now())
                    .build();

            beerRepository.saveAll(Arrays.asList(beer1, beer2, beer3));
        }
    }


    private void loadCustomerData() {
        if (customerRepository.count() == 0) {
            Customer customer1 = Customer.builder()
                    .id(UUID.randomUUID())
                    .customerName("Winston")
                    .version(1)
                    .createdDate(LocalDateTime.now())
                    .lastModifiedDate(LocalDateTime.now())
                    .build();

            Customer customer2 = Customer.builder()
                    .id(UUID.randomUUID())
                    .customerName("Petrenko")
                    .version(2)
                    .createdDate(LocalDateTime.now())
                    .lastModifiedDate(LocalDateTime.now())
                    .build();

            Customer customer3 = Customer.builder()
                    .id(UUID.randomUUID())
                    .customerName("Jackson")
                    .version(1)
                    .createdDate(LocalDateTime.now())
                    .lastModifiedDate(LocalDateTime.now())
                    .build();

            customerRepository.saveAll(Arrays.asList(customer1, customer2, customer3));
        }
    }
}
