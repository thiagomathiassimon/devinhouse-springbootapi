package br.com.devinhouse.springbootapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devinhouse.springbootapi.dto.ProcessoDTO;
import br.com.devinhouse.springbootapi.repository.ProcessoRepository;

@Service
public class ProcessoService {

	@Autowired
	private ProcessoRepository repository;

	public List<ProcessoDTO> recuperarProcessosMockados() {

		// AQUI SERIA ONDE COLOCARIAMOS AS NOSSAS REGRAS DE NEGOCIO

		return repository.findAllProcessos();
	}

}
