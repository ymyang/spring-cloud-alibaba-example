package com.ymyang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ymyang.entity.ProcessEntity;
import com.ymyang.mapper.ProcessMapper;
import com.ymyang.service.ProcessService;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl extends ServiceImpl<ProcessMapper, ProcessEntity> implements ProcessService {
}
