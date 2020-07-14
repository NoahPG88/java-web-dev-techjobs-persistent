## Part 1: Test it with SQL
--Query
select DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = "job" and column_name = "id"
--Answer
"int"

--Queries
select DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = "job" and column_name = "employer";

select DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = "job" and column_name = "name";

select DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = "job" and column_name = "skill";
--Answers
"VARCHAR"

## Part 2: Test it with SQL
SELECT * FROM techjobs.employer where location = "St. Louis";

--AFTER THIS POINT techjobs2 was used as the database schema
## Part 3: Test it with SQL
DROP TABLE `techjobs2`.`job`;

## Part 4: Test it with SQL
SELECT skill.name, skill.description FROM techjobs2.skill
INNER JOIN techjobs2.job_skills on techjobs2.skill.id = techjobs2.job_skills.skills_id
ORDER BY name