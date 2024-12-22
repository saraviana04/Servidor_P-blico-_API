Servidor Público API

Este projeto é uma aplicação backend desenvolvida em Spring Boot para gerenciar e listar informações de servidores públicos. Os dados são armazenados em um arquivo JSON e acessíveis via endpoints RESTful.

Funcionalidades

Listar todos os servidores públicos.

Consultar detalhes de um servidor por matrícula.

Estrutura do Projeto

Diretórios e Arquivos Principais

controller: Contém as classes que expõem os endpoints da API.

service: Contém as classes de serviço para manipulação dos dados.

model: Representa as entidades do sistema.

resources/data/servidorpublico.json: Arquivo JSON com os dados dos servidores públicos.

Endpoints da API

Listar Todos os Servidores

GET /api/servidores/listAll

Retorna uma lista com todos os servidores públicos.

Exemplo de Resposta:

[
  {
    "matricula": 3,
    "nome": "Maria Fontenele",
    "foto": "https://abctreinamentos.com.br/imgs/maria.png",
    "orgao": "ENAP",
    "vinculo": "Estatutário",
    "cargo": "Analista",
    "lotacao": "Brasília",
    "exercicio": "Departamento de Treinamento",
    "email": "mariafontenele@enap.br",
    "telefone": "(61) 3255-6010",
    "celular": "(61) 99910-5722",
    "cpf": "123.4567.789-01",
    "naturalidade": "Recife"
  }
]

Consultar Servidor por Matrícula

GET /api/servidores/list/{matricula}

Substitua {matricula} pela matrícula do servidor desejado.

Exemplo de Resposta (Matrícula Encontrada):

{
  "matricula": 4,
  "nome": "Paulo Sampaio",
  "foto": "https://abctreinamentos.com.br/imgs/paulo.png",
  "orgao": "RFB",
  "vinculo": "Estatutário",
  "cargo": "Auditor-Fiscal",
  "lotacao": "São Paulo",
  "exercicio": "Departamento de Fiscalização",
  "email": "paulosampaio@rfb.gov.br",
  "telefone": "(11) 3255-6010",
  "celular": "(11) 99910-5713",
  "cpf": "123.4567.789-01",
  "naturalidade": "Campinas"
}

Exemplo de Resposta (Matrícula Não Encontrada):

"Servidor com matrícula {matricula} não encontrado."

Como Executar o Projeto

Clone o repositório:

git clone <URL_DO_REPOSITORIO>

Navegue até o diretório do projeto:

cd servidor-publico

Execute o projeto:

./mvnw spring-boot:run

Acesse os endpoints em: http://localhost:8080/api/servidores.

Tecnologias Utilizadas

Java 17

Spring Boot 3.3.4

Jackson (para manipulação de JSON)

Maven

Estrutura de Dados (JSON)

Os dados dos servidores estão armazenados no arquivo resources/data/servidorpublico.json no seguinte formato:
