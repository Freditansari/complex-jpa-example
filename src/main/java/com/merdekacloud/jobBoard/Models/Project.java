package com.merdekacloud.jobBoard.Models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="projects")
public class Project {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name ="project_id", unique = true, nullable = false)
    private Long project_id;

    private String projectName;

    @Column(columnDefinition = "TEXT")
    private String projectBriefs;

    @Enumerated(EnumType.STRING)
    private Currency projectCurrency;

    private BigDecimal fixedPrice;
    private BigDecimal hourlyRate;

    @CreationTimestamp
    private Timestamp datePosted;
    private ZonedDateTime deadlineDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> projectRequiredSkills;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name ="project_id")
    private List<ProjectTeam> projectTeams;





    /**
     * currency
     * fixedPrice
     * project price
     * datePosted
     * deadline date
     *
     * skills
     */
}
