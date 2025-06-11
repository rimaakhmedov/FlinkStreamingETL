package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class SalesPerMonth {
    private int year;
    private int month;
    private double totalSales;

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public SalesPerMonth(int year, int month, double totalSales) {
        this.year = year;
        this.month = month;
        this.totalSales = totalSales;
    }
}