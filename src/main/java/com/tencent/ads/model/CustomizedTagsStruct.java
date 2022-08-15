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

/** 自定义标签集合 */
@ApiModel(description = "自定义标签集合")
public class CustomizedTagsStruct {
  @SerializedName("tag_group_name")
  private String tagGroupName = null;

  @SerializedName("tag_name_list")
  private List<String> tagNameList = null;

  public CustomizedTagsStruct tagGroupName(String tagGroupName) {
    this.tagGroupName = tagGroupName;
    return this;
  }

  /**
   * Get tagGroupName
   *
   * @return tagGroupName
   */
  @ApiModelProperty(value = "")
  public String getTagGroupName() {
    return tagGroupName;
  }

  public void setTagGroupName(String tagGroupName) {
    this.tagGroupName = tagGroupName;
  }

  public CustomizedTagsStruct tagNameList(List<String> tagNameList) {
    this.tagNameList = tagNameList;
    return this;
  }

  public CustomizedTagsStruct addTagNameListItem(String tagNameListItem) {
    if (this.tagNameList == null) {
      this.tagNameList = new ArrayList<String>();
    }
    this.tagNameList.add(tagNameListItem);
    return this;
  }

  /**
   * Get tagNameList
   *
   * @return tagNameList
   */
  @ApiModelProperty(value = "")
  public List<String> getTagNameList() {
    return tagNameList;
  }

  public void setTagNameList(List<String> tagNameList) {
    this.tagNameList = tagNameList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizedTagsStruct customizedTagsStruct = (CustomizedTagsStruct) o;
    return Objects.equals(this.tagGroupName, customizedTagsStruct.tagGroupName)
        && Objects.equals(this.tagNameList, customizedTagsStruct.tagNameList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagGroupName, tagNameList);
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
