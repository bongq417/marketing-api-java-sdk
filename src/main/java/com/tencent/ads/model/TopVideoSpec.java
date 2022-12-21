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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * 顶部视频组件元素&lt;br&gt; 视频时长6-30秒. &lt;br&gt; 视频大小不超过20MB. &lt;br&gt; 视频尺寸:
 * 朋友圈常规640*480/640*360/750*1536/750*1334/720*1280/1280*720/1280*960,&lt;br&gt;
 * 微信平台账号：朋友圈基础卡片广告:640*360/750*1536, 朋友圈全福式卡片广告:750*&lt;&#x3D;1536 &lt;br&gt; 腾讯广告账号：卡片广告：640*360
 * &lt;br&gt; 公众号及其他:750*&lt;&#x3D;1536
 */
@ApiModel(
    description =
        "顶部视频组件元素<br>        视频时长6-30秒. <br>        视频大小不超过20MB. <br>        视频尺寸: 朋友圈常规640*480/640*360/750*1536/750*1334/720*1280/1280*720/1280*960,<br>        微信平台账号：朋友圈基础卡片广告:640*360/750*1536, 朋友圈全福式卡片广告:750*<=1536 <br>        腾讯广告账号：卡片广告：640*360 <br>        公众号及其他:750*<=1536 ")
public class TopVideoSpec {
  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("ad_location")
  private String adLocation = null;

  @SerializedName("outer_style")
  private Long outerStyle = null;

  @SerializedName("used_for_outer")
  private Long usedForOuter = null;

  public TopVideoSpec videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   */
  @ApiModelProperty(value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public TopVideoSpec width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public TopVideoSpec height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public TopVideoSpec adLocation(String adLocation) {
    this.adLocation = adLocation;
    return this;
  }

  /**
   * Get adLocation
   *
   * @return adLocation
   */
  @ApiModelProperty(value = "")
  public String getAdLocation() {
    return adLocation;
  }

  public void setAdLocation(String adLocation) {
    this.adLocation = adLocation;
  }

  public TopVideoSpec outerStyle(Long outerStyle) {
    this.outerStyle = outerStyle;
    return this;
  }

  /**
   * Get outerStyle
   *
   * @return outerStyle
   */
  @ApiModelProperty(value = "")
  public Long getOuterStyle() {
    return outerStyle;
  }

  public void setOuterStyle(Long outerStyle) {
    this.outerStyle = outerStyle;
  }

  public TopVideoSpec usedForOuter(Long usedForOuter) {
    this.usedForOuter = usedForOuter;
    return this;
  }

  /**
   * Get usedForOuter
   *
   * @return usedForOuter
   */
  @ApiModelProperty(value = "")
  public Long getUsedForOuter() {
    return usedForOuter;
  }

  public void setUsedForOuter(Long usedForOuter) {
    this.usedForOuter = usedForOuter;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopVideoSpec topVideoSpec = (TopVideoSpec) o;
    return Objects.equals(this.videoId, topVideoSpec.videoId)
        && Objects.equals(this.width, topVideoSpec.width)
        && Objects.equals(this.height, topVideoSpec.height)
        && Objects.equals(this.adLocation, topVideoSpec.adLocation)
        && Objects.equals(this.outerStyle, topVideoSpec.outerStyle)
        && Objects.equals(this.usedForOuter, topVideoSpec.usedForOuter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, width, height, adLocation, outerStyle, usedForOuter);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
