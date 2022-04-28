Feature: Compra em E-commerce

  @Login
  Scenario Outline: Acessar seu login
   Given usuario abra o <site>
   And clicar no botao Sign In
   When digite seu email <email>
   And digite sua senha <passwd>
   And clicar para logar
   Then usario esta logado
   
   Examples:  
      |site                                      | email                  | passwd      |                            
      |"http://automationpractice.com/index.php" | "katiasilva@gmail.com" | "86100231"  |    
      
   
  @Compra
  Scenario Outline: Fazer compra
   Given usuario clica no botao Home
   And preenche o campo para pesquisar seu produto <search>
   And exibira o resultado da pesquisa na tela 
   And clicar no produto desejado 
   And escolher as opcoes desejadas <quantily> , <size> , <color>
   When usuario adiconar o produto ao carrinho 
   And sera direcionado a tela para confirma sua compra 
   And sera direcionado a segunda tela para resumo de compras 
   And usuario ira preencher o campo de observacao <note>
   And clicar no botao para fazer o check-out de endereco
   And marcar o Terms of service
   Then clicar no botao Proceed to checkout para envio
   
   Examples:  
      | search     | quantily  | size | color    | note                                  |
      | "Dress"    | "2"       | "M"  | "Pink"   |"Estou em casa a partir das 11:00 h."  |


   @Pagamento
   Scenario Outline: Efetuar pagamento 
   Given usuario escolha opcao de pagamento transfencia bancaria
   When clicar para confirma transferencia 
   Then sera direcionado a tela de historico de pedidos e finalizara a compra
   And sera direcionado a tela inicial
      

    
      