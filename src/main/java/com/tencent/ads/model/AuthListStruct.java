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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class AuthListStruct {
  @SerializedName("promoted_object_name")
  private String promotedObjectName = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("auth_token")
  private String authToken = null;

  @SerializedName("auth_begin_date")
  private Long authBeginDate = null;

  @SerializedName("auth_ttl")
  private Long authTtl = null;

  @SerializedName("status")
  private Long status = null;

  @SerializedName("audit_msg")
  private String auditMsg = null;

  @SerializedName("auth_type")
  private WechatAuthType authType = null;

  @SerializedName("auth_scope")
  private WechatAuthScope authScope = null;

  @SerializedName("is_ad_acct")
  private Boolean isAdAcct = null;

  public AuthListStruct promotedObjectName(String promotedObjectName) {
    this.promotedObjectName = promotedObjectName;
    return this;
  }

  /**
   * Get promotedObjectName
   *
   * @return promotedObjectName
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectName() {
    return promotedObjectName;
  }

  public void setPromotedObjectName(String promotedObjectName) {
    this.promotedObjectName = promotedObjectName;
  }

  public AuthListStruct promotedObjectId(String promotedObjectId) {
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

  public AuthListStruct promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public AuthListStruct authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Get authToken
   *
   * @return authToken
   */
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public AuthListStruct authBeginDate(Long authBeginDate) {
    this.authBeginDate = authBeginDate;
    return this;
  }

  /**
   * Get authBeginDate
   *
   * @return authBeginDate
   */
  @ApiModelProperty(value = "")
  public Long getAuthBeginDate() {
    return authBeginDate;
  }

  public void setAuthBeginDate(Long authBeginDate) {
    this.authBeginDate = authBeginDate;
  }

  public AuthListStruct authTtl(Long authTtl) {
    this.authTtl = authTtl;
    return this;
  }

  /**
   * Get authTtl
   *
   * @return authTtl
   */
  @ApiModelProperty(value = "")
  public Long getAuthTtl() {
    return authTtl;
  }

  public void setAuthTtl(Long authTtl) {
    this.authTtl = authTtl;
  }

  public AuthListStruct status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public AuthListStruct auditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
    return this;
  }

  /**
   * Get auditMsg
   *
   * @return auditMsg
   */
  @ApiModelProperty(value = "")
  public String getAuditMsg() {
    return auditMsg;
  }

  public void setAuditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
  }

  public AuthListStruct authType(WechatAuthType authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   *
   * @return authType
   */
  @ApiModelProperty(value = "")
  public WechatAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(WechatAuthType authType) {
    this.authType = authType;
  }

  public AuthListStruct authScope(WechatAuthScope authScope) {
    this.authScope = authScope;
    return this;
  }

  /**
   * Get authScope
   *
   * @return authScope
   */
  @ApiModelProperty(value = "")
  public WechatAuthScope getAuthScope() {
    return authScope;
  }

  public void setAuthScope(WechatAuthScope authScope) {
    this.authScope = authScope;
  }

  public AuthListStruct isAdAcct(Boolean isAdAcct) {
    this.isAdAcct = isAdAcct;
    return this;
  }

  /**
   * Get isAdAcct
   *
   * @return isAdAcct
   */
  @ApiModelProperty(value = "")
  public Boolean isIsAdAcct() {
    return isAdAcct;
  }

  public void setIsAdAcct(Boolean isAdAcct) {
    this.isAdAcct = isAdAcct;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthListStruct authListStruct = (AuthListStruct) o;
    return Objects.equals(this.promotedObjectName, authListStruct.promotedObjectName)
        && Objects.equals(this.promotedObjectId, authListStruct.promotedObjectId)
        && Objects.equals(this.promotedObjectType, authListStruct.promotedObjectType)
        && Objects.equals(this.authToken, authListStruct.authToken)
        && Objects.equals(this.authBeginDate, authListStruct.authBeginDate)
        && Objects.equals(this.authTtl, authListStruct.authTtl)
        && Objects.equals(this.status, authListStruct.status)
        && Objects.equals(this.auditMsg, authListStruct.auditMsg)
        && Objects.equals(this.authType, authListStruct.authType)
        && Objects.equals(this.authScope, authListStruct.authScope)
        && Objects.equals(this.isAdAcct, authListStruct.isAdAcct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        promotedObjectName,
        promotedObjectId,
        promotedObjectType,
        authToken,
        authBeginDate,
        authTtl,
        status,
        auditMsg,
        authType,
        authScope,
        isAdAcct);
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
