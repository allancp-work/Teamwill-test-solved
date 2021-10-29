package com.teamwill.app.test.service;

import com.teamwill.app.test.entity.Ranking;
import com.teamwill.app.test.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public interface RankingService {

    Ranking insert(Ranking ranking);

    List<Ranking> getAll();
    List<Ranking> getAllHighestToLowest() ;

    List<Ranking> getTop5();

}
