-- Drop the view if it exists
DROP VIEW IF EXISTS vw_season_matches;

-- Create the view with the specified query
CREATE ALGORITHM=UNDEFINED DEFINER=`ladderuser`@`%` SQL SECURITY DEFINER VIEW `vw_season_matches` AS
SELECT
    T1.season_id,
    T1.match_date,
    CONCAT(T2.first_name, ' ', T2.last_name) AS winner,
    CONCAT(T3.first_name, ' ', T3.last_name) AS loser,
    T1.set1_score,
    T1.set2_score,
    T1.set3_score
FROM
    matches T1
        INNER JOIN players T2 ON T1.winner_id = T2.player_id
        INNER JOIN players T3 ON T1.loser_id = T3.player_id;