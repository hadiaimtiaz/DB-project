select database();
-- use reservationsystem;
-- SELECT doctor_id, name, email, contact_info, rating FROM doctor WHERE doctor_id = 3;
-- INSERT INTO `users` (user_id,name, password) VALUES (2,"hadia","pass123")
-- INSERT INTO `patient` (patient_id,user_id,name, contact_info,address) VALUES (3,2,"hadia","number123","Islamabad")
-- select * from users;
-- select * from experience;
-- delete from experience where experience_id=16;
-- select * from specialization
-- select * from doctor;
-- select * from location;
-- SELECT doctor.name
-- FROM doctor
-- JOIN specialization ON doctor.doctor_id = specialization.doctor_id
-- JOIN location ON doctor.doctor_id = location.doctor_id
-- WHERE specialization.name = 'Cardiologists' AND location.city = 'Lahore';

-- select * from schedule;
-- delete from schedule where schedule_id=16;
-- update specialization set doctor_id=2 where specialization_id=2;
-- update schedule set doctor_id=3 where schedule_id=2;
-- update location set doctor_id=3 where location_id=2;
-- select * from medical_record;
-- update medical_record set patient_id=3 where medical_record_id=2;
-- select * from medication;
-- update medication set patient_id=3 where medication_id=2;
-- select * from past_consultation;
-- select name from patient;
-- select * from appointment;
-- INSERT INTO appointment (appointment_id,patient_id, doctor_id,consultation_date,consultation_time,status) VALUES
-- (6, 1, 3, "2024-12-1", "12:30:00","requested")
-- DELETE FROM `doctor`
-- WHERE `name` = 'hadia';
-- select * from medical_record;
-- select * from medication;
-- select * from past_consultation;
-- update past_consultation set medication_id=2 where consultation_id=1;
--  SET SQL_SAFE_UPDATES = 1;
-- update experience set doctor_id=3 where experience_id=1;
-- SELECT 
--     a.appointment_id, 
--     d.name AS doctor_name, 
--     a.consultation_date, 
--     a.consultation_time, 
--     a.status, 
--     pc.advice, 
--     m.tablet_title, 
--     m.quantity, 
--     m.timing, 
--     m.usage_instructions
-- FROM 
--     appointment a
-- JOIN 
--     patient p ON a.patient_id = p.patient_id
-- JOIN 
--     doctor d ON a.doctor_id = d.doctor_id
-- LEFT JOIN 
--     past_consultation pc ON pc.appointment_id = a.appointment_id AND pc.patient_id = a.patient_id
-- LEFT JOIN 
--     medication m ON m.patient_id = p.patient_id
-- WHERE 
--     p.name = "hadia"
-- ORDER BY 
--     a.consultation_date DESC;

-- update past_consultation set
-- appointment_id=7 where patient_id=3;
-- delete from payment where payment_id=3;


SELECT doctor.name 
                     FROM doctor 
                     JOIN specialization ON doctor.doctor_id = specialization.doctor_id 
                     JOIN location ON doctor.doctor_id = location.doctor_id 
                     WHERE doctor.name=`neha` AND specialization.name = ? AND location.city = ?;




