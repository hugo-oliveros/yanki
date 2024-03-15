package com.pe.nttdata.commons;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum ProductoEnum {

    VIP("VIP"),
    PYME("PYME");

    private String value;

    ProductoEnum(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProductoEnum fromValue(String value) {
        for (ProductoEnum e : ProductoEnum.values()) {
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
