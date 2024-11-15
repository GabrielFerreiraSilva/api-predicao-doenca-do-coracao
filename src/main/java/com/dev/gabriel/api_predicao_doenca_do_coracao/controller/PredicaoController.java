package com.dev.gabriel.api_predicao_doenca_do_coracao.controller;

import com.dev.gabriel.api_predicao_doenca_do_coracao.service.PredicaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coracao/predicao")
@RequiredArgsConstructor
public class PredicaoController {
  private final PredicaoService predicaoService;
}
