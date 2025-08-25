package br.com.backend.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.NativeQuery.ReturnProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.project.dto.PessoaDto;
import br.com.backend.project.services.PessoaService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// libera o frontend Vue (porta do Vite)
@RestController
@RequestMapping("/api/pessoas")
@CrossOrigin(origins = "http://localhost:3000") // libera o frontend Vue (porta do Vite)
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/listar")
    public ResponseEntity<List<PessoaDto>> getAll() {
        return ResponseEntity.ok().body(pessoaService.getall());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<PessoaDto> salvar(@Valid @RequestBody PessoaDto pessoa) {
        try {
            return ResponseEntity.ok(pessoaService.save(pessoa));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(pessoa);
        }

    }
}
