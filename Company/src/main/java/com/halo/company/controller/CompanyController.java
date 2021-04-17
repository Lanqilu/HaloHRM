package com.halo.company.controller;

import com.halo.common.entity.Result;
import com.halo.common.entity.ResultCode;
import com.halo.common.exception.CommonException;
import com.halo.company.service.CompanyService;
import com.halo.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Halo
 * @date Created in 2021/04/17 5:07 PM
 * @description
 */
@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     * 保存企业
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result save(@RequestBody Company company) {
        companyService.add(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id更新企业
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id") String id, @RequestBody Company company) {
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id删除企业
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id") String id) {
        companyService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据id查询企业
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "id") String id) {
        Company company = companyService.findById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }

    /**
     * 查询全部企业
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findAll() {
        List<Company> all = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(all);
        return result;
    }

    /**
     * 异常测试
     */
    @RequestMapping(value = "/exception1", method = RequestMethod.GET)
    public Result exception1() {
        int i = 1 / 0;
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/exception2", method = RequestMethod.GET)
    public Result exception2() throws CommonException {
        throw new CommonException(ResultCode.UNAUTHORISE);
    }

}
