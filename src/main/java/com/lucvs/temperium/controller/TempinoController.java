package com.lucvs.temperium.controller;

import com.lucvs.temperium.dto.Tempino;
import com.lucvs.temperium.service.TempinoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tempino")
public class TempinoController {

    private final TempinoService tempinoService;

    public TempinoController(TempinoService tempinoService) {
        this.tempinoService = tempinoService;
    }

    @GetMapping("/test")
    public List<Tempino> getAllTempino() {
        return tempinoService.getAllTempino();
    }
}
