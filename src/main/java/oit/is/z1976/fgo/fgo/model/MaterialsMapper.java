package oit.is.z1976.fgo.fgo.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MaterialsMapper {

  @Select("select name, 0 amount from Materials where material_id = #{material_id}")
  Materials selectMaterialsByid(int material_id);

  @Select("select name, 0 amount from Materials")
  ArrayList<Materials> selectMaterials();
}
