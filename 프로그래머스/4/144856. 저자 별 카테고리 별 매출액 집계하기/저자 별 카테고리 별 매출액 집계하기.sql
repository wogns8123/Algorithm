SELECT
    A.AUTHOR_ID,
    A.AUTHOR_NAME,
    B.CATEGORY,
    SUM(BS.SALES * B.PRICE) AS TOTAL_SALES -- 매출액 계산: 판매량 * 판매가
FROM
    BOOK_SALES BS
JOIN
    BOOK B ON BS.BOOK_ID = B.BOOK_ID
JOIN
    AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE
    BS.SALES_DATE BETWEEN '2022-01-01' AND '2022-01-31' -- 2022년 1월 데이터만 필터링
GROUP BY
    A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY -- 저자 ID, 저자명, 카테고리 별로 그룹화
ORDER BY
    A.AUTHOR_ID ASC, -- 저자 ID 오름차순
    B.CATEGORY DESC; -- 카테고리 내림차순 (예시에서는 인문, 경제 순서인데, 이는 ASC일 수도 DESC일 수도 있습니다. 문제 설명에 '카테고리를 내림차순'이라고 되어 있다면 DESC가 맞습니다.)