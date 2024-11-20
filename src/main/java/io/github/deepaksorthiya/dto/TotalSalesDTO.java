package io.github.deepaksorthiya.dto;

public record TotalSalesDTO(String id, int totalSales) {
    public TotalSalesDTO(String id, int totalSales) {
        this.id = id;
        this.totalSales = totalSales;
    }
}
