package aans.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aans.pojo.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
}
