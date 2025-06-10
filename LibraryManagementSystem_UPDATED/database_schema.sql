CREATE DATABASE IF NOT EXISTS library;
USE library;

CREATE TABLE IF NOT EXISTS books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isIssued BOOLEAN DEFAULT FALSE
);

INSERT INTO books (title, author, isIssued) VALUES
('Java Programming', 'John Doe', FALSE),
('Database Systems', 'Jane Smith', TRUE),
('Data Structures', 'Alan Turing', FALSE);