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

/** 预览信息 */
@ApiModel(description = "预览信息")
public class AdcreativePreviewSpec {
  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElements adcreativeElements = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("page_spec")
  private PreviewPageSpec pageSpec = null;

  public AdcreativePreviewSpec adcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
    return this;
  }

  /**
   * Get adcreativeTemplateId
   *
   * @return adcreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeTemplateId() {
    return adcreativeTemplateId;
  }

  public void setAdcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
  }

  public AdcreativePreviewSpec siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdcreativePreviewSpec addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public AdcreativePreviewSpec promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public AdcreativePreviewSpec adcreativeElements(AdcreativeCreativeElements adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElements getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElements adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
  }

  public AdcreativePreviewSpec promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public AdcreativePreviewSpec pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public AdcreativePreviewSpec pageSpec(PreviewPageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public PreviewPageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PreviewPageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativePreviewSpec adcreativePreviewSpec = (AdcreativePreviewSpec) o;
    return Objects.equals(this.adcreativeTemplateId, adcreativePreviewSpec.adcreativeTemplateId)
        && Objects.equals(this.siteSet, adcreativePreviewSpec.siteSet)
        && Objects.equals(this.promotedObjectType, adcreativePreviewSpec.promotedObjectType)
        && Objects.equals(this.adcreativeElements, adcreativePreviewSpec.adcreativeElements)
        && Objects.equals(this.promotedObjectId, adcreativePreviewSpec.promotedObjectId)
        && Objects.equals(this.pageType, adcreativePreviewSpec.pageType)
        && Objects.equals(this.pageSpec, adcreativePreviewSpec.pageSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adcreativeTemplateId,
        siteSet,
        promotedObjectType,
        adcreativeElements,
        promotedObjectId,
        pageType,
        pageSpec);
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
