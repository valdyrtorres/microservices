Api Rest para Cadastro de Clientes em Java

Para rodar:

Botão direito no projeto: 
Run As -> Maven clean
Run As -> Maven install

Se você estiver usando o STS, vá para Boot Dashboard, selecione crud-clientes e 
clique no primeiro botãozinho quadrado vermelho para iniciar

Criar Cliente - POST:

Exemplo de Body (JSON):

{
	"nome": "mouse",
	"estoque": 150,
	"preco": 5
}

Swagger:
http://localhost:8081/crud/swagger-ui/