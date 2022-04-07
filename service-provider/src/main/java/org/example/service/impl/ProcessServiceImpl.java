package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.ProcessEntity;
import org.example.mapper.ProcessMapper;
import org.example.service.ProcessService;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl extends ServiceImpl<ProcessMapper, ProcessEntity> implements ProcessService {
}
