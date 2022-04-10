package co.simplon.p25.sample.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<MemberIdentity> getIdentities() {
	return repository.findAllProjectedBy();
    }
}
