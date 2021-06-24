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

/** 一键起量状态 */
@JsonAdapter(AutoAcquisitionStatus.Adapter.class)
public enum AutoAcquisitionStatus {
  ACQUISITION_STATUS_PENDING("AUTO_ACQUISITION_STATUS_PENDING"),

  ACQUISITION_STATUS_COMPLETED("AUTO_ACQUISITION_STATUS_COMPLETED"),

  ACQUISITION_STATUS_END("AUTO_ACQUISITION_STATUS_END"),

  ACQUISITION_STATUS_SUSPEND("AUTO_ACQUISITION_STATUS_SUSPEND"),

  ACQUISTION_STATUS_UNKNOW("AUTO_ACQUISTION_STATUS_UNKNOW"),

  ACQUISTION_STATUS_PENDING("AUTO_ACQUISTION_STATUS_PENDING"),

  ACQUISTION_STATUS_END_LESS_THAN_24H("AUTO_ACQUISTION_STATUS_END_LESS_THAN_24H"),

  ACQUISTION_STATUS_END_MORE_THAN_24H("AUTO_ACQUISTION_STATUS_END_MORE_THAN_24H"),

  ACQUISTION_STATUS_COMPLETED("AUTO_ACQUISTION_STATUS_COMPLETED"),

  ACQUISTION_STATUS_SUSPEND_ON_LEARNING_FAIL("AUTO_ACQUISTION_STATUS_SUSPEND_ON_LEARNING_FAIL"),

  ACQUISTION_STATUS_SUSPEND_ON_PLAYING_FAIL("AUTO_ACQUISTION_STATUS_SUSPEND_ON_PLAYING_FAIL"),

  ACQUISTION_STATUS_ADVERTISER_CLOSED("AUTO_ACQUISTION_STATUS_ADVERTISER_CLOSED");

  private String value;

  AutoAcquisitionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AutoAcquisitionStatus fromValue(String text) {
    for (AutoAcquisitionStatus b : AutoAcquisitionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AutoAcquisitionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AutoAcquisitionStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AutoAcquisitionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AutoAcquisitionStatus.fromValue(String.valueOf(value));
    }
  }
}