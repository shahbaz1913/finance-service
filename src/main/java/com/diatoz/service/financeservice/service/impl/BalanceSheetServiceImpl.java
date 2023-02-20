package com.diatoz.service.financeservice.service.impl;

import com.diatoz.service.financeservice.entity.Report;
import com.diatoz.service.financeservice.entity.Response;
import com.diatoz.service.financeservice.repository.IncomeStatementRepo;
import com.diatoz.service.financeservice.repository.UserRepo;
import com.diatoz.service.financeservice.service.BalanceSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class BalanceSheetServiceImpl implements BalanceSheetService {
    @Autowired
    IncomeStatementRepo incomeStatementRepo;
    @Autowired
    UserRepo userRepo;
    @Value("${apikey}")
    String api;
    @Value("${balanceSheet}")
    String url;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity retrieveBalanceSheet(String function, String symbol) {
        //TODO: Read value from application properties

        ResponseEntity<Response> responseEntity;
        try {

            responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Response.class, function, symbol, api);
            List<Report> reports = new ArrayList<>();
            for (int i = 0; i < responseEntity.getBody().getAnnualReports().size(); i++) {
                Report report1 = responseEntity.getBody().getAnnualReports().get(i);
                report1.setSymbol(symbol);
                reports.add(report1);
            }

            for (int i = 0; i < responseEntity.getBody().getQuarterlyReports().size(); i++) {
                Report report1 = responseEntity.getBody().getQuarterlyReports().get(i);
                report1.setSymbol(symbol);
                reports.add(report1);
            }
            insertAll(reports);

            return responseEntity;
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity("Error", HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public void insertAll(List<Report> report) {
        this.incomeStatementRepo.saveAll(report);

    }

}
