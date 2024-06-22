package com.iptv.voting.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class OptionTableDef extends TableDef {

    /**
     * 实体类。

 @author justek
 @since 2024-06-18
     */
    public static final OptionTableDef OPTION = new OptionTableDef();

    /**
     * 选项名称
     */
    public final QueryColumn OPTION_ = new QueryColumn(this, "option");

    /**
     * 选项主题id
     */
    public final QueryColumn TITLE_ID = new QueryColumn(this, "title_id");

    public final QueryColumn OPTION_ID = new QueryColumn(this, "option_id");

    /**
     * 素材id
     */
    public final QueryColumn LIBRARY_ID = new QueryColumn(this, "library_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{OPTION_, TITLE_ID, OPTION_ID, LIBRARY_ID};

    public OptionTableDef() {
        super("", "vote_option");
    }

    private OptionTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public OptionTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new OptionTableDef("", "vote_option", alias));
    }

}
