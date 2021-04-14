package br.com.devinhouse.springbootapi.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devinhouse.springbootapi.dto.ProcessoDTO;
import br.com.devinhouse.springbootapi.dto.ProcessoReturnResponseDTO;
import br.com.devinhouse.springbootapi.service.ProcessoService;

//TODO 1 - Implementar versionamento em nossa API

//TODO 6 - Implementar os status code com mensagem amigaveis em nossa API

@RestController
@RequestMapping(value = "/processos")
public class ProcessosController {

	@Autowired
	private ProcessoService service;

	@RequestMapping(value= "/consulta-json", method = GET, produces = APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ProcessoDTO> recuperarListaProcessos() {

		return service.recuperarProcessosMockados();
	}

	@RequestMapping(value = "/consulta-xml", method = GET, produces = APPLICATION_XML_VALUE)
	@ResponseBody
	public ResponseEntity<ProcessoReturnResponseDTO> recuperarListaProcessosXML() {
		
		ProcessoReturnResponseDTO response = new ProcessoReturnResponseDTO();
		response.setProcesso(service.recuperarProcessosMockados());

		return new ResponseEntity<ProcessoReturnResponseDTO>(response, HttpStatus.OK);
	}
	
	
	//TODO 2 - Criar uma API que retorne somente os processo de 2020 usando Query string @RequestParam e o verbo GET 
	
	//TODO 3 - Criar uma API que retorne somente os processo de 2020 usando a @PathVariable e o verbo GET 
	
	//TODO 4 - Criar uma API que insira um processo usando o verbo "POST" e o objeto @RequestBody :
	//    {
	//        "sgOrgaoSetor":"SOFT",
	//        "nuProcesso" : 30,
	//        "nuAnoProcesso" : "2020",
	//        "cdAssunto" : 30,
	//        "descricaoAssunto": "Assunto teste 30 DEV In House",
	//        "decricao": "Processo teste 30 DEV In House",
	//        "cdInteressado": 30,
	//        "nmInteressado": "DEV In House"
	//     } 
		
	//TODO 5 - Criar uma API usando o verbo "PUT" para atualizar o campo "descricao" de um processo usando a @PathVariable e o objeto @RequestBody
	//    {
	//        "decricao": "Processo teste 30 DEV In House",
	//     } 
		
	//TODO 7 - Criar uma API que retorne de forme paginada utilizando a estrutura de "Query String" a listagem de processos de forma páginada usando a estratégia de cursor
	
	//TODO 8 - Criar uma API que retorne de forme paginada utilizando a estrutura de "Query String" a listagem de processos de forma páginada usando a estratégia de Page e PageSize
	
	//TODO 9 - Criar uma API que retorne de forme paginada utilizando a estrutura de "Query String" a listagem de processos de forma páginada usando a estratégia de Offset e Limit
}
