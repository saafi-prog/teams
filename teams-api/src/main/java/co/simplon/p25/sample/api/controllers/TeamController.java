package co.simplon.p25.sample.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.sample.api.entities.Team;
import co.simplon.p25.sample.api.services.TeamService;

@RestController // Indique a Spring que cette classe est un controller Rest
@RequestMapping("/teams") // Convention de nommage Rest
public class TeamController {

    // On declare un champ final du type du service souhaite
    private final TeamService service;

    // On declare un constructeur avec le service en argument
    // Spring injecte une instance du service pour nous
    public TeamController(TeamService service) {
	this.service = service;
    }

    @GetMapping("/{id}")
    public Team getById(@PathVariable("id") Long id) {
	// On appelle la methode qui rend le service souhaite
	return service.getById(id);
    }
}
