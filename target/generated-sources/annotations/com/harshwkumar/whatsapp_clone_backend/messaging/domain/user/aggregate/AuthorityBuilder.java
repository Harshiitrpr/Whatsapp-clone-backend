package com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.aggregate;

import javax.annotation.processing.Generated;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.AuthorityName;

@Generated("Jilt-1.5")
public class AuthorityBuilder {
  private AuthorityName name;

  public static AuthorityBuilder authority() {
    return new AuthorityBuilder();
  }

  public AuthorityBuilder name(AuthorityName name) {
    this.name = name;
    return this;
  }

  public Authority build() {
    return new Authority(name);
  }
}
