CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE client (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL, 
    cpf VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    sales_id UUID,
    FOREIGN KEY (sales_id) REFERENCES sales(id)
)



