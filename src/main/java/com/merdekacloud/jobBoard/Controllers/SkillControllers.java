package com.merdekacloud.jobBoard.Controllers;

import com.merdekacloud.jobBoard.Models.Skill;
import com.merdekacloud.jobBoard.Repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillControllers {
    @Autowired
    SkillRepository skillRepository;

    @GetMapping("/skills")
    public List<Skill> getAllSkills(){
        return skillRepository.findAll();
    }

    @PostMapping("/skills")
    public Skill addSkill(@RequestBody Skill skill){
        return skillRepository.save(skill);
    }


}
