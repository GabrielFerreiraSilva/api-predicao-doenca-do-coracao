package com.dev.gabriel.api_predicao_doenca_do_coracao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
  @ExceptionHandler
  public ResponseEntity<MensagemErro> handleGenericException(Exception e) {
    MensagemErro mensagem =
        new MensagemErro(
            HttpStatus.INTERNAL_SERVER_ERROR.value(), "Erro inesperado na API", e.getMessage());

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagem);
  }

  public record MensagemErro(Integer status, String erro, String detalhe) {}
}
