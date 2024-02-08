package oit.is.z1976.fgo.fgo.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ServantsMapper {

  @Select("select servant_id, servants.name, rare, class.name, stage from servants join class using (class_id) where servant_id = #{servant_id}")
  Servants selectservantbyid(int servant_id);

  @Select("select servant_id, servants.name, rare, class.name, stage from servants join class using (class_id)")
  Servants selectservant();
}
