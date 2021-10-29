package com.teamwill.app.test.service;

import com.sun.istack.NotNull;
import com.teamwill.app.test.entity.Ranking;
import com.teamwill.app.test.repository.RankingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RankingServiceImpl implements RankingService {

    private final RankingRepository repository;

    public Ranking insert(@NotNull Ranking ranking){
        ranking.setId(repository.getLastId() + 1);
        return repository.save(ranking);
    }

    public List<Ranking> getAll() {
        List<Ranking> rankings = repository.findAll();
        //rankings.sort(Comparator.comparing(Ranking::getRank));
        return rankings;
    }

    public List<Ranking> getAllHighestToLowest() {
        List<Ranking> rankings = repository.findAll();
        Comparator<Ranking> comparator = Comparator.comparing(r -> r.getRank());
        return rankings.stream().sorted(comparator.reversed()).collect(Collectors.toList());
    }

    public List<Ranking> getTop5() {
        List<Ranking> rankings = repository.findAll();
        Comparator<Ranking> comparator = Comparator.comparing(e -> e.getRank());
        return rankings.stream().sorted(comparator.reversed()).limit(5).collect(Collectors.toList());
    }

}
