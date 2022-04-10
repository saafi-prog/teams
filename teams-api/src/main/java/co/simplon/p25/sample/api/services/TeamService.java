package co.simplon.p25.sample.api.services;

import co.simplon.p25.sample.api.entities.Team;

// Spring a besoin d'une interface pour chaque service
// Par convention : nom de la classe metier suivie de Service
public interface TeamService {

    // On declare la methode qui repond au besoin de selectionner et retourner
    // un objet Team par son id
    // Mauvaise pratique de retourner directement des objets metiers
    // Voir autre approche dans MemberService
    Team getById(Long id);
}
