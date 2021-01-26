package com.ymyang.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ymyang.entity.ProcessEntity;
import com.ymyang.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @GetMapping("/list")
    public IPage<ProcessEntity> list(
            @RequestParam(value = "index", defaultValue = "1") int index,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        IPage<ProcessEntity> page = new Page<>(index, size);
        return processService.page(page);
    }

    @GetMapping("/{id}")
    public ProcessEntity detail(@PathVariable("id") int id) {
        return processService.getById(id);
    }

}
