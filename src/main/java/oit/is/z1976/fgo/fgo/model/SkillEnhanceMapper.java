package oit.is.z1976.fgo.fgo.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SkillEnhanceMapper {
  @Select("Select name, sum(quantity) amount FROM(SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage1} AND servant_id = #{servant_id} union all SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage2} AND servant_id = #{servant_id} union all SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage3} AND servant_id = #{servant_id} union all SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage4} AND servant_id = #{servant_id} union all SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage5} AND servant_id = #{servant_id} union all SELECT name, quantity FROM SKILLENHANCEMENTREQUIREMENTS join Materials using (material_id) where ENHANCEMENT_STAGE >= #{stage6} AND servant_id = #{servant_id}) group by name")
  ArrayList<Materials> selectRequMateBy(int stage1, int stage2, int stage3, int stage4, int stage5, int stage6,
      int servant_id);
}
