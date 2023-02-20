package com.diatoz.service.financeservice.service;

import com.diatoz.service.financeservice.entity.Report;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BalanceSheetService {

    ResponseEntity retrieveBalanceSheet(String function, String symbol);

    void insertAll(List<Report> report);


}
