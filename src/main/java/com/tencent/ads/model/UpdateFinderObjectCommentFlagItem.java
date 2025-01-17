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

/** 评论精选 */
@ApiModel(description = "评论精选")
public class UpdateFinderObjectCommentFlagItem {
  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("op_type")
  private SetObjectCommentFlagOpType opType = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("comment_id")
  private String commentId = null;

  public UpdateFinderObjectCommentFlagItem adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public UpdateFinderObjectCommentFlagItem opType(SetObjectCommentFlagOpType opType) {
    this.opType = opType;
    return this;
  }

  /**
   * Get opType
   *
   * @return opType
   */
  @ApiModelProperty(value = "")
  public SetObjectCommentFlagOpType getOpType() {
    return opType;
  }

  public void setOpType(SetObjectCommentFlagOpType opType) {
    this.opType = opType;
  }

  public UpdateFinderObjectCommentFlagItem accountId(Long accountId) {
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

  public UpdateFinderObjectCommentFlagItem commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   *
   * @return commentId
   */
  @ApiModelProperty(value = "")
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFinderObjectCommentFlagItem updateFinderObjectCommentFlagItem =
        (UpdateFinderObjectCommentFlagItem) o;
    return Objects.equals(this.adcreativeId, updateFinderObjectCommentFlagItem.adcreativeId)
        && Objects.equals(this.opType, updateFinderObjectCommentFlagItem.opType)
        && Objects.equals(this.accountId, updateFinderObjectCommentFlagItem.accountId)
        && Objects.equals(this.commentId, updateFinderObjectCommentFlagItem.commentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adcreativeId, opType, accountId, commentId);
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
