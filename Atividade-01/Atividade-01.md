# Atividade 01

## _Programação II - Introdução a Programação Orientada a Objetos_

### André Rossi Korol – 01810067

#### 1. Fale sobre modelos que podem representar coisas e objetos do mundo real. Cite 3 exemplos não citados em aula.

#### Modelo 1 - Piloto de Avião

Atributos:

- Nome
- RG
- CPF
- CHT-PC (Carteira de Habilitação Técnica de Piloto Comercial)
- Empregador (Companhia Aérea)
- Nacionalidade
- Passaporte

Métodos:

- Registrar novo voo
- Reportar incidente
- Listar próximos voos

#### Modelo 2 - Aeronave

Atributos:

- Fabricante
- Modelo
- Ano de Fabricação
- Tamanho
- Peso
- Motores
- Autonomia
- Custo de Operação
- Companhia Aérea a que pertence

Métodos:

- Checar combustível atual
- Ver rota atual
- Listar histórico de rotas

<div style="page-break-after: always;"></div>

#### Modelo 3 - Companhia Aérea

Atributos:

- Nome
- País de Origem
- Ano de Incorporação
- Código IATA
- CNPJ
- Rotas que opera
- Lista de Pilotos que emprega
- Lista de Aeronaves que possuí

Métodos:

- Registrar novo Piloto
- Registrar nova Aeronave
- Listar Ultimos Voos
- Registrar nova rota

#### 2. Crie textualmente os modelos para um cardápio de restaurante, animal de petshop, cliente de papelaria, atleta de academia. Contemple no mínimo 5 características e 5 ações que podem ser realizadas por estes modelos.

#### Modelo Cardapio de Restaurante

Atributos:

- Lista de Pratos de Entradas
- Lista de Pratos Principais
- Lista de Pratos de Sobremesa
- Mapeamento dos Nomes do Pratos para seus Preços (Hashtable)
- Data do Cardápio

Métodos:

- Adicionar Prato
- Remover Prato
- Listar Pratos
- Atualizar Preço de um Prato
- Alterar Data do Cardápio

#### Modelo Animal de Petshop

Atributos:

- Espécie
- Nome
- Idade
- Sexo
- Preço

Métodos:

- Alterar Nome
- Atualizar Idade
- Alterar Preço
- Tomar banho
- Preparar para ser vendido

#### Modelo Cliente de Papelaria

Atributos:

- Nome
- CPF
- Data de Nascimento
- Histórico de Compras
- Forma de Pagamento Preferencial

Métodos:

- Efetuar Nova Compra
- Alterar Forma de Pagamento Preferencial
- Indicar Conhecido para Programa de Fidelidade
- Usar Cartão de Desconto
- Promover no Programa de Fidelidade

#### Modelo Atleta de Academia

Atributos:

- Nome
- Idade
- Sexo
- Peso
- Medidas
- Treino

Métodos:

- Alterar Peso
- Alterar Medidas
- Montar Novo Treino
- Checar Treino Atual
- Inscrever em Aula
