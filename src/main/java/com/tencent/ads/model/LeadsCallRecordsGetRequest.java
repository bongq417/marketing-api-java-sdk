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

/** LeadsCallRecordsGetRequest */
public class LeadsCallRecordsGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("search_after")
  private String searchAfter = null;

  public LeadsCallRecordsGetRequest accountId(Long accountId) {
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

  public LeadsCallRecordsGetRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @ApiModelProperty(value = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public LeadsCallRecordsGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @ApiModelProperty(value = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public LeadsCallRecordsGetRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   *
   * @return startDate
   */
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public LeadsCallRecordsGetRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   */
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsCallRecordsGetRequest searchAfter(String searchAfter) {
    this.searchAfter = searchAfter;
    return this;
  }

  /**
   * Get searchAfter
   *
   * @return searchAfter
   */
  @ApiModelProperty(value = "")
  public String getSearchAfter() {
    return searchAfter;
  }

  public void setSearchAfter(String searchAfter) {
    this.searchAfter = searchAfter;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsCallRecordsGetRequest leadsCallRecordsGetRequest = (LeadsCallRecordsGetRequest) o;
    return Objects.equals(this.accountId, leadsCallRecordsGetRequest.accountId)
        && Objects.equals(this.pageSize, leadsCallRecordsGetRequest.pageSize)
        && Objects.equals(this.page, leadsCallRecordsGetRequest.page)
        && Objects.equals(this.startDate, leadsCallRecordsGetRequest.startDate)
        && Objects.equals(this.endDate, leadsCallRecordsGetRequest.endDate)
        && Objects.equals(this.searchAfter, leadsCallRecordsGetRequest.searchAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageSize, page, startDate, endDate, searchAfter);
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
