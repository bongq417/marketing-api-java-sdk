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

/** 资产授权路径类型 */
@JsonAdapter(PathType.Adapter.class)
public enum PathType {
  BM("PATH_TYPE_BM"),

  AGENCY("PATH_TYPE_AGENCY"),

  MDM("PATH_TYPE_MDM"),

  POINT_TO_POINT("PATH_TYPE_POINT_TO_POINT");

  private String value;

  PathType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PathType fromValue(String text) {
    for (PathType b : PathType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PathType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PathType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PathType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PathType.fromValue(String.valueOf(value));
    }
  }
}
