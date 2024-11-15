package com.dev.gabriel.api_predicao_doenca_do_coracao.controller;

import com.dev.gabriel.api_predicao_doenca_do_coracao.controller.dto.PredicaoRequest;
import com.dev.gabriel.api_predicao_doenca_do_coracao.controller.dto.PredicaoResponse;
import com.dev.gabriel.api_predicao_doenca_do_coracao.service.PredicaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coracao/predicao")
@RequiredArgsConstructor
public class PredicaoController {
  private final PredicaoService predicaoService;

  @PostMapping
  public ResponseEntity<PredicaoResponse> predict(@Valid @RequestBody PredicaoRequest request) {
    PredicaoResponse response = new PredicaoResponse(this.predicaoService.predict(request));
    return ResponseEntity.ok(response);
  }
}
