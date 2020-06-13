package com.merdekacloud.jobBoard.Models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="projectTeams")
public class ProjectTeam {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name ="projectTeam_id", unique = true, nullable = false)
    private Long projectTeam_id;

    private String name;

    @Email
    private String email;
}
