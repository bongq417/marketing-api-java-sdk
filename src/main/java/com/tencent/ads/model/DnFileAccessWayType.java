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

/** 数据源来源 */
@JsonAdapter(DnFileAccessWayType.Adapter.class)
public enum DnFileAccessWayType {
  SELF_BUILT("SELF_BUILT"),

  BE_AUTHORIZED("BE_AUTHORIZED");

  private String value;

  DnFileAccessWayType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DnFileAccessWayType fromValue(String text) {
    for (DnFileAccessWayType b : DnFileAccessWayType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DnFileAccessWayType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DnFileAccessWayType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DnFileAccessWayType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DnFileAccessWayType.fromValue(String.valueOf(value));
    }
  }
}