package aans.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import aans.pojo.Dept;

import java.util.Optional;

@SpringBootTest
public class DeptRepositoryTest {

    @Autowired
    DeptRepository deptRepository;

    @Test
    public void findByIdTest() {
        Optional<Dept> optional = deptRepository.findById(1L);
        Assertions.assertNotNull(optional.get());
        Dept dept = optional.get();
        Assertions.assertEquals("开发部", dept.getDeptName());
    }
}
