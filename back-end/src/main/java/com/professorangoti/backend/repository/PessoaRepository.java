package com.professorangoti.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.professorangoti.backend.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
    @Override
    List<Pessoa> findAll();
}
