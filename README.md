# Processo seletivo XLSWeb

## Setup

- <h3>java version 20.0.2</h3>
- <h3>PostgreSQL 15</h3>

Basta rodar a classe principal CrudAplication:<br>

```java
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
```

# Cliente | localhost:8080/client<br>

## O formato do JSON para o cliente é o seguinte:

```JSON
{
"id": "090ebdcd-014f-420a-b93d-0f7d3dd7e419",
"name": "teste",
"cpf": "12312312315",
"email": "teste@teste.com",
"phonenumber": "35985695478",
"salesId": null
}
```

- Para o PUT é necessário passar o id como parâmetro da requisição<br>
  localhost:8080/client/9b35423c-915b-4df2-b10c-2972d42cf50f

- Para o GET não é necessário passar nada no corpo da requisição<br>

- Para o de DELETE não é necessario nada no corpo da requisição

## E o JSON para requisições como POST e PUT é o seguinte:

```JSON
{
"name": "teste5",
"cpf": "12312312315",
"email": "teste@teste.com",
"phonenumber": "35985695478"
}
```

# Venda | localhost:8080/sales<br>

## O formato do JSON para venda é o seguinte:

```JSON
{
    "id": "9b35423c-915b-4df2-b10c-2972d42cf50f",
    "saleDescription": "teste",
    "saleDate": "2024-10-24T00:54:06.127+00:00",
    "salePrice": 1151.54
}
```

- Para o PUT é necessário passar o id como parâmetro da requisição:<br>
  localhost:8080/sales/9b35423c-915b-4df2-b10c-2972d42cf50f

- Para o GET não é necessário passar nada no corpo da requisição<br>

- Para o de DELETE não é necessario nada no corpo da requisição

## E o JSON para requisições como POST e PUT é o seguinte:

```JSON
	{
    "saleDescription": "teste",
    "salePrice": 1151.54
	}
```
