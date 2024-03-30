CREATE TABLE employee (
                          employee_id INT AUTO_INCREMENT PRIMARY KEY,
                          user_name VARCHAR(255),
                          email VARCHAR(255),
                          password VARCHAR(1000)
);

INSERT INTO employee (employee_id, user_name, email, password) VALUES (1, 'John Doe', 'john@example.com', 'password123');
INSERT INTO employee (employee_id, user_name, email, password) VALUES (2, 'Jane Smith', 'jane@example.com', 'password456');
INSERT INTO employee (employee_id, user_name, email, password) VALUES (3, 'Alice Johnson', 'alice@example.com', 'password789');

