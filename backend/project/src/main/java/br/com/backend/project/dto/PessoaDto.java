package br.com.backend.project.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotNull(message = "A idade é obrigatória")
    @Min(value = 1, message = "A idade deve ser maior que zero")
    private Integer idade;
}
