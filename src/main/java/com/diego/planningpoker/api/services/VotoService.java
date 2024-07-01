package com.diego.planningpoker.api.services;

import com.diego.planningpoker.presentation.dto.http.request.VotoRequest;
import com.diego.planningpoker.domain.Voto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface VotoService {

    Voto cadastrar (VotoRequest votoRequest);

    Page<Voto> listarTodos(Pageable pageable);

    List<Voto> buscarPorIdHistoria(Long id);

    List<String> votaram (long idHistoria);

    void deletePorId(long id);

    void deletePorHistoria(long id);



}
