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

/** 风险等级类型 */
@JsonAdapter(RiskTypeStatus.Adapter.class)
public enum RiskTypeStatus {
  CONSERVATIVE("RISK_CONSERVATIVE"),

  STEADY("RISK_STEADY"),

  BALANCE("RISK_BALANCE"),

  RADICAL("RISK_RADICAL"),

  OTHER("RISK_OTHER");

  private String value;

  RiskTypeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskTypeStatus fromValue(String text) {
    for (RiskTypeStatus b : RiskTypeStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RiskTypeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskTypeStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskTypeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskTypeStatus.fromValue(String.valueOf(value));
    }
  }
}