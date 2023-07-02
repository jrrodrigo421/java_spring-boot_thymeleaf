package com.example.demospring.dao;

import org.springframework.stereotype.Repository;

import com.example.demospring.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
