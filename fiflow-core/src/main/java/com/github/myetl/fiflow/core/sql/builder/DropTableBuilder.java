package com.github.myetl.fiflow.core.sql.builder;

import com.github.myetl.fiflow.core.core.FiflowSqlSession;
import com.github.myetl.fiflow.core.sql.Cmd;
import com.github.myetl.fiflow.core.flink.FlinkBuildInfo;
import com.github.myetl.fiflow.core.sql.CmdBuilder;

/**
 * drop table xx
 */
public class DropTableBuilder extends CmdBaseBuilder implements CmdBuilder {
    public static final String pattern = "(DROP\\s+TABLE\\s+.*)";

    public DropTableBuilder() {
        super(pattern);
    }

    @Override
    public FlinkBuildInfo build(Cmd cmd, FiflowSqlSession session) {
        return null;
    }
}
