package com.digitalinovacionone.springapi_client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private Long id;
    private String name;
    private String telefone;
}
