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
import com.iptv.voting.entity.OptionHistory;
import com.iptv.voting.service.OptionHistoryService;
import org.springframework.web.bind.annotation.RestController;
import java.io.Serializable;
import java.util.List;

/**
 *  控制层。
 *
 * @author justek
 * @since 2024-06-18
 */
@RestController
@RequestMapping("/optionHistory")
public class OptionHistoryController {

    @Autowired
    private OptionHistoryService optionHistoryService;

    /**
     * 添加。
     *
     * @param optionHistory 
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody OptionHistory optionHistory) {
        return optionHistoryService.save(optionHistory);
    }

    @PostMapping("batchSave")
    public boolean batchSave(@RequestBody List<OptionHistory> optionHistories) {
        return optionHistoryService.saveBatch(optionHistories);
    }

    /**
     * 根据主键删除。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Serializable id) {
        return optionHistoryService.removeById(id);
    }


    @DeleteMapping("/remove")
    public boolean remove(@RequestBody List<Serializable> ids) {
        return optionHistoryService.removeByIds(ids);
    }

    /**
     * 根据主键更新。
     *
     * @param optionHistory 
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody OptionHistory optionHistory) {
        return optionHistoryService.updateById(optionHistory);
    }
    /**
     * 批量更新。
     *
     * @param optionHistories 选项历史列表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("batchUpdate")
    public boolean batchUpdate(@RequestBody List<OptionHistory> optionHistories) {
        return optionHistoryService.updateBatch(optionHistories);
    }

    /**
     * 批量添加。
     *
     * @param optionHistories 选项历史列表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */


    /**
     * 查询所有。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<OptionHistory> list() {
        return optionHistoryService.list();
    }

    /**
     * 根据主键获取详细信息。
     *
     * @param id 主键
     * @return 详情
     */
    @GetMapping("getInfo/{id}")
    public OptionHistory getInfo(@PathVariable Serializable id) {
        return optionHistoryService.getById(id);
    }

    /**
     * 分页查询。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<OptionHistory> page(Page<OptionHistory> page) {
        return optionHistoryService.page(page);
    }

}
