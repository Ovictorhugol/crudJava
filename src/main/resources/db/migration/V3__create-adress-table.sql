CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE client (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL, 
    cpf VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    adress_id UUID,
    FOREIGN KEY (adress_id) REFERENCES adress(id),
    sales_id UUID,
    FOREIGN KEY (sales_id) REFERENCES sales(id)
)



   