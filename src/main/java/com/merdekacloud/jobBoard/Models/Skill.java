package com.merdekacloud.jobBoard.Models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name ="skills")
public class Skill {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skill_id;

    private String skill;
}
