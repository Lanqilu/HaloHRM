package com.halo.company;

import com.halo.company.dao.CompanyDao;
import com.halo.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

/**
 * @author Halo
 * @date Created in 2021/04/17 4:35 PM
 * @description
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test() {
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}
