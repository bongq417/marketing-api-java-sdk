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

/** 渠道包信息 */
@ApiModel(description = "渠道包信息")
public class ChannelPackageData {
  @SerializedName("android_app_id")
  private Long androidAppId = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("package_download_url")
  private String packageDownloadUrl = null;

  @SerializedName("channel_package_id")
  private String channelPackageId = null;

  @SerializedName("version_code")
  private Long versionCode = null;

  @SerializedName("version_name")
  private String versionName = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("system_status")
  private PackageSysStatus systemStatus = null;

  @SerializedName("audit_status")
  private PackageAuditStatus auditStatus = null;

  public ChannelPackageData androidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
    return this;
  }

  /**
   * Get androidAppId
   *
   * @return androidAppId
   */
  @ApiModelProperty(value = "")
  public Long getAndroidAppId() {
    return androidAppId;
  }

  public void setAndroidAppId(Long androidAppId) {
    this.androidAppId = androidAppId;
  }

  public ChannelPackageData packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   */
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public ChannelPackageData packageDownloadUrl(String packageDownloadUrl) {
    this.packageDownloadUrl = packageDownloadUrl;
    return this;
  }

  /**
   * Get packageDownloadUrl
   *
   * @return packageDownloadUrl
   */
  @ApiModelProperty(value = "")
  public String getPackageDownloadUrl() {
    return packageDownloadUrl;
  }

  public void setPackageDownloadUrl(String packageDownloadUrl) {
    this.packageDownloadUrl = packageDownloadUrl;
  }

  public ChannelPackageData channelPackageId(String channelPackageId) {
    this.channelPackageId = channelPackageId;
    return this;
  }

  /**
   * Get channelPackageId
   *
   * @return channelPackageId
   */
  @ApiModelProperty(value = "")
  public String getChannelPackageId() {
    return channelPackageId;
  }

  public void setChannelPackageId(String channelPackageId) {
    this.channelPackageId = channelPackageId;
  }

  public ChannelPackageData versionCode(Long versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * Get versionCode
   *
   * @return versionCode
   */
  @ApiModelProperty(value = "")
  public Long getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Long versionCode) {
    this.versionCode = versionCode;
  }

  public ChannelPackageData versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

  /**
   * Get versionName
   *
   * @return versionName
   */
  @ApiModelProperty(value = "")
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public ChannelPackageData createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public ChannelPackageData lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public ChannelPackageData systemStatus(PackageSysStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public PackageSysStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(PackageSysStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public ChannelPackageData auditStatus(PackageAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
    return this;
  }

  /**
   * Get auditStatus
   *
   * @return auditStatus
   */
  @ApiModelProperty(value = "")
  public PackageAuditStatus getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(PackageAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelPackageData channelPackageData = (ChannelPackageData) o;
    return Objects.equals(this.androidAppId, channelPackageData.androidAppId)
        && Objects.equals(this.packageName, channelPackageData.packageName)
        && Objects.equals(this.packageDownloadUrl, channelPackageData.packageDownloadUrl)
        && Objects.equals(this.channelPackageId, channelPackageData.channelPackageId)
        && Objects.equals(this.versionCode, channelPackageData.versionCode)
        && Objects.equals(this.versionName, channelPackageData.versionName)
        && Objects.equals(this.createdTime, channelPackageData.createdTime)
        && Objects.equals(this.lastModifiedTime, channelPackageData.lastModifiedTime)
        && Objects.equals(this.systemStatus, channelPackageData.systemStatus)
        && Objects.equals(this.auditStatus, channelPackageData.auditStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        androidAppId,
        packageName,
        packageDownloadUrl,
        channelPackageId,
        versionCode,
        versionName,
        createdTime,
        lastModifiedTime,
        systemStatus,
        auditStatus);
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
