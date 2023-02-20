package com.diatoz.service.financeservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public class Response {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("annualReports")
    private List<Report> annualReports;
    @JsonProperty("quarterlyReports")
    private List<Report> quarterlyReports;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<Report> getAnnualReports() {
        return annualReports;
    }

    public void setAnnualReports(List<Report> annualReports) {
        this.annualReports = annualReports;
    }

    public List<Report> getQuarterlyReports() {
        return quarterlyReports;
    }

    public void setQuarterlyReports(List<Report> quarterlyReports) {
        this.quarterlyReports = quarterlyReports;
    }
}
