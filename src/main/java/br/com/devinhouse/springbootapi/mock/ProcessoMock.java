package br.com.devinhouse.springbootapi.mock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.devinhouse.springbootapi.dto.ProcessoDTO;

@Component
public class ProcessoMock implements Serializable {

	private static final long serialVersionUID = 1838934594260766206L;

	public List<ProcessoDTO> getAllProcessos() {

		List<ProcessoDTO> listProcessos = new ArrayList<ProcessoDTO>();

		int qtdProcessos = 10;

		for (int i = 0; i < qtdProcessos; i++) {

			ProcessoDTO dto = new ProcessoDTO();
			dto.setCdAssunto(001);
			dto.setCdInteressado(001);
			dto.setDescricao("Processo " + i + "de testes DEV In House ");
			dto.setDescricaoAssunto("Assunto " + i + " de testes DEV In House ");
			dto.setNmInteressado("Jão Antonio ::: " + i);
			dto.setNuAnoProcesso(i <= 5 ? "2020" : "2021");
			dto.setNuProcesso(i);
			dto.setSgOrgaoProcesso("SOFT");

			listProcessos.add(dto);
		}

		return listProcessos;
	}

}
