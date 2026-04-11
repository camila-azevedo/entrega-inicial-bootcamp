<h2>INSTRUÇÕES DE COMO INSTALAR E USAR A APLICAÇÃO </h2>

1. Configurando o Banco de Dados:</br>
- É necessário criar os seguintes elementos no banco de dados do SGBD PostgreSQL: </br>
    - banco de dados: db_compras;</br>
    - schema: compras;</br>
    - tabela: tb_produtos;</br>
    - atributos: id_produto, nome_produto, qtd_produto;</br>
- Porém, antes de rodar o projeto, abra o arquivo src/main/resources/application.properties e altere as seguintes linhas com o seu usuário e senha do PostgreSQL local:</br>
    - spring.datasource.username=seu_usuario</br>
    - spring.datasource.password=sua_senha </br>
</br>
2. Clonando o repositório: </br>
- Abra o terminal da IDE escolhida e digite: git clone https://github.com/camila-azevedo/entrega-inicial-bootcamp; </br>
</br>
3. Executando a Aplicação: </br>
- Acesse sua IDE de preferência; </br>
- Clique no ícone de executar a aplicação; </br>
</br>
4. Acessando a Interface: </br>
- Abra o seu navegador de preferência; </br>
- Digite a URL http://localhost:8080/index.html; </br>
- A interface gráfica da sua lista de compras aparecerá e você poderá adicionar, editar ou excluir itens. </br>
</br>
5. Rodando os testes: </br>
- Via terminal, digite: .\mvnw test; </br>
- Ou, pelo IntelliJ, clique com o botão direito na pasta src/test/java e selecione a opção "Run 'All Tests'"; </br>
 </br>
6. Rodando os Testes de Linting: </br>
- Digite no terminal o comando .\mvnw checkstyle:check
- Se o resultado for BUILD SUCCESS, o linting validou que o código segue os padrões de formatação;
- No arquivo pom.xml, dentro da tag <plugins>, o maven-checkstyle-plugin está declarado;
</br>
7. Verificando a versão atual:
- A versão do projeto é controlada via Maven e está refletida na interface do usuário;
- A versão é 1.0.;
</br>
8. Verificando as dependências: </br>
- As dependências do projeto estão formalmente declaradas e gerenciadas através do arquivo pom.xml dentro da tag <dependencies>;
- Dependências presente são: 
      - spring-boot-starter-web
      - spring-boot-starter-data-jpa
      - postgresql
      - spring-boot-starter-test
</br>
9. Verificando os workflows </br>
- Acesse a aba “Actions” no repositório do GitHub; </br>

</br>
<h2>INSTRUÇÕES DE USO</h2>
1. Digite o nome do produto e a quantidade; </br>
2. Pressione “adicionar”; </br>
3. Verifique a lista com os produtos já cadastrados. </br> 

</br>
- Em uma atualização futura, verificaremos a possibilidade de incluir a funcionalidade de excluir elemento e a funcionalidade de alterar manualmente a quantidade. 

