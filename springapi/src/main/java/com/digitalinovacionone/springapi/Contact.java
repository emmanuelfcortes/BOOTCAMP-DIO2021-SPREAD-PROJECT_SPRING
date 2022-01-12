package com.digitalinovacionone.springapi;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Contact {
    private Long id;
    private String name;
    private String telefone;
}
