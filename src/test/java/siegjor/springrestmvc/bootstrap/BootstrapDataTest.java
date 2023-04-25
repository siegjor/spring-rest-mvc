package siegjor.springrestmvc.bootstrap;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import siegjor.springrestmvc.repositories.BeerRepository;
import siegjor.springrestmvc.repositories.CustomerRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BootstrapDataTest {

    @Autowired
    BeerRepository beerRepository;

    @Autowired
    CustomerRepository customerRepository;

    BootstrapData boostrapData;

    @BeforeEach
    void setUp() {
        boostrapData = new BootstrapData(beerRepository, customerRepository);
    }

    @Test
    void runTest() throws Exception {
        boostrapData.run(null);

        assertThat(beerRepository.count()).isEqualTo(3);
        assertThat(customerRepository.count()).isEqualTo(3);
    }
}