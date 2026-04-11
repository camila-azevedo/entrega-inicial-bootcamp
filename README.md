<h2>INSTRUÇÕES DE COMO INSTALAR E USAR A APLICAÇÃO </h2>

1. Configurando o Banco de Dados:
É necessário criar os seguintes elementos no banco de dados do SGBD PostgreSQL: 
banco de dados: db_compras;
schema: compras;
tabela: tb_produtos;
atributos: id_produto, nome_produto, qtd_produto;
Porém, antes de rodar o projeto, abra o arquivo src/main/resources/application.properties e altere as seguintes linhas com o seu usuário e senha do PostgreSQL local:
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

2. Clonando o repositório:
Abra o terminal da IDE escolhida e digite:
git clone https://github.com/camila-azevedo/entrega-inicial-bootcamp;

3. Executando a Aplicação:
Acesse sua IDE de preferência;
Clique no ícone de executar a aplicação;

4. Acessando a Interface:
Abra o seu navegador de preferência;
Digite a URL http://localhost:8080/index.html;
A interface gráfica da sua lista de compras aparecerá e você poderá adicionar, editar ou excluir itens.

5. Rodando os testes:
Via terminal, digite: .\mvnw test;
Ou, pelo IntelliJ, clique com o botão direito na pasta src/test/java e selecione a opção "Run 'All Tests'";

6. Rodando os Testes de Linting:
Digite no terminal o comando .\mvnw checkstyle:check
Se o resultado for BUILD SUCCESS, o linting validou que o código segue os padrões de formatação;
No arquivo pom.xml, dentro da tag <plugins>, o maven-checkstyle-plugin está declarado;

7. Verificando a versão atual:
A versão do projeto é controlada via Maven e está refletida na interface do usuário;
A versão é 1.0.;

8. Verificando as dependências:
As dependências do projeto estão formalmente declaradas e gerenciadas através do arquivo pom.xml dentro da tag <dependencies>;
Dependências presente são: 
spring-boot-starter-web
spring-boot-starter-data-jpa
postgresql
spring-boot-starter-test


9. Verificando os workflows
Acesse a aba “Actions” no repositório do GitHub


<h2>INSTRUÇÕES DE USO</h2>
1. Digite o nome do produto e a quantidade; </br>
2. Pressione “adicionar”; </br>
3. Verifique a lista com os produtos já cadastrados. </br> 

