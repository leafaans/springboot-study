package aans.leaf.controller;

//import aans.leaf.domain.Dept;
//import aans.leaf.domain.repo.DeptRepository;
import aans.leaf.service.TestService;
import aans.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/getDeptAll")
    public List<Dept> getDeptAll(HttpServletRequest request) {
        return testService.getDeptAll();
    }

}
