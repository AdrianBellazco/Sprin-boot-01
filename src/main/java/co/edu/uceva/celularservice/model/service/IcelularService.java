package co.edu.uceva.celularservice.model.service;

import co.edu.uceva.celularservice.model.entities.Celular;

import java.util.List;

public interface IcelularService {
    List<Celular> listar();

    void delete(Celular celular);

    Celular save(Celular celular);

    Celular findById(Long id);

    Celular update(Celular celular);
}
