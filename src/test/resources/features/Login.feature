Feature: Realizar login com cadastro ja criado
  Scenario: Realizar login no site
    Given que acesso o conexaoQA
    And clico no login
    When coloco "usuario" e "senha"
    Then e exibido tela de dashboard
    And informa o nome do "usuario"
