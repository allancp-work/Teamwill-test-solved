package com.teamwill.app.test.controller;


import com.teamwill.app.test.entity.AppUser;
import com.teamwill.app.test.entity.Ranking;
import com.teamwill.app.test.service.AppUserService;
import com.teamwill.app.test.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ranking")
@RequiredArgsConstructor
public class RankingController {


    private final RankingService rankingService;
    private final AppUserService appUserService;

    @PostMapping("/save")
    public ResponseEntity<Ranking> insert(@RequestBody Ranking ranking){
        try{
            URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/ranking/insert").toUriString());
            return ResponseEntity.created(uri).body(rankingService.insert(ranking));
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/getAllHighestToLowest")
    public ResponseEntity<List<Ranking>> getAllHighestToLowest(){
        try{
            return ResponseEntity.ok().body(rankingService.getAllHighestToLowest());
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getAppUsers(){
        try{
            return ResponseEntity.ok().body(appUserService.getAppUsers());
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
