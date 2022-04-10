package co.simplon.p25.sample.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "towns")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "name")
    private String name;

    public Town() {
	//
    }

    public Long getId() {
	return id;
    }
    // No setId!

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String code) {
	zipCode = code;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return String.format("{id=%s, zipCode=%s, name=%s}", id, zipCode, name);
    }
}
