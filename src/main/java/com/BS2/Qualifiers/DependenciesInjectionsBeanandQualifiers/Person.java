package com.BS2.Qualifiers.DependenciesInjectionsBeanandQualifiers;


import lombok.Data;

@Data
public class Person {
    String name;

    @Override
    public String toString(){
        return name;
    }
}
