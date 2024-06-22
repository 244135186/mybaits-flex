package com.iptv.voting.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PublishTableDef extends TableDef {

    /**
     * 实体类。

 @author justek
 @since 2024-06-18
     */
    public static final PublishTableDef PUBLISH = new PublishTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn STATUS = new QueryColumn(this, "status");

    public final QueryColumn TITLE_ID = new QueryColumn(this, "title_id");

    public final QueryColumn DURATION = new QueryColumn(this, "duration");

    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    public final QueryColumn TITLE_RESULT = new QueryColumn(this, "title_result");

    public final QueryColumn POPUP_WINDOW_INFORMATION = new QueryColumn(this, "popup_window_information");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, STATUS, TITLE_ID, DURATION, CREATE_TIME, TITLE_RESULT, POPUP_WINDOW_INFORMATION};

    public PublishTableDef() {
        super("", "vote_publish");
    }

    private PublishTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PublishTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PublishTableDef("", "vote_publish", alias));
    }

}
