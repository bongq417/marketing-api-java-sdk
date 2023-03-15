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

/** 落地页类型 */
@JsonAdapter(DestinationTypeRead.Adapter.class)
public enum DestinationTypeRead {
  TSA_APP("PAGE_TYPE_TSA_APP"),

  TSA_WEB_NONE_ECOMMERCE("PAGE_TYPE_TSA_WEB_NONE_ECOMMERCE"),

  CANVAS_WECHAT("PAGE_TYPE_CANVAS_WECHAT"),

  UNSUPPORTED("PAGE_TYPE_UNSUPPORTED"),

  FENGYE_ECOMMERCE("PAGE_TYPE_FENGYE_ECOMMERCE"),

  FENGYE_EC_WECHAT_MINIPROGRAM("PAGE_TYPE_FENGYE_EC_WECHAT_MINIPROGRAM"),

  YUEBAO_QUICKAPP("PAGE_TYPE_YUEBAO_QUICKAPP"),

  YUEBAO_OFFICIAL_ACCOUNT_ARTICLE("PAGE_TYPE_YUEBAO_OFFICIAL_ACCOUNT_ARTICLE"),

  XIJING_QUICK("PAGE_TYPE_XIJING_QUICK"),

  WECHAT_CHANNELS("PAGE_TYPE_WECHAT_CHANNELS"),

  CHANNELS_WATCH_LIVE("PAGE_TYPE_CHANNELS_WATCH_LIVE"),

  CHANNELS_RESERVE_LIVE("PAGE_TYPE_CHANNELS_RESERVE_LIVE"),

  WECHAT_STATUS_FOOTER("PAGE_TYPE_WECHAT_STATUS_FOOTER"),

  WECHAT_CONSULT("PAGE_TYPE_WECHAT_CONSULT"),

  WECOM_CONSULT("PAGE_TYPE_WECOM_CONSULT"),

  YOUZAN_SINGLE("PAGE_TYPE_YOUZAN_SINGLE"),

  YOUZAN_TOGETHER("PAGE_TYPE_YOUZAN_TOGETHER"),

  YOUZAN_WECHAT_MINIPROGRAM("PAGE_TYPE_YOUZAN_WECHAT_MINIPROGRAM"),

  YIYE_FORM("PAGE_TYPE_YIYE_FORM"),

  WEIMOB_PRODUCTSET("PAGE_TYPE_WEIMOB_PRODUCTSET"),

  WEIMOB_PROMOTION("PAGE_TYPE_WEIMOB_PROMOTION"),

  WEIMOB_PRODUCT("PAGE_TYPE_WEIMOB_PRODUCT"),

  WEIMOB_H5("PAGE_TYPE_WEIMOB_H5"),

  WEIMOB_WECHAT_MINIPROGRAM("PAGE_TYPE_WEIMOB_WECHAT_MINIPROGRAM"),

  FENGSHU_MINI_PROGRAM("PAGE_TYPE_FENGSHU_MINI_PROGRAM"),

  WECHAT_OFFICIAL_ACCOUNT_DETAIL("PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_DETAIL"),

  WECHAT_FOCUS_DAILOG("PAGE_TYPE_WECHAT_FOCUS_DAILOG"),

  WECHAT_MOMENTS_SCAN_PHOTO("PAGE_TYPE_WECHAT_MOMENTS_SCAN_PHOTO"),

  WECHAT_MOMENTS_SUBSCRIPTION("PAGE_TYPE_WECHAT_MOMENTS_SUBSCRIPTION"),

  WECHAT_RED_PACKET_COVER("PAGE_TYPE_WECHAT_RED_PACKET_COVER"),

  WECHAT_VIDEO_TOPIC("PAGE_TYPE_WECHAT_VIDEO_TOPIC"),

  ARTICAL_WECHAT("PAGE_TYPE_ARTICAL_WECHAT"),

  CHANNELS_HALF_CARD("PAGE_TYPE_CHANNELS_HALF_CARD"),

  TSA_OTT("PAGE_TYPE_TSA_OTT"),

  APP_DEEP_LINK("PAGE_TYPE_APP_DEEP_LINK"),

  UNIVERSAL_LINK("PAGE_TYPE_UNIVERSAL_LINK"),

  NOT_USED("PAGE_TYPE_NOT_USED");

  private String value;

  DestinationTypeRead(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DestinationTypeRead fromValue(String text) {
    for (DestinationTypeRead b : DestinationTypeRead.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DestinationTypeRead> {
    @Override
    public void write(final JsonWriter jsonWriter, final DestinationTypeRead enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DestinationTypeRead read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DestinationTypeRead.fromValue(String.valueOf(value));
    }
  }
}
