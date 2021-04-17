package com.halo.company.dao;

import com.halo.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Halo
 * @date Created in 2021/04/17 4:31 PM
 * @description
 */
public interface CompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {
    // JpaRepository<实体类的类型,主键属性的类型>
    // JpaSpecificationExecutor<实体类的类型>
}
