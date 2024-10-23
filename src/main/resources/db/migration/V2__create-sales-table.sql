CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE sales (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    saleDescription VARCHAR(255) NOT NULL, 
    salePrice FLOAT NOT NULL, 
    saleDate TIMESTAMP
    
);

