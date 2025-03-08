-- 코드를 입력하세요
SELECT users.USER_ID, users.NICKNAME, CONCAT(CITY," ", STREET_ADDRESS1,' ', STREET_ADDRESS2) AS '전체주소', CONCAT(SUBSTRING(TLNO,1,3),'-', 
                                                                                                             SUBSTRING(TLNO,4,4),'-', 
                                                                                                             SUBSTRING(TLNO,8,8)) AS '전화번호'
FROM USED_GOODS_BOARD boards
JOIN USED_GOODS_USER users ON boards.WRITER_ID = users.USER_ID
GROUP BY boards.WRITER_ID
HAVING COUNT(boards.WRITER_ID) >=3
ORDER BY users.USER_ID DESC;