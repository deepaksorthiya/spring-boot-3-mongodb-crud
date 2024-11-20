package io.github.deepaksorthiya.dto;

public record PopularDTO(String id, int totalQuantity) {
    public PopularDTO(String id, int totalQuantity) {
        this.id = id;
        this.totalQuantity = totalQuantity;
    }
}
