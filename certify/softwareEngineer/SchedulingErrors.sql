-- Solution to HackerRank Software Engineer Certify SQL question "Scheduling Errors"

SELECT DISTINCT p.name AS Professor_Name, c.name AS Course_Name
FROM Professor AS p
JOIN schedule AS s ON p.id = s.professor_id
JOIN Course AS c ON s.course_id = c.id
WHERE p.department_id <> c.department_id;