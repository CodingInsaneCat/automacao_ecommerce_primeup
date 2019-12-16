#language:pt
@realizarBuscarDeProduto
Funcionalidade: Realizar busca de um item no site

  Contexto: possibilidade de buscar o item no site escolhido
    Dado que usuário possa acessar o site de compras

  Esquema do Cenário: realizar busca de item em site
    Quando informar um <Produto> valido no campo de busca


    Exemplos:
      | Produto |
      |dress    |