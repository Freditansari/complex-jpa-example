package com.merdekacloud.jobBoard.Repositories;

import com.merdekacloud.jobBoard.Models.ProjectTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectTeamRepository extends JpaRepository<ProjectTeam, Long> {
}
