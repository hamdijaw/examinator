package com.example.authserver2.repository;

import com.example.authserver2.domain.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface PartyRepository extends CrudRepository<Party, Long> {

    Collection<Party> findAll();

}
