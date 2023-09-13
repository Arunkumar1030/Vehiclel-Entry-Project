package com.Project.ProjectBackend.MrcRepo;

import com.Project.ProjectBackend.entity.Mrc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface MrcRepo extends JpaRepository<Mrc,Integer> {
}
