package com.iptv.voting.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class TitleTableDef extends TableDef {

    /**
     * 实体类。

 @author justek
 @since 2024-06-18
     */
    public static final TitleTableDef TITLE = new TitleTableDef();

    /**
     * 投票显示位置
     */
    public final QueryColumn POS_X = new QueryColumn(this, "pos_x");

    /**
     * 投票显示位置
     */
    public final QueryColumn POS_Y = new QueryColumn(this, "pos_y");

    /**
     * 主题类型
     */
    public final QueryColumn TYPE = new QueryColumn(this, "type");

    /**
     * 弹窗主题
     */
    public final QueryColumn TITLE_ = new QueryColumn(this, "title");

    /**
     * 宽
     */
    public final QueryColumn WIDTH = new QueryColumn(this, "width");

    /**
     * 高
     */
    public final QueryColumn HEIGHT = new QueryColumn(this, "height");

    public final QueryColumn TITLE_ID = new QueryColumn(this, "title_id");

    /**
     * 素材id
     */
    public final QueryColumn LIBRARY_ID = new QueryColumn(this, "library_id");

    /**
     * 投票类型
     */
    public final QueryColumn MODEL_TYPE = new QueryColumn(this, "modelType");

    /**
     * 弹窗高度
     */
    public final QueryColumn SCREEN_WIDTH = new QueryColumn(this, "screen_width");

    /**
     * 弹窗宽度
     */
    public final QueryColumn SCREEN_HEIGHT = new QueryColumn(this, "screen_height");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{POS_X, POS_Y, TYPE, TITLE_, WIDTH, HEIGHT, TITLE_ID, LIBRARY_ID, MODEL_TYPE, SCREEN_WIDTH, SCREEN_HEIGHT};

    public TitleTableDef() {
        super("", "vote_title");
    }

    private TitleTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public TitleTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new TitleTableDef("", "vote_title", alias));
    }

}
