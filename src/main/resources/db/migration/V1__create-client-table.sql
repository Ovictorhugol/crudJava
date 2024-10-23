CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE adress (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    city VARCHAR(255) NOT NULL, 
    uf VARCHAR(2) NOT NULL
    
);



   