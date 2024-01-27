CREATE TABLE Servants (
  servant_id INT NOT NULL,
  name VARCHAR NOT NULL,
  class_id INT NOT NULL
);

CREATE TABLE Class (
  class_id INT NOT NULL,
  name VARCHAR NOT NULL
);

CREATE TABLE Materials (
  material_id INT NOT NULL,
  name VARCHAR NOT NULL
);

CREATE TABLE AscesionRequirements (
  servant_id INT NOT NULL,
  material_id INT NOT NULL,
  quantity INT NOT NULL,
  ascension_stage INT NOT NULL
);

CREATE TABLE Skills(
  servant_id INT NOT NULL,
  skill1 INT NOT NULL,
  skill2 INT NOT NULL,
  skill3 INT NOT NULL,
  askill1 INT NOT NULL,
  askill2 INT NOT NULL,
  askill3 INT NOT NULL
);

CREATE TABLE SkillEnhancementRequirements (
  servant_id INT NOT NULL,
  enhancement_stage INT NOT NULL,
  material_id INT NOT NULL,
  quantity INT NOT NULL
);
