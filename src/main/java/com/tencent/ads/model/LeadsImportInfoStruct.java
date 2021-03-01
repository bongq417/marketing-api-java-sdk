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

/** 导入的线索信息结构 */
@ApiModel(description = "导入的线索信息结构")
public class LeadsImportInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_type")
  private LeadCluesLeadsType leadsType = null;

  @SerializedName("leads_user_id")
  private String leadsUserId = null;

  @SerializedName("leads_user_type")
  private LeadsUserType leadsUserType = null;

  @SerializedName("leads_name")
  private String leadsName = null;

  @SerializedName("leads_gender")
  private LeadCluesGenderType leadsGender = null;

  @SerializedName("leads_tel")
  private String leadsTel = null;

  @SerializedName("leads_qq")
  private Long leadsQq = null;

  @SerializedName("leads_wechat")
  private String leadsWechat = null;

  @SerializedName("leads_email")
  private String leadsEmail = null;

  @SerializedName("leads_area")
  private String leadsArea = null;

  @SerializedName("bundle")
  private String bundle = null;

  @SerializedName("click_id")
  private String clickId = null;

  @SerializedName("outer_leads_convert_type")
  private String outerLeadsConvertType = null;

  @SerializedName("outer_leads_ineffect_reason")
  private String outerLeadsIneffectReason = null;

  public LeadsImportInfoStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public LeadsImportInfoStruct leadsType(LeadCluesLeadsType leadsType) {
    this.leadsType = leadsType;
    return this;
  }

  /**
   * Get leadsType
   *
   * @return leadsType
   */
  @ApiModelProperty(value = "")
  public LeadCluesLeadsType getLeadsType() {
    return leadsType;
  }

  public void setLeadsType(LeadCluesLeadsType leadsType) {
    this.leadsType = leadsType;
  }

  public LeadsImportInfoStruct leadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
    return this;
  }

  /**
   * Get leadsUserId
   *
   * @return leadsUserId
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserId() {
    return leadsUserId;
  }

  public void setLeadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
  }

  public LeadsImportInfoStruct leadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
    return this;
  }

  /**
   * Get leadsUserType
   *
   * @return leadsUserType
   */
  @ApiModelProperty(value = "")
  public LeadsUserType getLeadsUserType() {
    return leadsUserType;
  }

  public void setLeadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
  }

  public LeadsImportInfoStruct leadsName(String leadsName) {
    this.leadsName = leadsName;
    return this;
  }

  /**
   * Get leadsName
   *
   * @return leadsName
   */
  @ApiModelProperty(value = "")
  public String getLeadsName() {
    return leadsName;
  }

  public void setLeadsName(String leadsName) {
    this.leadsName = leadsName;
  }

  public LeadsImportInfoStruct leadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
    return this;
  }

  /**
   * Get leadsGender
   *
   * @return leadsGender
   */
  @ApiModelProperty(value = "")
  public LeadCluesGenderType getLeadsGender() {
    return leadsGender;
  }

  public void setLeadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
  }

  public LeadsImportInfoStruct leadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
    return this;
  }

  /**
   * Get leadsTel
   *
   * @return leadsTel
   */
  @ApiModelProperty(value = "")
  public String getLeadsTel() {
    return leadsTel;
  }

  public void setLeadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
  }

  public LeadsImportInfoStruct leadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
    return this;
  }

  /**
   * Get leadsQq
   *
   * @return leadsQq
   */
  @ApiModelProperty(value = "")
  public Long getLeadsQq() {
    return leadsQq;
  }

  public void setLeadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
  }

  public LeadsImportInfoStruct leadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
    return this;
  }

  /**
   * Get leadsWechat
   *
   * @return leadsWechat
   */
  @ApiModelProperty(value = "")
  public String getLeadsWechat() {
    return leadsWechat;
  }

  public void setLeadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
  }

  public LeadsImportInfoStruct leadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
    return this;
  }

  /**
   * Get leadsEmail
   *
   * @return leadsEmail
   */
  @ApiModelProperty(value = "")
  public String getLeadsEmail() {
    return leadsEmail;
  }

  public void setLeadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
  }

  public LeadsImportInfoStruct leadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
    return this;
  }

  /**
   * Get leadsArea
   *
   * @return leadsArea
   */
  @ApiModelProperty(value = "")
  public String getLeadsArea() {
    return leadsArea;
  }

  public void setLeadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
  }

  public LeadsImportInfoStruct bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   *
   * @return bundle
   */
  @ApiModelProperty(value = "")
  public String getBundle() {
    return bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public LeadsImportInfoStruct clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  /**
   * Get clickId
   *
   * @return clickId
   */
  @ApiModelProperty(value = "")
  public String getClickId() {
    return clickId;
  }

  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  public LeadsImportInfoStruct outerLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
    return this;
  }

  /**
   * Get outerLeadsConvertType
   *
   * @return outerLeadsConvertType
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsConvertType() {
    return outerLeadsConvertType;
  }

  public void setOuterLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
  }

  public LeadsImportInfoStruct outerLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
    return this;
  }

  /**
   * Get outerLeadsIneffectReason
   *
   * @return outerLeadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsIneffectReason() {
    return outerLeadsIneffectReason;
  }

  public void setOuterLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsImportInfoStruct leadsImportInfoStruct = (LeadsImportInfoStruct) o;
    return Objects.equals(this.outerLeadsId, leadsImportInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsType, leadsImportInfoStruct.leadsType)
        && Objects.equals(this.leadsUserId, leadsImportInfoStruct.leadsUserId)
        && Objects.equals(this.leadsUserType, leadsImportInfoStruct.leadsUserType)
        && Objects.equals(this.leadsName, leadsImportInfoStruct.leadsName)
        && Objects.equals(this.leadsGender, leadsImportInfoStruct.leadsGender)
        && Objects.equals(this.leadsTel, leadsImportInfoStruct.leadsTel)
        && Objects.equals(this.leadsQq, leadsImportInfoStruct.leadsQq)
        && Objects.equals(this.leadsWechat, leadsImportInfoStruct.leadsWechat)
        && Objects.equals(this.leadsEmail, leadsImportInfoStruct.leadsEmail)
        && Objects.equals(this.leadsArea, leadsImportInfoStruct.leadsArea)
        && Objects.equals(this.bundle, leadsImportInfoStruct.bundle)
        && Objects.equals(this.clickId, leadsImportInfoStruct.clickId)
        && Objects.equals(this.outerLeadsConvertType, leadsImportInfoStruct.outerLeadsConvertType)
        && Objects.equals(
            this.outerLeadsIneffectReason, leadsImportInfoStruct.outerLeadsIneffectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsType,
        leadsUserId,
        leadsUserType,
        leadsName,
        leadsGender,
        leadsTel,
        leadsQq,
        leadsWechat,
        leadsEmail,
        leadsArea,
        bundle,
        clickId,
        outerLeadsConvertType,
        outerLeadsIneffectReason);
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
