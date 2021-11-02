package com.teamwill.app.test.service;

import com.teamwill.app.test.entity.Ranking;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class RankingServiceImplTest {
    @Autowired
    private RankingService service;

    @Test
    public void getAllRankings() {
        List<Ranking> all = service.getAll();
        assertThat(all).isNotNull();
        assertThat(all).allMatch(r -> r.getRank() > 40)
                .isNotEmpty();
    }

    @Test
    public void getTop5() {
        List<Ranking> all = service.getTop5();
        assertThat(all).isNotNull();
        assertThat(all).element(0).extracting("name").isEqualTo("Janaina");
        assertThat(all).element(4).extracting("name").isEqualTo("Monica");
    }

}
