package co.simplon.p25.sample.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.services.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
	this.service = service;
    }

    @GetMapping
    public List<MemberIdentity> getIdentities() {
	return service.getIdentities();
    }
}
