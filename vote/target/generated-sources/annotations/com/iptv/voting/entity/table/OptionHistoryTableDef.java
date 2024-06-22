package com.iptv.voting.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class OptionHistoryTableDef extends TableDef {

    /**
     * 实体类。

 @author justek
 @since 2024-06-18
     */
    public static final OptionHistoryTableDef OPTION_HISTORY = new OptionHistoryTableDef();

    public final QueryColumn VP_ID = new QueryColumn(this, "vp_id");

    public final QueryColumn OPTION = new QueryColumn(this, "option");

    public final QueryColumn OPTION_ID = new QueryColumn(this, "option_id");

    public final QueryColumn LIBRARY_ID = new QueryColumn(this, "library_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{VP_ID, OPTION, OPTION_ID, LIBRARY_ID};

    public OptionHistoryTableDef() {
        super("", "vote_option_history");
    }

    private OptionHistoryTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public OptionHistoryTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new OptionHistoryTableDef("", "vote_option_history", alias));
    }

}
