package com.example.aprendizagemtestes.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.aprendizagemtestes.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    //operacao_estado_return
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {
        Planet su = planetService.create(PLANET);

        assertThat(su).isEqualTo(PLANET);
    }
}
