package oit.is.z1976.fgo.fgo.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SkillsMapper {
  @Select("SELECT * from skills where servant_id = #{servant_id}")
  Skills selectSkillsbyid(int servant_id);

  @Select("SELECT * from skills")
  Skills selectSkills();
}
