package co.simplon.p25.sample.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.sample.api.entities.Team;

@Repository // Indique a Spring que cette interface est un repository
// Team = la classe metier manipulee par ce repository
// Long = le type de l'id de la classe metier
// JpaRepository = interface de Spring qui expose des methodes par defaut
public interface TeamRepository extends JpaRepository<Team, Long> {
    //
}
