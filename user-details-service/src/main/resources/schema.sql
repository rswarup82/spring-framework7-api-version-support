CREATE TABLE IF NOT EXISTS users (
    id INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email_addr VARCHAR(50),
    phone_number VARCHAR(50),
    primary key(id)
);