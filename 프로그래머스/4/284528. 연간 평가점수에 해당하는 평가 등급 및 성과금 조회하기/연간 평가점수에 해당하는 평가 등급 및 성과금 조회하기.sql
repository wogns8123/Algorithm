WITH PERFORMANCE_BONUS AS (
    SELECT EMP_NO, AVG(SCORE),
    CASE WHEN AVG(SCORE) >= 96 THEN "S"
         WHEN AVG(SCORE) >= 90 THEN "A"
         WHEN AVG(SCORE) >= 80 THEN "B"
         ELSE "C"
    END AS GRADE,
    CASE WHEN AVG(SCORE) >= 96 THEN 0.2
         WHEN AVG(SCORE) >= 90 THEN 0.15
         WHEN AVG(SCORE) >= 80 THEN 0.1
         ELSE 0
    END AS BONUS
    FROM HR_GRADE 
    GROUP BY EMP_NO
)


SELECT employees.EMP_NO, employees.EMP_NAME, bonus.GRADE, bonus.BONUS * employees.SAL AS BONUS
FROM HR_EMPLOYEES employees
JOIN performance_bonus bonus ON employees.EMP_NO = bonus.EMP_NO
ORDER BY employees.EMP_NO;
