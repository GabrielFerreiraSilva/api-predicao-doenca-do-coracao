package com.dev.gabriel.api_predicao_doenca_do_coracao.config;

import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class Loader {
  @Value("${caminho.modelo.predicao}")
  private String caminhoModelo;

  @Bean
  public Evaluator modelEvaluator() {
    try {
      return new LoadingModelEvaluatorBuilder().load(new File(caminhoModelo)).build();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }
}
