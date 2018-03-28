package service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public interface DemoService {
    Integer add(Integer a, Integer b);
}
