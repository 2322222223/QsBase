package com.qsmaxmin.qsbase.common.config;

import com.qsmaxmin.qsbase.common.utils.QsHelper;

/**
 * @CreateBy sky
 * @Date 2017/7/3 9:15
 * @Description
 */

public abstract class QsProperties {
    private PropertiesEngine engine;

    public String initTag() {
        return QsHelper.getInstance().getApplication().isLogOpen() ? getClass().getSimpleName() : "QsProperties";
    }

    private QsProperties() {
    }

    public QsProperties(String key) {
        engine = new PropertiesEngine(this, key, initTag());
    }

    /**
     * 提交
     */
    public void commit() {
        engine.commit();
    }

    /**
     * 清空文件内容
     */
    public void clear() {
        engine.clear();
    }
}
