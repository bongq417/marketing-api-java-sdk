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

/** 头像点击跳转信息 */
@ApiModel(description = "头像点击跳转信息")
public class HeadClickSpec {
  @SerializedName("brand_app_id")
  private String brandAppId = null;

  public HeadClickSpec brandAppId(String brandAppId) {
    this.brandAppId = brandAppId;
    return this;
  }

  /**
   * Get brandAppId
   *
   * @return brandAppId
   */
  @ApiModelProperty(value = "")
  public String getBrandAppId() {
    return brandAppId;
  }

  public void setBrandAppId(String brandAppId) {
    this.brandAppId = brandAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadClickSpec headClickSpec = (HeadClickSpec) o;
    return Objects.equals(this.brandAppId, headClickSpec.brandAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandAppId);
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