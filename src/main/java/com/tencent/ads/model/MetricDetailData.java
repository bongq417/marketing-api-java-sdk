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

/** 报表效果数据 */
@ApiModel(description = "报表效果数据")
public class MetricDetailData {
  @SerializedName("cost")
  private Long cost = null;

  @SerializedName("valid_click_count")
  private Long validClickCount = null;

  @SerializedName("ctr")
  private Double ctr = null;

  @SerializedName("exp_pv")
  private Long expPv = null;

  @SerializedName("canvas_cpn_coupons_get_pv")
  private Long canvasCpnCouponsGetPv = null;

  @SerializedName("canvas_cpn_coupons_cost")
  private Long canvasCpnCouponsCost = null;

  @SerializedName("canvas_cpn_coupons_use_pv")
  private Long canvasCpnCouponsUsePv = null;

  @SerializedName("purchase")
  private Long purchase = null;

  @SerializedName("promotion_claim_offer_pv")
  private Long promotionClaimOfferPv = null;

  @SerializedName("page_visit_store_pv")
  private Long pageVisitStorePv = null;

  @SerializedName("weapp_exp_pv")
  private Long weappExpPv = null;

  @SerializedName("promotion_claim_offer_cost")
  private Long promotionClaimOfferCost = null;

  @SerializedName("page_visit_store_amount")
  private Long pageVisitStoreAmount = null;

  @SerializedName("buy_coupons_pv")
  private Long buyCouponsPv = null;

  @SerializedName("buy_coupons_cost")
  private Long buyCouponsCost = null;

  @SerializedName("quest_reservation_uv")
  private Long questReservationUv = null;

  @SerializedName("cvs_exp_pv")
  private Long cvsExpPv = null;

  @SerializedName("cvs_exp_cost")
  private Long cvsExpCost = null;

  @SerializedName("weapp_exp_cost")
  private Long weappExpCost = null;

  @SerializedName("quest_reservation_uv_cost")
  private Long questReservationUvCost = null;

  @SerializedName("reach_store_pay_gmv")
  private Long reachStorePayGmv = null;

  @SerializedName("reach_store_pay_uv")
  private Long reachStorePayUv = null;

  @SerializedName("reach_store_pay_pv")
  private Long reachStorePayPv = null;

  @SerializedName("reach_store_pay_roi")
  private Double reachStorePayRoi = null;

  @SerializedName("clk_pv_avg")
  private Double clkPvAvg = null;

  @SerializedName("reach_store_pay_arpu")
  private Double reachStorePayArpu = null;

  @SerializedName("click_user_count")
  private Long clickUserCount = null;

  public MetricDetailData cost(Long cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   *
   * @return cost
   */
  @ApiModelProperty(value = "")
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }

  public MetricDetailData validClickCount(Long validClickCount) {
    this.validClickCount = validClickCount;
    return this;
  }

  /**
   * Get validClickCount
   *
   * @return validClickCount
   */
  @ApiModelProperty(value = "")
  public Long getValidClickCount() {
    return validClickCount;
  }

  public void setValidClickCount(Long validClickCount) {
    this.validClickCount = validClickCount;
  }

  public MetricDetailData ctr(Double ctr) {
    this.ctr = ctr;
    return this;
  }

  /**
   * Get ctr
   *
   * @return ctr
   */
  @ApiModelProperty(value = "")
  public Double getCtr() {
    return ctr;
  }

  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }

  public MetricDetailData expPv(Long expPv) {
    this.expPv = expPv;
    return this;
  }

  /**
   * Get expPv
   *
   * @return expPv
   */
  @ApiModelProperty(value = "")
  public Long getExpPv() {
    return expPv;
  }

  public void setExpPv(Long expPv) {
    this.expPv = expPv;
  }

  public MetricDetailData canvasCpnCouponsGetPv(Long canvasCpnCouponsGetPv) {
    this.canvasCpnCouponsGetPv = canvasCpnCouponsGetPv;
    return this;
  }

  /**
   * Get canvasCpnCouponsGetPv
   *
   * @return canvasCpnCouponsGetPv
   */
  @ApiModelProperty(value = "")
  public Long getCanvasCpnCouponsGetPv() {
    return canvasCpnCouponsGetPv;
  }

  public void setCanvasCpnCouponsGetPv(Long canvasCpnCouponsGetPv) {
    this.canvasCpnCouponsGetPv = canvasCpnCouponsGetPv;
  }

  public MetricDetailData canvasCpnCouponsCost(Long canvasCpnCouponsCost) {
    this.canvasCpnCouponsCost = canvasCpnCouponsCost;
    return this;
  }

  /**
   * Get canvasCpnCouponsCost
   *
   * @return canvasCpnCouponsCost
   */
  @ApiModelProperty(value = "")
  public Long getCanvasCpnCouponsCost() {
    return canvasCpnCouponsCost;
  }

  public void setCanvasCpnCouponsCost(Long canvasCpnCouponsCost) {
    this.canvasCpnCouponsCost = canvasCpnCouponsCost;
  }

  public MetricDetailData canvasCpnCouponsUsePv(Long canvasCpnCouponsUsePv) {
    this.canvasCpnCouponsUsePv = canvasCpnCouponsUsePv;
    return this;
  }

  /**
   * Get canvasCpnCouponsUsePv
   *
   * @return canvasCpnCouponsUsePv
   */
  @ApiModelProperty(value = "")
  public Long getCanvasCpnCouponsUsePv() {
    return canvasCpnCouponsUsePv;
  }

  public void setCanvasCpnCouponsUsePv(Long canvasCpnCouponsUsePv) {
    this.canvasCpnCouponsUsePv = canvasCpnCouponsUsePv;
  }

  public MetricDetailData purchase(Long purchase) {
    this.purchase = purchase;
    return this;
  }

  /**
   * Get purchase
   *
   * @return purchase
   */
  @ApiModelProperty(value = "")
  public Long getPurchase() {
    return purchase;
  }

  public void setPurchase(Long purchase) {
    this.purchase = purchase;
  }

  public MetricDetailData promotionClaimOfferPv(Long promotionClaimOfferPv) {
    this.promotionClaimOfferPv = promotionClaimOfferPv;
    return this;
  }

  /**
   * Get promotionClaimOfferPv
   *
   * @return promotionClaimOfferPv
   */
  @ApiModelProperty(value = "")
  public Long getPromotionClaimOfferPv() {
    return promotionClaimOfferPv;
  }

  public void setPromotionClaimOfferPv(Long promotionClaimOfferPv) {
    this.promotionClaimOfferPv = promotionClaimOfferPv;
  }

  public MetricDetailData pageVisitStorePv(Long pageVisitStorePv) {
    this.pageVisitStorePv = pageVisitStorePv;
    return this;
  }

  /**
   * Get pageVisitStorePv
   *
   * @return pageVisitStorePv
   */
  @ApiModelProperty(value = "")
  public Long getPageVisitStorePv() {
    return pageVisitStorePv;
  }

  public void setPageVisitStorePv(Long pageVisitStorePv) {
    this.pageVisitStorePv = pageVisitStorePv;
  }

  public MetricDetailData weappExpPv(Long weappExpPv) {
    this.weappExpPv = weappExpPv;
    return this;
  }

  /**
   * Get weappExpPv
   *
   * @return weappExpPv
   */
  @ApiModelProperty(value = "")
  public Long getWeappExpPv() {
    return weappExpPv;
  }

  public void setWeappExpPv(Long weappExpPv) {
    this.weappExpPv = weappExpPv;
  }

  public MetricDetailData promotionClaimOfferCost(Long promotionClaimOfferCost) {
    this.promotionClaimOfferCost = promotionClaimOfferCost;
    return this;
  }

  /**
   * Get promotionClaimOfferCost
   *
   * @return promotionClaimOfferCost
   */
  @ApiModelProperty(value = "")
  public Long getPromotionClaimOfferCost() {
    return promotionClaimOfferCost;
  }

  public void setPromotionClaimOfferCost(Long promotionClaimOfferCost) {
    this.promotionClaimOfferCost = promotionClaimOfferCost;
  }

  public MetricDetailData pageVisitStoreAmount(Long pageVisitStoreAmount) {
    this.pageVisitStoreAmount = pageVisitStoreAmount;
    return this;
  }

  /**
   * Get pageVisitStoreAmount
   *
   * @return pageVisitStoreAmount
   */
  @ApiModelProperty(value = "")
  public Long getPageVisitStoreAmount() {
    return pageVisitStoreAmount;
  }

  public void setPageVisitStoreAmount(Long pageVisitStoreAmount) {
    this.pageVisitStoreAmount = pageVisitStoreAmount;
  }

  public MetricDetailData buyCouponsPv(Long buyCouponsPv) {
    this.buyCouponsPv = buyCouponsPv;
    return this;
  }

  /**
   * Get buyCouponsPv
   *
   * @return buyCouponsPv
   */
  @ApiModelProperty(value = "")
  public Long getBuyCouponsPv() {
    return buyCouponsPv;
  }

  public void setBuyCouponsPv(Long buyCouponsPv) {
    this.buyCouponsPv = buyCouponsPv;
  }

  public MetricDetailData buyCouponsCost(Long buyCouponsCost) {
    this.buyCouponsCost = buyCouponsCost;
    return this;
  }

  /**
   * Get buyCouponsCost
   *
   * @return buyCouponsCost
   */
  @ApiModelProperty(value = "")
  public Long getBuyCouponsCost() {
    return buyCouponsCost;
  }

  public void setBuyCouponsCost(Long buyCouponsCost) {
    this.buyCouponsCost = buyCouponsCost;
  }

  public MetricDetailData questReservationUv(Long questReservationUv) {
    this.questReservationUv = questReservationUv;
    return this;
  }

  /**
   * Get questReservationUv
   *
   * @return questReservationUv
   */
  @ApiModelProperty(value = "")
  public Long getQuestReservationUv() {
    return questReservationUv;
  }

  public void setQuestReservationUv(Long questReservationUv) {
    this.questReservationUv = questReservationUv;
  }

  public MetricDetailData cvsExpPv(Long cvsExpPv) {
    this.cvsExpPv = cvsExpPv;
    return this;
  }

  /**
   * Get cvsExpPv
   *
   * @return cvsExpPv
   */
  @ApiModelProperty(value = "")
  public Long getCvsExpPv() {
    return cvsExpPv;
  }

  public void setCvsExpPv(Long cvsExpPv) {
    this.cvsExpPv = cvsExpPv;
  }

  public MetricDetailData cvsExpCost(Long cvsExpCost) {
    this.cvsExpCost = cvsExpCost;
    return this;
  }

  /**
   * Get cvsExpCost
   *
   * @return cvsExpCost
   */
  @ApiModelProperty(value = "")
  public Long getCvsExpCost() {
    return cvsExpCost;
  }

  public void setCvsExpCost(Long cvsExpCost) {
    this.cvsExpCost = cvsExpCost;
  }

  public MetricDetailData weappExpCost(Long weappExpCost) {
    this.weappExpCost = weappExpCost;
    return this;
  }

  /**
   * Get weappExpCost
   *
   * @return weappExpCost
   */
  @ApiModelProperty(value = "")
  public Long getWeappExpCost() {
    return weappExpCost;
  }

  public void setWeappExpCost(Long weappExpCost) {
    this.weappExpCost = weappExpCost;
  }

  public MetricDetailData questReservationUvCost(Long questReservationUvCost) {
    this.questReservationUvCost = questReservationUvCost;
    return this;
  }

  /**
   * Get questReservationUvCost
   *
   * @return questReservationUvCost
   */
  @ApiModelProperty(value = "")
  public Long getQuestReservationUvCost() {
    return questReservationUvCost;
  }

  public void setQuestReservationUvCost(Long questReservationUvCost) {
    this.questReservationUvCost = questReservationUvCost;
  }

  public MetricDetailData reachStorePayGmv(Long reachStorePayGmv) {
    this.reachStorePayGmv = reachStorePayGmv;
    return this;
  }

  /**
   * Get reachStorePayGmv
   *
   * @return reachStorePayGmv
   */
  @ApiModelProperty(value = "")
  public Long getReachStorePayGmv() {
    return reachStorePayGmv;
  }

  public void setReachStorePayGmv(Long reachStorePayGmv) {
    this.reachStorePayGmv = reachStorePayGmv;
  }

  public MetricDetailData reachStorePayUv(Long reachStorePayUv) {
    this.reachStorePayUv = reachStorePayUv;
    return this;
  }

  /**
   * Get reachStorePayUv
   *
   * @return reachStorePayUv
   */
  @ApiModelProperty(value = "")
  public Long getReachStorePayUv() {
    return reachStorePayUv;
  }

  public void setReachStorePayUv(Long reachStorePayUv) {
    this.reachStorePayUv = reachStorePayUv;
  }

  public MetricDetailData reachStorePayPv(Long reachStorePayPv) {
    this.reachStorePayPv = reachStorePayPv;
    return this;
  }

  /**
   * Get reachStorePayPv
   *
   * @return reachStorePayPv
   */
  @ApiModelProperty(value = "")
  public Long getReachStorePayPv() {
    return reachStorePayPv;
  }

  public void setReachStorePayPv(Long reachStorePayPv) {
    this.reachStorePayPv = reachStorePayPv;
  }

  public MetricDetailData reachStorePayRoi(Double reachStorePayRoi) {
    this.reachStorePayRoi = reachStorePayRoi;
    return this;
  }

  /**
   * Get reachStorePayRoi
   *
   * @return reachStorePayRoi
   */
  @ApiModelProperty(value = "")
  public Double getReachStorePayRoi() {
    return reachStorePayRoi;
  }

  public void setReachStorePayRoi(Double reachStorePayRoi) {
    this.reachStorePayRoi = reachStorePayRoi;
  }

  public MetricDetailData clkPvAvg(Double clkPvAvg) {
    this.clkPvAvg = clkPvAvg;
    return this;
  }

  /**
   * Get clkPvAvg
   *
   * @return clkPvAvg
   */
  @ApiModelProperty(value = "")
  public Double getClkPvAvg() {
    return clkPvAvg;
  }

  public void setClkPvAvg(Double clkPvAvg) {
    this.clkPvAvg = clkPvAvg;
  }

  public MetricDetailData reachStorePayArpu(Double reachStorePayArpu) {
    this.reachStorePayArpu = reachStorePayArpu;
    return this;
  }

  /**
   * Get reachStorePayArpu
   *
   * @return reachStorePayArpu
   */
  @ApiModelProperty(value = "")
  public Double getReachStorePayArpu() {
    return reachStorePayArpu;
  }

  public void setReachStorePayArpu(Double reachStorePayArpu) {
    this.reachStorePayArpu = reachStorePayArpu;
  }

  public MetricDetailData clickUserCount(Long clickUserCount) {
    this.clickUserCount = clickUserCount;
    return this;
  }

  /**
   * Get clickUserCount
   *
   * @return clickUserCount
   */
  @ApiModelProperty(value = "")
  public Long getClickUserCount() {
    return clickUserCount;
  }

  public void setClickUserCount(Long clickUserCount) {
    this.clickUserCount = clickUserCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDetailData metricDetailData = (MetricDetailData) o;
    return Objects.equals(this.cost, metricDetailData.cost)
        && Objects.equals(this.validClickCount, metricDetailData.validClickCount)
        && Objects.equals(this.ctr, metricDetailData.ctr)
        && Objects.equals(this.expPv, metricDetailData.expPv)
        && Objects.equals(this.canvasCpnCouponsGetPv, metricDetailData.canvasCpnCouponsGetPv)
        && Objects.equals(this.canvasCpnCouponsCost, metricDetailData.canvasCpnCouponsCost)
        && Objects.equals(this.canvasCpnCouponsUsePv, metricDetailData.canvasCpnCouponsUsePv)
        && Objects.equals(this.purchase, metricDetailData.purchase)
        && Objects.equals(this.promotionClaimOfferPv, metricDetailData.promotionClaimOfferPv)
        && Objects.equals(this.pageVisitStorePv, metricDetailData.pageVisitStorePv)
        && Objects.equals(this.weappExpPv, metricDetailData.weappExpPv)
        && Objects.equals(this.promotionClaimOfferCost, metricDetailData.promotionClaimOfferCost)
        && Objects.equals(this.pageVisitStoreAmount, metricDetailData.pageVisitStoreAmount)
        && Objects.equals(this.buyCouponsPv, metricDetailData.buyCouponsPv)
        && Objects.equals(this.buyCouponsCost, metricDetailData.buyCouponsCost)
        && Objects.equals(this.questReservationUv, metricDetailData.questReservationUv)
        && Objects.equals(this.cvsExpPv, metricDetailData.cvsExpPv)
        && Objects.equals(this.cvsExpCost, metricDetailData.cvsExpCost)
        && Objects.equals(this.weappExpCost, metricDetailData.weappExpCost)
        && Objects.equals(this.questReservationUvCost, metricDetailData.questReservationUvCost)
        && Objects.equals(this.reachStorePayGmv, metricDetailData.reachStorePayGmv)
        && Objects.equals(this.reachStorePayUv, metricDetailData.reachStorePayUv)
        && Objects.equals(this.reachStorePayPv, metricDetailData.reachStorePayPv)
        && Objects.equals(this.reachStorePayRoi, metricDetailData.reachStorePayRoi)
        && Objects.equals(this.clkPvAvg, metricDetailData.clkPvAvg)
        && Objects.equals(this.reachStorePayArpu, metricDetailData.reachStorePayArpu)
        && Objects.equals(this.clickUserCount, metricDetailData.clickUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cost,
        validClickCount,
        ctr,
        expPv,
        canvasCpnCouponsGetPv,
        canvasCpnCouponsCost,
        canvasCpnCouponsUsePv,
        purchase,
        promotionClaimOfferPv,
        pageVisitStorePv,
        weappExpPv,
        promotionClaimOfferCost,
        pageVisitStoreAmount,
        buyCouponsPv,
        buyCouponsCost,
        questReservationUv,
        cvsExpPv,
        cvsExpCost,
        weappExpCost,
        questReservationUvCost,
        reachStorePayGmv,
        reachStorePayUv,
        reachStorePayPv,
        reachStorePayRoi,
        clkPvAvg,
        reachStorePayArpu,
        clickUserCount);
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
