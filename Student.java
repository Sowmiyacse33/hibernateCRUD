CREATE TABLE Students (
student_id INT PRIMARY KEY,
student_name VARCHAR(50) ,
student_age VARCHAR(50) ,
student_phone_number VARCHAR(15) ,
student_address VARCHAR(50)
);
INSERT INTO Students (student_id, student_name, student_age,
student_phone_number, student_address) VALUES
(101, ‘Alice’, 20, 4244656690, ‘Madurai’),
(102, ‘Bob’, 21, 2244870690, ‘Selam’),
(103, ‘John’, 20, 4334653690, ‘Chennai’),
(104, ‘Mary’, 19, 3844656890, ‘Pune’),
(105, ‘Rose’, 22, 4254656790, ‘Ooty’);
