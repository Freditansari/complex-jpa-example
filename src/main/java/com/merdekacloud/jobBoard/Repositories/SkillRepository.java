package com.merdekacloud.jobBoard.Repositories;

import com.merdekacloud.jobBoard.Models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
