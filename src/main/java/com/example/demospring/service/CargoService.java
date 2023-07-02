package com.example.demospring.service;

import com.example.demospring.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar (Cargo cargo);
    void editar (Cargo cargo);
    void excluir (Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
}
