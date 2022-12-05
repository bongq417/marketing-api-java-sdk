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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CreativeComponentsUpdateRequest */
public class CreativeComponentsUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("component_type")
  private CreativeComponentType componentType = null;

  @SerializedName("component_spec")
  private CreativeComponentSpecStruct componentSpec = null;

  public CreativeComponentsUpdateRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CreativeComponentsUpdateRequest componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public CreativeComponentsUpdateRequest componentType(CreativeComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   *
   * @return componentType
   */
  @ApiModelProperty(value = "")
  public CreativeComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(CreativeComponentType componentType) {
    this.componentType = componentType;
  }

  public CreativeComponentsUpdateRequest componentSpec(CreativeComponentSpecStruct componentSpec) {
    this.componentSpec = componentSpec;
    return this;
  }

  /**
   * Get componentSpec
   *
   * @return componentSpec
   */
  @ApiModelProperty(value = "")
  public CreativeComponentSpecStruct getComponentSpec() {
    return componentSpec;
  }

  public void setComponentSpec(CreativeComponentSpecStruct componentSpec) {
    this.componentSpec = componentSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeComponentsUpdateRequest creativeComponentsUpdateRequest =
        (CreativeComponentsUpdateRequest) o;
    return Objects.equals(this.accountId, creativeComponentsUpdateRequest.accountId)
        && Objects.equals(this.componentId, creativeComponentsUpdateRequest.componentId)
        && Objects.equals(this.componentType, creativeComponentsUpdateRequest.componentType)
        && Objects.equals(this.componentSpec, creativeComponentsUpdateRequest.componentSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, componentId, componentType, componentSpec);
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