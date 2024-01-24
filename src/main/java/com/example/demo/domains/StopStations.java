package com.example.demo.domains;


import jakarta.persistence.*;

@Entity
@Table(name="station")
public class StopStations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="station_id")
    private Long id;
    private String stationName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="location_Station")
    private Geolocation geoLocation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_station")
    private city city; // The city where the stopStation is located

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Geolocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(Geolocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public com.example.demo.domains.city getCity() {
        return city;
    }

    public void setCity(com.example.demo.domains.city city) {
        this.city = city;
    }

    public StopStations(Long id, String stationName, Geolocation geoLocation, com.example.demo.domains.city city) {
        this.id = id;
        this.stationName = stationName;
        this.geoLocation = geoLocation;
        this.city = city;
    }

    @Override
    public String toString() {
        return "StopStations{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", geoLocation=" + geoLocation +
                ", city=" + city +
                '}';
    }
}
