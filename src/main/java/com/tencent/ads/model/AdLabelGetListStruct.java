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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class AdLabelGetListStruct {
  @SerializedName("label_category")
  private String labelCategory = null;

  @SerializedName("label")
  private List<String> label = null;

  @SerializedName("icon")
  private List<LabelIconItem> icon = null;

  @SerializedName("label_type")
  private LabelType labelType = null;

  @SerializedName("label_type_name")
  private String labelTypeName = null;

  public AdLabelGetListStruct labelCategory(String labelCategory) {
    this.labelCategory = labelCategory;
    return this;
  }

  /**
   * Get labelCategory
   *
   * @return labelCategory
   */
  @ApiModelProperty(value = "")
  public String getLabelCategory() {
    return labelCategory;
  }

  public void setLabelCategory(String labelCategory) {
    this.labelCategory = labelCategory;
  }

  public AdLabelGetListStruct label(List<String> label) {
    this.label = label;
    return this;
  }

  public AdLabelGetListStruct addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<String>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public List<String> getLabel() {
    return label;
  }

  public void setLabel(List<String> label) {
    this.label = label;
  }

  public AdLabelGetListStruct icon(List<LabelIconItem> icon) {
    this.icon = icon;
    return this;
  }

  public AdLabelGetListStruct addIconItem(LabelIconItem iconItem) {
    if (this.icon == null) {
      this.icon = new ArrayList<LabelIconItem>();
    }
    this.icon.add(iconItem);
    return this;
  }

  /**
   * Get icon
   *
   * @return icon
   */
  @ApiModelProperty(value = "")
  public List<LabelIconItem> getIcon() {
    return icon;
  }

  public void setIcon(List<LabelIconItem> icon) {
    this.icon = icon;
  }

  public AdLabelGetListStruct labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

  /**
   * Get labelType
   *
   * @return labelType
   */
  @ApiModelProperty(value = "")
  public LabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  public AdLabelGetListStruct labelTypeName(String labelTypeName) {
    this.labelTypeName = labelTypeName;
    return this;
  }

  /**
   * Get labelTypeName
   *
   * @return labelTypeName
   */
  @ApiModelProperty(value = "")
  public String getLabelTypeName() {
    return labelTypeName;
  }

  public void setLabelTypeName(String labelTypeName) {
    this.labelTypeName = labelTypeName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdLabelGetListStruct adLabelGetListStruct = (AdLabelGetListStruct) o;
    return Objects.equals(this.labelCategory, adLabelGetListStruct.labelCategory)
        && Objects.equals(this.label, adLabelGetListStruct.label)
        && Objects.equals(this.icon, adLabelGetListStruct.icon)
        && Objects.equals(this.labelType, adLabelGetListStruct.labelType)
        && Objects.equals(this.labelTypeName, adLabelGetListStruct.labelTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelCategory, label, icon, labelType, labelTypeName);
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