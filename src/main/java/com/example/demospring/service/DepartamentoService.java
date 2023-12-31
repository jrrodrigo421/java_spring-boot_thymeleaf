package com.example.demospring.service;

import com.example.demospring.domain.Cargo;
import com.example.demospring.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

    void salvar (Departamento departamento);
    void editar (Departamento departamento);
    void excluir (Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarTodos();
}
