package com.jobapp.first.company;

import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {

    public List<Company> getAllCompanies();
    public boolean updateCompany(Company company, Long id);
    public void createCompany(Company company);
    public boolean deleteCompanyById(Long id);
    public Company getCompanyById(Long id);

}
