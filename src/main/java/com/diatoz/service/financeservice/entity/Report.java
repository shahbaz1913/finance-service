package com.diatoz.service.financeservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "incomeStatement")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("reportedCurrency")
    private String reportedCurrency;
    @JsonProperty("grossProfit")
    private String grossProfit;
    @JsonProperty("totalRevenue")
    private String totalRevenue;
    @JsonProperty("costOfRevenue")
    private String costOfRevenue;
    @JsonProperty("costofGoodsAndServicesSold")
    private String costofGoodsAndServicesSold;
    @JsonProperty("operatingIncome")
    private String operatingIncome;
    @JsonProperty("sellingGeneralAndAdministrative")
    private String sellingGeneralAndAdministrative;
    @JsonProperty("researchAndDevelopment")
    private String researchAndDevelopment;
    @JsonProperty("operatingExpenses")
    private String operatingExpenses;
    @JsonProperty("investmentIncomeNet")
    private String investmentIncomeNet;
    @JsonProperty("netInterestIncome")
    private String netInterestIncome;
    @JsonProperty("interestIncome")
    private String interestIncome;
    @JsonProperty("interestExpense")
    private String interestExpense;
    @JsonProperty("nonInterestIncome")
    private String nonInterestIncome;
    @JsonProperty("otherNonOperatingIncome")
    private String otherNonOperatingIncome;
    @JsonProperty("depreciation")
    private String depreciation;
    @JsonProperty("depreciationAndAmortization")
    private String depreciationAndAmortization;
    @JsonProperty("incomeBeforeTax")
    private String incomeBeforeTax;
    @JsonProperty("incomeTaxExpense")
    private String incomeTaxExpense;
    @JsonProperty("interestAndDebtExpense")
    private String interestAndDebtExpense;
    @JsonProperty("netIncomeFromContinuingOperations")
    private String netIncomeFromContinuingOperations;
    @JsonProperty("comprehensiveIncomeNetOfTax")
    private String comprehensiveIncomeNetOfTax;
    @JsonProperty("ebit")
    private String ebit;
    @JsonProperty("ebitda")
    private String ebitda;
    @JsonProperty("netIncome")
    private String netIncome;
    @JsonProperty("fiscalDateEnding")
    private String fiscalDateEnding;

    public Report(int id, String symbol, String reportedCurrency, String grossProfit, String totalRevenue, String costOfRevenue, String costofGoodsAndServicesSold, String operatingIncome, String sellingGeneralAndAdministrative, String researchAndDevelopment, String operatingExpenses, String investmentIncomeNet, String netInterestIncome, String interestIncome, String interestExpense, String nonInterestIncome, String otherNonOperatingIncome, String depreciation, String depreciationAndAmortization, String incomeBeforeTax, String incomeTaxExpense, String interestAndDebtExpense, String netIncomeFromContinuingOperations, String comprehensiveIncomeNetOfTax, String ebit, String ebitda, String netIncome) {
        this.id = id;
        this.symbol = symbol;
        this.fiscalDateEnding = fiscalDateEnding;
        this.reportedCurrency = reportedCurrency;
        this.grossProfit = grossProfit;
        this.totalRevenue = totalRevenue;
        this.costOfRevenue = costOfRevenue;
        this.costofGoodsAndServicesSold = costofGoodsAndServicesSold;
        this.operatingIncome = operatingIncome;
        this.sellingGeneralAndAdministrative = sellingGeneralAndAdministrative;
        this.researchAndDevelopment = researchAndDevelopment;
        this.operatingExpenses = operatingExpenses;
        this.investmentIncomeNet = investmentIncomeNet;
        this.netInterestIncome = netInterestIncome;
        this.interestIncome = interestIncome;
        this.interestExpense = interestExpense;
        this.nonInterestIncome = nonInterestIncome;
        this.otherNonOperatingIncome = otherNonOperatingIncome;
        this.depreciation = depreciation;
        this.depreciationAndAmortization = depreciationAndAmortization;
        this.incomeBeforeTax = incomeBeforeTax;
        this.incomeTaxExpense = incomeTaxExpense;
        this.interestAndDebtExpense = interestAndDebtExpense;
        this.netIncomeFromContinuingOperations = netIncomeFromContinuingOperations;
        this.comprehensiveIncomeNetOfTax = comprehensiveIncomeNetOfTax;
        this.ebit = ebit;
        this.ebitda = ebitda;
        this.netIncome = netIncome;
    }

    public Report() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFiscalDateEnding() {
        return fiscalDateEnding;
    }

    public void setFiscalDateEnding(String fiscalDateEnding) {
        this.fiscalDateEnding = fiscalDateEnding;
    }

    public String getReportedCurrency() {
        return reportedCurrency;
    }

    public void setReportedCurrency(String reportedCurrency) {
        this.reportedCurrency = reportedCurrency;
    }

    public String getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(String grossProfit) {
        this.grossProfit = grossProfit;
    }

    public String getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public String getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(String costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public String getCostofGoodsAndServicesSold() {
        return costofGoodsAndServicesSold;
    }

    public void setCostofGoodsAndServicesSold(String costofGoodsAndServicesSold) {
        this.costofGoodsAndServicesSold = costofGoodsAndServicesSold;
    }

    public String getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(String operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public String getSellingGeneralAndAdministrative() {
        return sellingGeneralAndAdministrative;
    }

    public void setSellingGeneralAndAdministrative(String sellingGeneralAndAdministrative) {
        this.sellingGeneralAndAdministrative = sellingGeneralAndAdministrative;
    }

    public String getResearchAndDevelopment() {
        return researchAndDevelopment;
    }

    public void setResearchAndDevelopment(String researchAndDevelopment) {
        this.researchAndDevelopment = researchAndDevelopment;
    }

    public String getOperatingExpenses() {
        return operatingExpenses;
    }

    public void setOperatingExpenses(String operatingExpenses) {
        this.operatingExpenses = operatingExpenses;
    }

    public String getInvestmentIncomeNet() {
        return investmentIncomeNet;
    }

    public void setInvestmentIncomeNet(String investmentIncomeNet) {
        this.investmentIncomeNet = investmentIncomeNet;
    }

    public String getNetInterestIncome() {
        return netInterestIncome;
    }

    public void setNetInterestIncome(String netInterestIncome) {
        this.netInterestIncome = netInterestIncome;
    }

    public String getInterestIncome() {
        return interestIncome;
    }

    public void setInterestIncome(String interestIncome) {
        this.interestIncome = interestIncome;
    }

    public String getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(String interestExpense) {
        this.interestExpense = interestExpense;
    }

    public String getNonInterestIncome() {
        return nonInterestIncome;
    }

    public void setNonInterestIncome(String nonInterestIncome) {
        this.nonInterestIncome = nonInterestIncome;
    }

    public String getOtherNonOperatingIncome() {
        return otherNonOperatingIncome;
    }

    public void setOtherNonOperatingIncome(String otherNonOperatingIncome) {
        this.otherNonOperatingIncome = otherNonOperatingIncome;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
    }

    public String getDepreciationAndAmortization() {
        return depreciationAndAmortization;
    }

    public void setDepreciationAndAmortization(String depreciationAndAmortization) {
        this.depreciationAndAmortization = depreciationAndAmortization;
    }

    public String getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    public void setIncomeBeforeTax(String incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    public String getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(String incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public String getInterestAndDebtExpense() {
        return interestAndDebtExpense;
    }

    public void setInterestAndDebtExpense(String interestAndDebtExpense) {
        this.interestAndDebtExpense = interestAndDebtExpense;
    }

    public String getNetIncomeFromContinuingOperations() {
        return netIncomeFromContinuingOperations;
    }

    public void setNetIncomeFromContinuingOperations(String netIncomeFromContinuingOperations) {
        this.netIncomeFromContinuingOperations = netIncomeFromContinuingOperations;
    }

    public String getComprehensiveIncomeNetOfTax() {
        return comprehensiveIncomeNetOfTax;
    }

    public void setComprehensiveIncomeNetOfTax(String comprehensiveIncomeNetOfTax) {
        this.comprehensiveIncomeNetOfTax = comprehensiveIncomeNetOfTax;
    }

    public String getEbit() {
        return ebit;
    }

    public void setEbit(String ebit) {
        this.ebit = ebit;
    }

    public String getEbitda() {
        return ebitda;
    }

    public void setEbitda(String ebitda) {
        this.ebitda = ebitda;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }
}
