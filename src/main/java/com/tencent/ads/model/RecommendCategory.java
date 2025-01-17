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

/** 推荐类别 */
@JsonAdapter(RecommendCategory.Adapter.class)
public enum RecommendCategory {
  INDUSTRY("RECOMMEND_BY_INDUSTRY"),

  WORD("RECOMMEND_BY_WORD");

  private String value;

  RecommendCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecommendCategory fromValue(String text) {
    for (RecommendCategory b : RecommendCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RecommendCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecommendCategory enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RecommendCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RecommendCategory.fromValue(String.valueOf(value));
    }
  }
}
