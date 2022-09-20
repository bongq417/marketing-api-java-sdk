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

/** 号码包类型 */
@JsonAdapter(WechatPackageType.Adapter.class)
public enum WechatPackageType {
  ACCOUNT("ACCOUNT"),

  QRCODE("QRCODE");

  private String value;

  WechatPackageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatPackageType fromValue(String text) {
    for (WechatPackageType b : WechatPackageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatPackageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WechatPackageType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatPackageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WechatPackageType.fromValue(String.valueOf(value));
    }
  }
}