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
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "home_address_id")
    private Address homeAddress;

    public Member() {
	//
    }

    public Long getId() {
	return id;
    }
    // No setId!

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String name) {
	firstName = name;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String name) {
	lastName = name;
    }

    public Address getHomeAddress() {
	return homeAddress;
    }

    public void setHomeAddress(Address address) {
	homeAddress = address;
    }

    @Override
    public String toString() {
	return String.format(
		"{id=%s, firstName=%s, lastName=%s, homeAddress=%s}", id,
		firstName, lastName, homeAddress);
    }
}
