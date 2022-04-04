package aans.leaf.service;

import aans.pojo.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestServiceTest {

    @Autowired
    TestService testService;

    @Test
    public void getDeptAll() {
        List<Dept> deptList = testService.getDeptAll();
        deptList.stream().forEach(dept -> System.out.println(dept.toString()));
    }
}
