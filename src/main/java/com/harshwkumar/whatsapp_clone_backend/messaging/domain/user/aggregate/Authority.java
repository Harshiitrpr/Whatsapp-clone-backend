package com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.aggregate;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.AuthorityName;
import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}
