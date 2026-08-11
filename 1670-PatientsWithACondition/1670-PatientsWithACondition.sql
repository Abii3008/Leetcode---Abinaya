-- Last updated: 11/08/2026, 16:04:40
# Write your MySQL query statement below
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'