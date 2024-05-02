package com.hellolaw.hellolaw.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hellolaw.hellolaw.service.LawServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/law")
@RequiredArgsConstructor
public class LawController {

	private final LawServiceImpl lawService;

	@GetMapping("/detail")
	public ResponseEntity<?> getLawDetail(@RequestParam(value = "name") String lawName) {
		return ResponseEntity.ok(lawService.getLawDetail(lawName));
	}
}