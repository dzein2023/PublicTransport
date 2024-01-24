package com.example.demo.domains;
import jakarta.persistence.*;

@Entity
@Table(name="cities")
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    // @Column(name="location")
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "location_id",referencedColumnName = "id")
    @PrimaryKeyJoinColumn
    private Geolocation geolocation;
    @OneToOne
    @MapsId
    @JoinColumn(name="id")
    private PublicTransport publicTransport;
    public city() {
    }

    public PublicTransport getPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(PublicTransport publicTransport) {
        this.publicTransport = publicTransport;
    }

    public city(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "city{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", geolocation=" + geolocation +
                ", publicTransport=" + publicTransport +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public city(Long id, String name, Geolocation geolocation) {
        this.id = id;
        this.name = name;
        this.geolocation = geolocation;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }
}
