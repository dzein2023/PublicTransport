package com.example.demo.domains;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String routeName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_route")
    private city city; // The city where the route is located


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public com.example.demo.domains.city getCity() {
        return city;
    }

    public void setCity(com.example.demo.domains.city city) {
        this.city = city;
    }

    public Route(Long id, String routeName, com.example.demo.domains.city city) {
        this.id = id;
        this.routeName = routeName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", city=" + city +
                '}';
    }
}
