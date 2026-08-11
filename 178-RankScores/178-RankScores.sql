-- Last updated: 11/08/2026, 16:13:54
SELECT score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;