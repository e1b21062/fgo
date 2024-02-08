package oit.is.z1976.fgo.fgo.model;

public class Servants {
  int servant_id;
  String name;
  int rare;
  String classname;
  int stage;

  public int getServantId() {
    return servant_id;
  }

  public String getName() {
    return name;
  }

  public int getRare() {
    return rare;
  }

  public String getClassname() {
    return classname;
  }

  public int getStage() {
    return stage;
  }

  public void setServantId(int servant_id) {
    this.servant_id = servant_id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRare(int rare) {
    this.rare = rare;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }

  public void setStage(int stage) {
    this.stage = stage;
  }

}
