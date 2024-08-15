Gerenciamento de Beneficiários e Documentos
Visão Geral
Este projeto é uma aplicação de gerenciamento de beneficiários e documentos desenvolvida com Java 17 e Spring Boot. O sistema permite realizar operações básicas de CRUD (Create, Read, Update, Delete) tanto para beneficiários quanto para seus documentos.

Entidades
Beneficiário

id: Identificador único do beneficiário (UUID)
nome: Nome do beneficiário (String)
telefone: Telefone de contato do beneficiário (String)
dataNascimento: Data de nascimento do beneficiário (LocalDate)
dataInclusao: Data em que o beneficiário foi incluído no sistema (LocalDate)
dataAtualizacao: Data da última atualização dos dados do beneficiário (LocalDate)
Documento

id: Identificador único do documento (UUID)
tipoDocumento: Tipo do documento (String)
dataInclusao: Data em que o documento foi incluído no sistema (LocalDate)
dataAtualizacao: Data da última atualização do documento (LocalDate)

Funcionalidades
Beneficiários
Cadastrar um Beneficiário junto com seus Documentos

Permite adicionar um novo beneficiário ao sistema e associar documentos a ele.
Endpoint: POST /v1/beneficiarios
Request Body: Dados do beneficiário e lista de documentos.
Listar Todos os Beneficiários Cadastrados

Recupera uma lista de todos os beneficiários no sistema.
Endpoint: GET /v1/beneficiarios
Response: Lista de beneficiários.
Listar Todos os Documentos de um Beneficiário a partir de seu ID

Obtém todos os documentos associados a um beneficiário específico, usando seu ID.
Endpoint: GET /v1/documento/{ID}
Path Variable: ID do beneficiário.
Response: Lista de documentos do beneficiário.
Atualizar os Dados Cadastrais de um Beneficiário

Permite modificar as informações de um beneficiário existente.
Endpoint: PATCH /v1/beneficiarios
Path Variable: ID do beneficiário.
Request Body: Dados atualizados do beneficiário.
Remover um Beneficiário

Remove um beneficiário do sistema com base no ID fornecido.
Endpoint: DELETE /v1/beneficiarios/{id}
Path Variable: ID do beneficiário.
Documentos
Cadastrar um Documento

Permite adicionar um novo documento ao sistema.
Endpoint: POST /v1/documentos
Request Body: Dados do documento.
Listar Todos os Documentos Cadastrados

Recupera uma lista de todos os documentos no sistema.
Endpoint: GET /v1/documentos
Response: Lista de documentos.
Atualizar os Dados de um Documento

Permite modificar as informações de um documento existente.
Endpoint: PATCH /v1/documentos/{id}
Path Variable: ID do documento.
Request Body: Dados atualizados do documento.
Remover um Documento

Remove um documento do sistema com base no ID fornecido.
Endpoint: DELETE /v1/documentos/{id}
Path Variable: ID do documento.
Listar um Documento pelo ID

Obtém os detalhes de um documento específico usando seu ID.
Endpoint: GET /v1/documentos/{id}
Path Variable: ID do documento.
Response: Dados do documento.
Tecnologias
Java 17: Linguagem de programação utilizada.
Spring Boot: Framework para desenvolvimento de aplicações Java baseadas em Spring.
Spring Data JPA: Biblioteca para interação com o banco de dados utilizando JPA (Java Persistence API).

OBS: É utilizado o server.port: 9090
