package com.diatoz.service.financeservice.repository;

import com.diatoz.service.financeservice.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeStatementRepo extends JpaRepository<Report, Integer> {
}
