package co.simplon.p25.sample.api.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "teams_members",
	    joinColumns = @JoinColumn(name = "team_id"),
	    inverseJoinColumns = @JoinColumn(name = "member_id"))
    private List<Member> members;

    public Team() {
	//
    }

    public Long getId() {
	return id;
    }
    // No setId!

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<Member> getMembers() {
	return members;
    }

    public void setMembers(List<Member> members) {
	this.members = members;
    }

    @Override
    public String toString() {
	return String.format("{id=%s, name=%s, members=%s}", id, name, members);
    }
}
