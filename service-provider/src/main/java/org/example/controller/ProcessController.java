package org.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.entity.ProcessEntity;
import org.example.service.ProcessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "ProcessController", tags = {"流程服务"})
@RestController
@RequestMapping("/api/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @ApiOperation(value = "列表", notes = "作者：xxx")
    @GetMapping("/list")
    public IPage<ProcessEntity> list(
            @RequestParam(value = "index", defaultValue = "1") int index,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        IPage<ProcessEntity> page = new Page<>(index, size);
        return processService.page(page);
    }

//    @ApiOperation(value = "详情", notes = "作者：xxx")
    @GetMapping("/{id}")
    public ProcessEntity detail(@PathVariable("id") int id) {
        return processService.getById(id);
    }

}
