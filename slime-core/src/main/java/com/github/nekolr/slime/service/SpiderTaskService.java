package com.github.nekolr.slime.service;

import com.github.nekolr.slime.domain.SpiderTask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SpiderTaskService {

    void save(SpiderTask task);

    Page<SpiderTask> findAll(SpiderTask task, Pageable pageable);

    Long getMaxTaskIdByFlowId(Long flowId);

    void removeById(Long id);
}