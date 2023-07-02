package com.example.demospring.service;

import com.example.demospring.domain.Cargo;
import com.example.demospring.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {
    void salvar (Funcionario funcionario);
    void editar (Funcionario funcionario);
    void excluir (Long id);
    Funcionario buscarPorId(Long id);
    List<Funcionario> buscarTodos();
}
