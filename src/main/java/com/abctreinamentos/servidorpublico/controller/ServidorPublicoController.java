package com.abctreinamentos.servidorpublico.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abctreinamentos.servidorpublico.model.ServidorPublico;
import com.abctreinamentos.servidorpublico.service.ServidorPublicoService;

@RestController
@RequestMapping("/api/servidores")
@CrossOrigin(origins = "*")
public class ServidorPublicoController {

	private ServidorPublicoService servidorService;

	@Autowired
	public void setServidorPublicoService(ServidorPublicoService servidorService) {
		this.servidorService = servidorService;
	}

	@GetMapping("/listAll")
	public ResponseEntity<List<ServidorPublico>> listAll() {
		List<ServidorPublico> servidorespublicos = servidorService.listAll();
		return ResponseEntity.ok(servidorespublicos);
	}

	@GetMapping("/list/{matricula}")
	public ResponseEntity<?> listByMatricula(@PathVariable Long matricula) {
		Optional<ServidorPublico> servidorEncontrado = servidorService.listByMatricula(matricula);
		if (servidorEncontrado.isPresent()) {
			return ResponseEntity.ok(servidorEncontrado.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servidor com matrícula " + matricula + " não encontrado.");
		}
	}
}