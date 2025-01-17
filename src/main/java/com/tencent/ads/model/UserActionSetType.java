/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 数据源类型 */
@JsonAdapter(UserActionSetType.Adapter.class)
public enum UserActionSetType {
  WEB("USER_ACTION_SET_TYPE_WEB"),

  IOS("USER_ACTION_SET_TYPE_IOS"),

  ANDROID("USER_ACTION_SET_TYPE_ANDROID"),

  WECHAT("USER_ACTION_SET_TYPE_WECHAT"),

  WECHAT_MINI_PROGRAM("USER_ACTION_SET_TYPE_WECHAT_MINI_PROGRAM"),

  WECHAT_MINI_GAME("USER_ACTION_SET_TYPE_WECHAT_MINI_GAME");

  private String value;

  UserActionSetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserActionSetType fromValue(String text) {
    for (UserActionSetType b : UserActionSetType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserActionSetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserActionSetType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserActionSetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserActionSetType.fromValue(String.valueOf(value));
    }
  }
}
