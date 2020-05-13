Poc de cache com Spring Cloud, Eureka e Zuul.

Usando:

* JDK 8
* Springboot 2.2.1
* IntelliJ
* Rest
* Lombok
* Gradle
* Cloud
* Eureka
* Zuul


O Projeto consiste em subir quantro aplicações rest, sendo elas:
```
1- springEurekaRegister -> Servidor de registro das aplicações;
2- springApiProduct -> API para listar produtos;
3- springApiCustomer -> API para listar usuários;
4- springZuul -> Api para fazer o roteamento dinâmico entre as APIs acima;
```
(Subir as aplicações na ordem acima)


<p>1)Eureka Endpoint</p>
Exibe a saúde das aplicaçes:

URL(GET): http://localhost:8761/


<p>2)Zuul Products Endpoint - Lista os produtos</p>

URL(GET): http://localhost:8080/api/products

<p>3)Zuul Customers Endpoint - Lista os usuários</p>

URL(GET): http://localhost:8080/api/customers


Os endpoints de listagem de produtos e usuários são da aplicação de roteamento(Zuul), que recebe as requisições e as
redireciona para as aplicações customers e products. Sempre de forma dinâmica.
