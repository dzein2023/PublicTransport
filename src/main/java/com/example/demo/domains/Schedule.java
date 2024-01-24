package com.example.demo.domains;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String routeName;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_schedule")
    private city city; // The City with the transportation schedule

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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public com.example.demo.domains.city getCity() {
        return city;
    }

    public void setCity(com.example.demo.domains.city city) {
        this.city = city;
    }

    public Schedule(Long id, String routeName, LocalDateTime departureTime, LocalDateTime arrivalTime, com.example.demo.domains.city city) {
        this.id = id;
        this.routeName = routeName;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", city=" + city +
                '}';
    }
}
