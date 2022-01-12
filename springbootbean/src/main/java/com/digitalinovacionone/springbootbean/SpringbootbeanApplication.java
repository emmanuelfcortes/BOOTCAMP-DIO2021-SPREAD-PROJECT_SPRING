package com.digitalinovacionone.springbootbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootbeanApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ca = SpringApplication.run(SpringbootbeanApplication.class, args);
//******** UTILIZAÇÃO SEM TRANSFORMAR AS CLASSES Copo e FormatoCopo em @COMPONENT
//		FormatoCopo fc = new FormatoCopo();
//		fc.setFormatoCorpo(FormatoCopo.Formato.QUADRADO);
//		fc.setFormatoBase(FormatoCopo.Formato.OVAL);
//		Copo copo = new Copo();
//		copo.setMaterial("vidro");
//		copo.setPreco(6.5f);
//		copo.setFormatoCopo(fc);
//		System.out.println(copo);
//******************************************************************************
//******************************************************************************
//		UM BEAN É UMA CLASSE JAVA QUE NO SPRING É GERENCIADA POR ELE (INSTANCIADA E
//		DESTRUÍDA). NÓS PODEMOS ACESSAR OS BEANS POR MEIO DO CONTEXTO DA APLICAÇÃO.
//
//		UM BEAN PODE SER INSTANCIADO FACILMENTE PELAS ANNOTATIONS
//		@COMPONENET, @SERVICE, @REPOSITORY , @CONTROLLER E @RESTCONTROLLER
//
//		TAMBÉM PODE SER INSTANCIADO PELA ANNOTATION @BEAN. NESTE CASO, É NECESSÁRIO
//		CRIAR UMA CLASSE DE CONFIGURAÇÃO OU UM ARQUIVO XML CONFIGURANDO O(S) BEAN(S).
//


		/*A classe Prato recebeu o indicador não recebeu indicador, mas criamos um arquivo
		de configuração (BeanConfigurationClass) para configurá-la como um @Bean*/
		Prato prato = ca.getBean(Prato.class);

		prato.exibirFormato();
		prato.setMarca("Marinex");
		prato.setMaterial("Plástico");
		prato.setPeso(2.5f);
		System.out.println(prato);


		/* A classe Copo recebeu o indicador @Component*/
		Copo copo = ca.getBean(Copo.class);
		copo.setMaterial("Vibranium");
		copo.setPreco(10.90f);
		copo.exibirFormato();
		System.out.println(copo);

	}

}
