package aans.leaf.service;

import aans.pojo.Dept;
import aans.repo.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private DeptRepository deptRepository;

    public List<Dept> getDeptAll() {
        return deptRepository.findAll();
    }
}
