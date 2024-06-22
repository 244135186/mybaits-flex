package com.iptv.voting.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ResultTableDef extends TableDef {

    /**
     * 实体类。

 @author justek
 @since 2024-06-18
     */
    public static final ResultTableDef RESULT = new ResultTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 投票主题id
     */
    public final QueryColumn TITLE_ID = new QueryColumn(this, "title_id");

    /**
     * 设备id
     */
    public final QueryColumn DEVICE_ID = new QueryColumn(this, "device_id");

    /**
     * 选项选中id
     */
    public final QueryColumn OPTION_ID = new QueryColumn(this, "option_id");

    /**
     * 用户投票时间
     */
    public final QueryColumn VOTE_TIME = new QueryColumn(this, "vote_time");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TITLE_ID, DEVICE_ID, OPTION_ID, VOTE_TIME};

    public ResultTableDef() {
        super("", "vote_result");
    }

    private ResultTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ResultTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ResultTableDef("", "vote_result", alias));
    }

}
