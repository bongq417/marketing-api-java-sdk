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

/** 简版原生页分享信息，仅在部分朋友圈创意形式下设置有效，具体可通过创意形式查询工具或 adcreative_templates/get 接口进行查询 */
@ApiModel(description = "简版原生页分享信息，仅在部分朋友圈创意形式下设置有效，具体可通过创意形式查询工具或 adcreative_templates/get 接口进行查询")
public class ShareContentSpec {
  @SerializedName("share_title")
  private String shareTitle = null;

  @SerializedName("share_description")
  private String shareDescription = null;

  public ShareContentSpec shareTitle(String shareTitle) {
    this.shareTitle = shareTitle;
    return this;
  }

  /**
   * Get shareTitle
   *
   * @return shareTitle
   */
  @ApiModelProperty(value = "")
  public String getShareTitle() {
    return shareTitle;
  }

  public void setShareTitle(String shareTitle) {
    this.shareTitle = shareTitle;
  }

  public ShareContentSpec shareDescription(String shareDescription) {
    this.shareDescription = shareDescription;
    return this;
  }

  /**
   * Get shareDescription
   *
   * @return shareDescription
   */
  @ApiModelProperty(value = "")
  public String getShareDescription() {
    return shareDescription;
  }

  public void setShareDescription(String shareDescription) {
    this.shareDescription = shareDescription;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareContentSpec shareContentSpec = (ShareContentSpec) o;
    return Objects.equals(this.shareTitle, shareContentSpec.shareTitle)
        && Objects.equals(this.shareDescription, shareContentSpec.shareDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareTitle, shareDescription);
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
