package oit.is.z1976.fgo.fgo.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import oit.is.z1976.fgo.fgo.model.SkillsMapper;
import oit.is.z1976.fgo.fgo.model.Skills;
import oit.is.z1976.fgo.fgo.model.SkillEnhanceMapper;
import oit.is.z1976.fgo.fgo.model.MaterialsMapper;
import oit.is.z1976.fgo.fgo.model.Materials;
import oit.is.z1976.fgo.fgo.model.ServantsMapper;
import oit.is.z1976.fgo.fgo.model.Servants;

@Controller
public class IndexController {
  @Autowired
  SkillsMapper SkMapper;

  @Autowired
  ServantsMapper SeMapper;

  @Autowired
  MaterialsMapper MMapper;

  @Autowired
  SkillEnhanceMapper SKEMapper;

  @GetMapping("/mainroom")
  public String mainroom(ModelMap model, Principal prin) {
    Skills skills = SkMapper.selectSkills();
    Servants ser = SeMapper.selectservant();

    ArrayList<Materials> ma = SKEMapper.selectRequMateBy(
        skills.getSkill1(), skills.getSkill2(), skills.getSkill3(),
        skills.getAskill1(), skills.getAskill2(), skills.getAskill3(), 1);

    System.out.println("確認2");
    for (Materials material : ma) {
      System.out.println("Name: " + material.getName() + ", Amount: " + material.getAmount());
    }

    model.addAttribute("ma", ma);
    model.addAttribute("skills", skills);
    model.addAttribute("ser", ser);
    return "mainroom.html";
  }
}
