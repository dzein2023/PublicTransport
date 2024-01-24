package com.example.demo.domains;
import jakarta.persistence.*;

@Entity
@Table(name="transport")
public class PublicTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="line_id")
    private Long id;
    private String name;
    private String type; // Bus, Train, etc.
    // @Column(name="city")
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "city_name",referencedColumnName = "name")
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "city_id")
    private city city; // The city where the public transport operates


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public city getCity() {
        return city;
    }

    public void setCity(city city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "PublicTransport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", city=" + city +
                '}';
    }

    public PublicTransport(Long id, String name, String type, city city) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
    }
}
