package com.tacocloud;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
}
