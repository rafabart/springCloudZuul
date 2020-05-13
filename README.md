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

1- springEurekaRegister -> Servidor de registro das aplicações;
2- springApiProduct -> API para listar produtos;
3- springApiCustomer -> API para listar usuários;
4- springZuul -> Api para fazer o roteamento dinâmico entre as APIs acima;
(Subir as aplicações na ordem acima)


<p>1)Eureka Endpoint</p>
Exibe a saúde das aplicaçes:

URL(GET): http://localhost:8761/


<p>2)Zuul Products Endpoint</p>

URL(GET): http://localhost:8080/api/products

<p>2)Zuul Customers Endpoint</p>

URL(GET): http://localhost:8080/api/customers
