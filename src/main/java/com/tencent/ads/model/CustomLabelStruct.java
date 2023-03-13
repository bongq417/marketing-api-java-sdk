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

/** 标签信息 */
@ApiModel(description = "标签信息")
public class CustomLabelStruct {
  @SerializedName("level_id")
  private Long levelId = null;

  @SerializedName("label_name")
  private String labelName = null;

  @SerializedName("first_material_label_level_id")
  private Long firstMaterialLabelLevelId = null;

  @SerializedName("first_material_label_level_name")
  private String firstMaterialLabelLevelName = null;

  @SerializedName("second_material_label_level_id")
  private Long secondMaterialLabelLevelId = null;

  @SerializedName("second_material_label_level_name")
  private String secondMaterialLabelLevelName = null;

  public CustomLabelStruct levelId(Long levelId) {
    this.levelId = levelId;
    return this;
  }

  /**
   * Get levelId
   *
   * @return levelId
   */
  @ApiModelProperty(value = "")
  public Long getLevelId() {
    return levelId;
  }

  public void setLevelId(Long levelId) {
    this.levelId = levelId;
  }

  public CustomLabelStruct labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * Get labelName
   *
   * @return labelName
   */
  @ApiModelProperty(value = "")
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public CustomLabelStruct firstMaterialLabelLevelId(Long firstMaterialLabelLevelId) {
    this.firstMaterialLabelLevelId = firstMaterialLabelLevelId;
    return this;
  }

  /**
   * Get firstMaterialLabelLevelId
   *
   * @return firstMaterialLabelLevelId
   */
  @ApiModelProperty(value = "")
  public Long getFirstMaterialLabelLevelId() {
    return firstMaterialLabelLevelId;
  }

  public void setFirstMaterialLabelLevelId(Long firstMaterialLabelLevelId) {
    this.firstMaterialLabelLevelId = firstMaterialLabelLevelId;
  }

  public CustomLabelStruct firstMaterialLabelLevelName(String firstMaterialLabelLevelName) {
    this.firstMaterialLabelLevelName = firstMaterialLabelLevelName;
    return this;
  }

  /**
   * Get firstMaterialLabelLevelName
   *
   * @return firstMaterialLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getFirstMaterialLabelLevelName() {
    return firstMaterialLabelLevelName;
  }

  public void setFirstMaterialLabelLevelName(String firstMaterialLabelLevelName) {
    this.firstMaterialLabelLevelName = firstMaterialLabelLevelName;
  }

  public CustomLabelStruct secondMaterialLabelLevelId(Long secondMaterialLabelLevelId) {
    this.secondMaterialLabelLevelId = secondMaterialLabelLevelId;
    return this;
  }

  /**
   * Get secondMaterialLabelLevelId
   *
   * @return secondMaterialLabelLevelId
   */
  @ApiModelProperty(value = "")
  public Long getSecondMaterialLabelLevelId() {
    return secondMaterialLabelLevelId;
  }

  public void setSecondMaterialLabelLevelId(Long secondMaterialLabelLevelId) {
    this.secondMaterialLabelLevelId = secondMaterialLabelLevelId;
  }

  public CustomLabelStruct secondMaterialLabelLevelName(String secondMaterialLabelLevelName) {
    this.secondMaterialLabelLevelName = secondMaterialLabelLevelName;
    return this;
  }

  /**
   * Get secondMaterialLabelLevelName
   *
   * @return secondMaterialLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getSecondMaterialLabelLevelName() {
    return secondMaterialLabelLevelName;
  }

  public void setSecondMaterialLabelLevelName(String secondMaterialLabelLevelName) {
    this.secondMaterialLabelLevelName = secondMaterialLabelLevelName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabelStruct customLabelStruct = (CustomLabelStruct) o;
    return Objects.equals(this.levelId, customLabelStruct.levelId)
        && Objects.equals(this.labelName, customLabelStruct.labelName)
        && Objects.equals(
            this.firstMaterialLabelLevelId, customLabelStruct.firstMaterialLabelLevelId)
        && Objects.equals(
            this.firstMaterialLabelLevelName, customLabelStruct.firstMaterialLabelLevelName)
        && Objects.equals(
            this.secondMaterialLabelLevelId, customLabelStruct.secondMaterialLabelLevelId)
        && Objects.equals(
            this.secondMaterialLabelLevelName, customLabelStruct.secondMaterialLabelLevelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        levelId,
        labelName,
        firstMaterialLabelLevelId,
        firstMaterialLabelLevelName,
        secondMaterialLabelLevelId,
        secondMaterialLabelLevelName);
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
