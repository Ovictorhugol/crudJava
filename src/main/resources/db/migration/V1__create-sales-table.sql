CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE sales (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    sale_description VARCHAR(255) NOT NULL, 
    sale_price FLOAT NOT NULL, 
    sale_date TIMESTAMP
    
);

