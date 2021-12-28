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

/** 子模板结构 */
@ApiModel(description = "子模板结构")
public class SubTemplateStruct {
  @SerializedName("sample_video_url")
  private String sampleVideoUrl = null;

  @SerializedName("template_type")
  private VideoTemplateType templateType = null;

  public SubTemplateStruct sampleVideoUrl(String sampleVideoUrl) {
    this.sampleVideoUrl = sampleVideoUrl;
    return this;
  }

  /**
   * Get sampleVideoUrl
   *
   * @return sampleVideoUrl
   */
  @ApiModelProperty(value = "")
  public String getSampleVideoUrl() {
    return sampleVideoUrl;
  }

  public void setSampleVideoUrl(String sampleVideoUrl) {
    this.sampleVideoUrl = sampleVideoUrl;
  }

  public SubTemplateStruct templateType(VideoTemplateType templateType) {
    this.templateType = templateType;
    return this;
  }

  /**
   * Get templateType
   *
   * @return templateType
   */
  @ApiModelProperty(value = "")
  public VideoTemplateType getTemplateType() {
    return templateType;
  }

  public void setTemplateType(VideoTemplateType templateType) {
    this.templateType = templateType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTemplateStruct subTemplateStruct = (SubTemplateStruct) o;
    return Objects.equals(this.sampleVideoUrl, subTemplateStruct.sampleVideoUrl)
        && Objects.equals(this.templateType, subTemplateStruct.templateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleVideoUrl, templateType);
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
