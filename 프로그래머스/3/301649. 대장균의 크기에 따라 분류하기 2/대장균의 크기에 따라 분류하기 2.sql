-- 코드를 작성해주세요
SELECT ID, CASE
WHEN a.PER <= 0.25 THEN 'CRITICAL'
WHEN 0.25 < a.PER and a.PER <=0.5 THEN 'HIGH'
WHEN 0.5 < a.PER and a.PER<=0.75 THEN 'MEDIUM'
WHEN 0.75 < a.PER THEN 'LOW'
END AS COLONY_NAME
FROM (
    SELECT ID,
    PERCENT_RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) AS PER
    FROM ECOLI_DATA
) AS a
ORDER BY ID