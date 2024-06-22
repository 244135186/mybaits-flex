package com.iptv.voting.controller;

import com.mybatisflex.core.paginate.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.iptv.voting.entity.Publish;
import com.iptv.voting.service.PublishService;
import org.springframework.web.bind.annotation.RestController;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  控制层。
 *
 * @author justek
 * @since 2024-06-18
 */
@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    private PublishService publishService;

    /**
     * 添加。
     *
     * @param publish 
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Publish publish) {
        return publishService.save(publish);
    }

    /**
     * 根据主键删除。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Serializable id) {
        return publishService.removeById(id);
    }


    @DeleteMapping("/delete")
    public Map<String, Object> deletePublish(@RequestBody List<Long> ids) {
        boolean success = publishService.delete(ids);

        Map<String, Object> response = new HashMap<>();
        if (success) {
            response.put("code", 200);
            response.put("message", "Success");
            response.put("data", 1);
        } else {
            response.put("code", 201);
            response.put("message", "Failed");
            response.put("data", 0);
        }
        return response;
    }
    /**
     * 根据主键更新。
     *
     * @param publish 
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Publish publish) {
        return publishService.updateById(publish);
    }

    /**
     * 查询所有。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Publish> list() {
        return publishService.list();
    }

    /**
     * 根据主键获取详细信息。
     *
     * @param id 主键
     * @return 详情
     */
    @GetMapping("getInfo/{id}")
    public Publish getInfo(@PathVariable Serializable id) {
        return publishService.getById(id);
    }

    /**
     * 分页查询。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Publish> page(Page<Publish> page) {
        return publishService.page(page);
    }

}
