package co.simplon.p25.sample.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "road")
    private String road;

    @ManyToOne
    @JoinColumn(name = "town_id")
    private Town town;

    public Address() {
	//
    }

    public Long getId() {
	return id;
    }
    // No setId!

    public String getRoad() {
	return road;
    }

    public void setRoad(String road) {
	this.road = road;
    }

    public Town getTown() {
	return town;
    }

    public void setTown(Town town) {
	this.town = town;
    }

    @Override
    public String toString() {
	return String.format("{id=%s, road=%s, town=%s}", id, road, town);
    }
}
