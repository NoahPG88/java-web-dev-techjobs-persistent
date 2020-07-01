package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.launchcode.javawebdevtechjobspersistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("skills")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    //do we need display methods?
    @GetMapping("add")
    public String displayAddEmployerForm(Model model) {
        model.addAttribute(new Skill());
        return "employers/add";
    }

    //postmapping so that skills can be displayed in checkboxes - no location for the add link to go to yet.  Should it be here or in EmployerController?


    @PostMapping("add")
    public String processAddEmployerForm(@ModelAttribute @Valid Skill newSkill,
                                         Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "employers/add";
        }
        skillRepository.save(newSkill);
        return "redirect:";
    }

    //GetMapping to view add skills page?
}
