package co.simplon.p25.sample.api.dtos;

// Spring permet de faire des projections par interface
// Reduit la quantite de code pour recuperer les donnees souhaitees
// Cette projection permet de se representer uniquement
// le first name et le last name de chaque Member
// au lieu de retourner toutes ses proprietes comme l'adresse dont on a pas besoin
public interface MemberIdentity {

    // Le type et le getter correspondent a ce qui est declare dans la classe
    // metier Member
    String getFirstName();

    // Le type et le getter correspondent a ce qui est declare dans la classe
    // metier Member
    String getLastName();
}
