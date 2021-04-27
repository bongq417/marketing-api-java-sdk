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

/** AdParamGetRequest */
public class AdParamGetRequest {
  @SerializedName("uid")
  private Long uid = null;

  @SerializedName("campaign_type")
  private CampaignType campaignType = null;

  @SerializedName("creative_template_id")
  private Long creativeTemplateId = null;

  @SerializedName("media_placement_group_id")
  private Long mediaPlacementGroupId = null;

  @SerializedName("dynamic_ad_category")
  private Long dynamicAdCategory = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  public AdParamGetRequest uid(Long uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   *
   * @return uid
   */
  @ApiModelProperty(value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public AdParamGetRequest campaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Get campaignType
   *
   * @return campaignType
   */
  @ApiModelProperty(value = "")
  public CampaignType getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
  }

  public AdParamGetRequest creativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
    return this;
  }

  /**
   * Get creativeTemplateId
   *
   * @return creativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getCreativeTemplateId() {
    return creativeTemplateId;
  }

  public void setCreativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
  }

  public AdParamGetRequest mediaPlacementGroupId(Long mediaPlacementGroupId) {
    this.mediaPlacementGroupId = mediaPlacementGroupId;
    return this;
  }

  /**
   * Get mediaPlacementGroupId
   *
   * @return mediaPlacementGroupId
   */
  @ApiModelProperty(value = "")
  public Long getMediaPlacementGroupId() {
    return mediaPlacementGroupId;
  }

  public void setMediaPlacementGroupId(Long mediaPlacementGroupId) {
    this.mediaPlacementGroupId = mediaPlacementGroupId;
  }

  public AdParamGetRequest dynamicAdCategory(Long dynamicAdCategory) {
    this.dynamicAdCategory = dynamicAdCategory;
    return this;
  }

  /**
   * Get dynamicAdCategory
   *
   * @return dynamicAdCategory
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdCategory() {
    return dynamicAdCategory;
  }

  public void setDynamicAdCategory(Long dynamicAdCategory) {
    this.dynamicAdCategory = dynamicAdCategory;
  }

  public AdParamGetRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdParamGetRequest adParamGetRequest = (AdParamGetRequest) o;
    return Objects.equals(this.uid, adParamGetRequest.uid)
        && Objects.equals(this.campaignType, adParamGetRequest.campaignType)
        && Objects.equals(this.creativeTemplateId, adParamGetRequest.creativeTemplateId)
        && Objects.equals(this.mediaPlacementGroupId, adParamGetRequest.mediaPlacementGroupId)
        && Objects.equals(this.dynamicAdCategory, adParamGetRequest.dynamicAdCategory)
        && Objects.equals(this.promotedObjectType, adParamGetRequest.promotedObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        uid,
        campaignType,
        creativeTemplateId,
        mediaPlacementGroupId,
        dynamicAdCategory,
        promotedObjectType);
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
