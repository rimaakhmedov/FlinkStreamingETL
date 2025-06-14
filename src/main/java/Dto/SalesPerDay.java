package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
public class SalesPerDay {
    private Date transactionDate;
    private Double totalSales ;

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public SalesPerDay(Date transactionDate, Double totalSales) {
        this.transactionDate = transactionDate;
        this.totalSales = totalSales;
    }
}