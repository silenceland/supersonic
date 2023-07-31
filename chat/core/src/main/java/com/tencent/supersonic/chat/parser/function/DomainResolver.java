package com.tencent.supersonic.chat.parser.function;


import com.tencent.supersonic.chat.api.pojo.ChatContext;
import com.tencent.supersonic.chat.api.pojo.QueryContext;

public interface DomainResolver {

    Long resolve(QueryContext queryContext, ChatContext chatCtx);

}