package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
public class SalesPerCategory {
    private Date transactionDate;
    private String category;
    private Double totalSales;

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public SalesPerCategory(Date transactionDate, String category, Double totalSales) {
        this.transactionDate = transactionDate;
        this.category = category;
        this.totalSales = totalSales;
    }
}