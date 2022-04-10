package co.simplon.p25.sample.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    // Requete JPQL (Java Persistence Query Language)
    // On exprime une requete sur les classes et non les tables
    // On retrouve donc le nom des classes et des champs dans la requete
    // On fait une selection sur la classe Member et non la table members
    // m = alias de Member pour raccourcir la requete
    // as firstName = alias du champs m.firstName (besoin pour Spring)
    // @Query("select m.firstName as firstName, m.lastName as lastName from
    // Member m")
    List<MemberIdentity> findAllProjectedBy();
}
