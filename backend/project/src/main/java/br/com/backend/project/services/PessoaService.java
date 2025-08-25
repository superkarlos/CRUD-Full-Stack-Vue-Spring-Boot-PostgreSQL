package br.com.backend.project.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.project.dto.PessoaDto;
import br.com.backend.project.model.PessoaEntity;
import br.com.backend.project.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaDto save(PessoaDto data) {
        PessoaEntity pessoaEntity = new PessoaEntity();
        BeanUtils.copyProperties(data, pessoaEntity);
        pessoaRepository.save(pessoaEntity);
        return data;
    }

    public List<PessoaDto> getall() {
        List<PessoaEntity> data = pessoaRepository.findAll();
        return data.stream()
                .map(entity -> {
                    PessoaDto dto = new PessoaDto();
                    BeanUtils.copyProperties(entity, dto);
                    return dto;
                }).toList();
    }

}
