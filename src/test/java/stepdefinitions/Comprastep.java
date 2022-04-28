package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import actions.LoginAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class Comprastep {

		DriverManager manager = new DriverManager();
		WebDriver driver = manager.AbrirUrl();
		LoginAction action = PageFactory.initElements(driver, LoginAction.class);
		
		public Comprastep() throws Exception{
			
		}
	
		@Given("usuario abra o {string}")
		public void usuario_abra_o_site(String url) {
		    driver.get(url);
		}

		@And("clicar no botao Sign In")
		public void clicar_no_botao_sign_in() {
		    action.clicarSignIn();
		}

		@When("digite seu email {string}")
		public void digite_seu_email(String string) {
		    action.preencheEmail(string);
		}

		@And("digite sua senha {string}")
		public void digite_sua_senha(String string) {
		    action.preencherPasswd(string);
		}

		@And("clicar para logar")
		public void clicar_para_logar() {
		    action.clicarSubmit();
		}

		@Then("usario esta logado")
		public void usario_esta_logado() {
		    
		}
		//Compras 
		@Given("usuario clica no botao Home")
		public void usuario_clica_no_botao_home() {
		    action.clicarHeader();  
		}

		@And("preenche o campo para pesquisar seu produto {string}")
		public void preenche_o_campo_para_pesquisar_seu_produto(String string) {
		    action.preencherCampo(string);
		}
		
		@And("exibira o resultado da pesquisa na tela")
		public void exibira_o_resultado_da_pesquisa_na_tela() {
			action.clicarSearch();
		}
		
		@And("clicar no produto desejado")
		public void clicar_no_produto_desejado() {
			action.clicarCenter();
		}
		
		@And("escolher as opcoes desejadas {string} , {string} , {string}")
		public void escolher_as_opcoes_desejadas(String string, String string2, String string3) {
			action.clicarQuanti(string);
			action.clicarSize();
			action.clicarColor();
		}
		
		@When("usuario adiconar o produto ao carrinho")
		public void usuario_adiconar_o_produto_ao_carrinho() {
			action.clicarButton();
		}
		
		@And("sera direcionado a tela para confirma sua compra")
		public void sera_direcionado_a_tela_para_confirmar_sua_compra() {
			action.clicarProceed();
		}
		
		@And("sera direcionado a segunda tela para resumo de compras")
		public void sera_direcionado_a_segunda_tela_para_resumo_de_compras() {
			action.clicarProceedTo();
		}
		
		@And("usuario ira preencher o campo de observacao {string}")
		public void usuario_ira_preencher_o_campo_de_observacao(String string) {
			action.preencherObser(string);
		}
		
		@And("clicar no botao para fazer o check-out de endereco")
		public void ao_clicar_no_botao_para_fazer_o_checkout_endereco() {
			action.clicarCheckout();
        }
		
		@And("marcar o Terms of service")
		public void marca_o_terms_of_service() {
			action.clicarTerms();
		}
		
		@Then("clicar no botao Proceed to checkout para envio")
		public void clicar_no_botao_Proceed_to_checkout_para_envio() {
			action.clicarTocheckkout();
		}
		//Pagamento
		@Given("usuario escolha opcao de pagamento transfencia bancaria")
		public void usuario_escolha_opcao_de_pagamento_transferencia_bancaria() {
			action.clicarPayment();
		}
		
		@When("clicar para confirma transferencia")
		public void clicar_para_confirmar_transferencia() {
			action.clicarNavegation();
		}
		
		@Then("sera direcionado a tela de historico de pedidos e finalizara a compra")
		public void sera_direcionado_a_tela_de_historico_de_pedidos_e_finelizar_a_compra() {
			action.clicarCentercolum();
		}
		
		@And("sera direcionado a tela inicial")
		public void sera_direcionado_a_tela_inicial() {
			action.clicarHome();
		}
	
 
}