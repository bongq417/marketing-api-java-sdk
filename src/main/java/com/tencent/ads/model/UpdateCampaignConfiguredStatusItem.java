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

/** 修改推广计划客户设置的状态 */
@ApiModel(description = "修改推广计划客户设置的状态")
public class UpdateCampaignConfiguredStatusItem {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  public UpdateCampaignConfiguredStatusItem campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public UpdateCampaignConfiguredStatusItem configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignConfiguredStatusItem updateCampaignConfiguredStatusItem =
        (UpdateCampaignConfiguredStatusItem) o;
    return Objects.equals(this.campaignId, updateCampaignConfiguredStatusItem.campaignId)
        && Objects.equals(
            this.configuredStatus, updateCampaignConfiguredStatusItem.configuredStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, configuredStatus);
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