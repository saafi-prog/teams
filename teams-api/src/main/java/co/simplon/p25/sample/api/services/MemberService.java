package co.simplon.p25.sample.api.services;

import java.util.List;

import co.simplon.p25.sample.api.dtos.MemberIdentity;

public interface MemberService {

    // On declare la methode qui repond au besoin de selectionner et retourner
    // une projection de tous les objets Member et non les objets Member
    // directement
    List<MemberIdentity> getIdentities();
}
