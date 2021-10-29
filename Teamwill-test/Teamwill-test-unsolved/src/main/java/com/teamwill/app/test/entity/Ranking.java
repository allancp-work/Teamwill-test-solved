package com.teamwill.app.test.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Ranking {

    @Id
//    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    //TODO - verificar o unique
    private String name;

    private int rank;

    public Ranking() {
    }

    public Ranking(Long id, String name, int ranking) {
        this.id = id;
        this.name = name;
        this.rank = ranking;
    }

    public Long getId() {
        return id;
    }

    public Ranking setId(Long id) {
        this.id = id;
        return this;
    }

    public int getRank() {
        return rank;
    }

    public Ranking setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ranking setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
