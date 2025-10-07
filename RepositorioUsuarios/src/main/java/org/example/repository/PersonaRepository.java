package org.example.repository;

import org.example.models.Persona;

import java.util.List;

public interface PersonaRepository{
    public Single<List<Persona>> getAll();

    public Maybe<Persona> getById(Long id);

    public Maybe<Persona> save(Persona persona);

    public Maybe<Persona> update(Persona persona, Long id);

    public Maybe<Persona> delete(Long id);
}
