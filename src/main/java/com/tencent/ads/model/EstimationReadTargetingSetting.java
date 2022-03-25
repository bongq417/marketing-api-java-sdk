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

/** 定向详细设置 */
@ApiModel(description = "定向详细设置")
public class EstimationReadTargetingSetting {
  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("education")
  private List<String> education = null;

  @SerializedName("marital_status")
  private List<String> maritalStatus = null;

  @SerializedName("working_status")
  private List<String> workingStatus = null;

  @SerializedName("geo_location")
  private GeoLocations geoLocation = null;

  @SerializedName("user_os")
  private List<String> userOs = null;

  @SerializedName("new_device")
  private List<String> newDevice = null;

  @SerializedName("device_price")
  private List<String> devicePrice = null;

  @SerializedName("network_type")
  private List<String> networkType = null;

  @SerializedName("network_operator")
  private List<String> networkOperator = null;

  @SerializedName("network_scene")
  private List<String> networkScene = null;

  @SerializedName("app_install_status")
  private List<String> appInstallStatus = null;

  @SerializedName("mini_game_qq_status")
  private List<String> miniGameQqStatus = null;

  @SerializedName("consumption_status")
  private List<String> consumptionStatus = null;

  @SerializedName("game_consumption_level")
  private List<String> gameConsumptionLevel = null;

  @SerializedName("paid_user")
  private List<String> paidUser = null;

  @SerializedName("residential_community_price")
  private List<ResidentialCommunityPriceStruct> residentialCommunityPrice = null;

  @SerializedName("wechat_ad_behavior")
  private LimitWechatAdBehavior wechatAdBehavior = null;

  @SerializedName("custom_audience")
  private List<Long> customAudience = null;

  @SerializedName("excluded_custom_audience")
  private List<Long> excludedCustomAudience = null;

  @SerializedName("deprecated_custom_audience")
  private List<Long> deprecatedCustomAudience = null;

  @SerializedName("deprecated_excluded_custom_audience")
  private List<Long> deprecatedExcludedCustomAudience = null;

  @SerializedName("behavior_or_interest")
  private BehaviorOrInterest behaviorOrInterest = null;

  @SerializedName("air_quality_index")
  private List<String> airQualityIndex = null;

  @SerializedName("wechat_official_account_category")
  private List<Long> wechatOfficialAccountCategory = null;

  @SerializedName("mobile_union_category")
  private List<Long> mobileUnionCategory = null;

  @SerializedName("financial_situation")
  private List<String> financialSituation = null;

  @SerializedName("consumption_type")
  private List<String> consumptionType = null;

  public EstimationReadTargetingSetting age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public EstimationReadTargetingSetting addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  @ApiModelProperty(value = "")
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public EstimationReadTargetingSetting gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public EstimationReadTargetingSetting addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  @ApiModelProperty(value = "")
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public EstimationReadTargetingSetting education(List<String> education) {
    this.education = education;
    return this;
  }

  public EstimationReadTargetingSetting addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  @ApiModelProperty(value = "")
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public EstimationReadTargetingSetting maritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public EstimationReadTargetingSetting addMaritalStatusItem(String maritalStatusItem) {
    if (this.maritalStatus == null) {
      this.maritalStatus = new ArrayList<String>();
    }
    this.maritalStatus.add(maritalStatusItem);
    return this;
  }

  /**
   * Get maritalStatus
   *
   * @return maritalStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public EstimationReadTargetingSetting workingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
    return this;
  }

  public EstimationReadTargetingSetting addWorkingStatusItem(String workingStatusItem) {
    if (this.workingStatus == null) {
      this.workingStatus = new ArrayList<String>();
    }
    this.workingStatus.add(workingStatusItem);
    return this;
  }

  /**
   * Get workingStatus
   *
   * @return workingStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getWorkingStatus() {
    return workingStatus;
  }

  public void setWorkingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
  }

  public EstimationReadTargetingSetting geoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   *
   * @return geoLocation
   */
  @ApiModelProperty(value = "")
  public GeoLocations getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
  }

  public EstimationReadTargetingSetting userOs(List<String> userOs) {
    this.userOs = userOs;
    return this;
  }

  public EstimationReadTargetingSetting addUserOsItem(String userOsItem) {
    if (this.userOs == null) {
      this.userOs = new ArrayList<String>();
    }
    this.userOs.add(userOsItem);
    return this;
  }

  /**
   * Get userOs
   *
   * @return userOs
   */
  @ApiModelProperty(value = "")
  public List<String> getUserOs() {
    return userOs;
  }

  public void setUserOs(List<String> userOs) {
    this.userOs = userOs;
  }

  public EstimationReadTargetingSetting newDevice(List<String> newDevice) {
    this.newDevice = newDevice;
    return this;
  }

  public EstimationReadTargetingSetting addNewDeviceItem(String newDeviceItem) {
    if (this.newDevice == null) {
      this.newDevice = new ArrayList<String>();
    }
    this.newDevice.add(newDeviceItem);
    return this;
  }

  /**
   * Get newDevice
   *
   * @return newDevice
   */
  @ApiModelProperty(value = "")
  public List<String> getNewDevice() {
    return newDevice;
  }

  public void setNewDevice(List<String> newDevice) {
    this.newDevice = newDevice;
  }

  public EstimationReadTargetingSetting devicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public EstimationReadTargetingSetting addDevicePriceItem(String devicePriceItem) {
    if (this.devicePrice == null) {
      this.devicePrice = new ArrayList<String>();
    }
    this.devicePrice.add(devicePriceItem);
    return this;
  }

  /**
   * Get devicePrice
   *
   * @return devicePrice
   */
  @ApiModelProperty(value = "")
  public List<String> getDevicePrice() {
    return devicePrice;
  }

  public void setDevicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
  }

  public EstimationReadTargetingSetting networkType(List<String> networkType) {
    this.networkType = networkType;
    return this;
  }

  public EstimationReadTargetingSetting addNetworkTypeItem(String networkTypeItem) {
    if (this.networkType == null) {
      this.networkType = new ArrayList<String>();
    }
    this.networkType.add(networkTypeItem);
    return this;
  }

  /**
   * Get networkType
   *
   * @return networkType
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkType() {
    return networkType;
  }

  public void setNetworkType(List<String> networkType) {
    this.networkType = networkType;
  }

  public EstimationReadTargetingSetting networkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  public EstimationReadTargetingSetting addNetworkOperatorItem(String networkOperatorItem) {
    if (this.networkOperator == null) {
      this.networkOperator = new ArrayList<String>();
    }
    this.networkOperator.add(networkOperatorItem);
    return this;
  }

  /**
   * Get networkOperator
   *
   * @return networkOperator
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkOperator() {
    return networkOperator;
  }

  public void setNetworkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
  }

  public EstimationReadTargetingSetting networkScene(List<String> networkScene) {
    this.networkScene = networkScene;
    return this;
  }

  public EstimationReadTargetingSetting addNetworkSceneItem(String networkSceneItem) {
    if (this.networkScene == null) {
      this.networkScene = new ArrayList<String>();
    }
    this.networkScene.add(networkSceneItem);
    return this;
  }

  /**
   * Get networkScene
   *
   * @return networkScene
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkScene() {
    return networkScene;
  }

  public void setNetworkScene(List<String> networkScene) {
    this.networkScene = networkScene;
  }

  public EstimationReadTargetingSetting appInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
    return this;
  }

  public EstimationReadTargetingSetting addAppInstallStatusItem(String appInstallStatusItem) {
    if (this.appInstallStatus == null) {
      this.appInstallStatus = new ArrayList<String>();
    }
    this.appInstallStatus.add(appInstallStatusItem);
    return this;
  }

  /**
   * Get appInstallStatus
   *
   * @return appInstallStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getAppInstallStatus() {
    return appInstallStatus;
  }

  public void setAppInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
  }

  public EstimationReadTargetingSetting miniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
    return this;
  }

  public EstimationReadTargetingSetting addMiniGameQqStatusItem(String miniGameQqStatusItem) {
    if (this.miniGameQqStatus == null) {
      this.miniGameQqStatus = new ArrayList<String>();
    }
    this.miniGameQqStatus.add(miniGameQqStatusItem);
    return this;
  }

  /**
   * Get miniGameQqStatus
   *
   * @return miniGameQqStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMiniGameQqStatus() {
    return miniGameQqStatus;
  }

  public void setMiniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
  }

  public EstimationReadTargetingSetting consumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
    return this;
  }

  public EstimationReadTargetingSetting addConsumptionStatusItem(String consumptionStatusItem) {
    if (this.consumptionStatus == null) {
      this.consumptionStatus = new ArrayList<String>();
    }
    this.consumptionStatus.add(consumptionStatusItem);
    return this;
  }

  /**
   * Get consumptionStatus
   *
   * @return consumptionStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionStatus() {
    return consumptionStatus;
  }

  public void setConsumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
  }

  public EstimationReadTargetingSetting gameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
    return this;
  }

  public EstimationReadTargetingSetting addGameConsumptionLevelItem(
      String gameConsumptionLevelItem) {
    if (this.gameConsumptionLevel == null) {
      this.gameConsumptionLevel = new ArrayList<String>();
    }
    this.gameConsumptionLevel.add(gameConsumptionLevelItem);
    return this;
  }

  /**
   * Get gameConsumptionLevel
   *
   * @return gameConsumptionLevel
   */
  @ApiModelProperty(value = "")
  public List<String> getGameConsumptionLevel() {
    return gameConsumptionLevel;
  }

  public void setGameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
  }

  public EstimationReadTargetingSetting paidUser(List<String> paidUser) {
    this.paidUser = paidUser;
    return this;
  }

  public EstimationReadTargetingSetting addPaidUserItem(String paidUserItem) {
    if (this.paidUser == null) {
      this.paidUser = new ArrayList<String>();
    }
    this.paidUser.add(paidUserItem);
    return this;
  }

  /**
   * Get paidUser
   *
   * @return paidUser
   */
  @ApiModelProperty(value = "")
  public List<String> getPaidUser() {
    return paidUser;
  }

  public void setPaidUser(List<String> paidUser) {
    this.paidUser = paidUser;
  }

  public EstimationReadTargetingSetting residentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
    return this;
  }

  public EstimationReadTargetingSetting addResidentialCommunityPriceItem(
      ResidentialCommunityPriceStruct residentialCommunityPriceItem) {
    if (this.residentialCommunityPrice == null) {
      this.residentialCommunityPrice = new ArrayList<ResidentialCommunityPriceStruct>();
    }
    this.residentialCommunityPrice.add(residentialCommunityPriceItem);
    return this;
  }

  /**
   * Get residentialCommunityPrice
   *
   * @return residentialCommunityPrice
   */
  @ApiModelProperty(value = "")
  public List<ResidentialCommunityPriceStruct> getResidentialCommunityPrice() {
    return residentialCommunityPrice;
  }

  public void setResidentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
  }

  public EstimationReadTargetingSetting wechatAdBehavior(LimitWechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
    return this;
  }

  /**
   * Get wechatAdBehavior
   *
   * @return wechatAdBehavior
   */
  @ApiModelProperty(value = "")
  public LimitWechatAdBehavior getWechatAdBehavior() {
    return wechatAdBehavior;
  }

  public void setWechatAdBehavior(LimitWechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
  }

  public EstimationReadTargetingSetting customAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
    return this;
  }

  public EstimationReadTargetingSetting addCustomAudienceItem(Long customAudienceItem) {
    if (this.customAudience == null) {
      this.customAudience = new ArrayList<Long>();
    }
    this.customAudience.add(customAudienceItem);
    return this;
  }

  /**
   * Get customAudience
   *
   * @return customAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getCustomAudience() {
    return customAudience;
  }

  public void setCustomAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
  }

  public EstimationReadTargetingSetting excludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
    return this;
  }

  public EstimationReadTargetingSetting addExcludedCustomAudienceItem(
      Long excludedCustomAudienceItem) {
    if (this.excludedCustomAudience == null) {
      this.excludedCustomAudience = new ArrayList<Long>();
    }
    this.excludedCustomAudience.add(excludedCustomAudienceItem);
    return this;
  }

  /**
   * Get excludedCustomAudience
   *
   * @return excludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludedCustomAudience() {
    return excludedCustomAudience;
  }

  public void setExcludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
  }

  public EstimationReadTargetingSetting deprecatedCustomAudience(
      List<Long> deprecatedCustomAudience) {
    this.deprecatedCustomAudience = deprecatedCustomAudience;
    return this;
  }

  public EstimationReadTargetingSetting addDeprecatedCustomAudienceItem(
      Long deprecatedCustomAudienceItem) {
    if (this.deprecatedCustomAudience == null) {
      this.deprecatedCustomAudience = new ArrayList<Long>();
    }
    this.deprecatedCustomAudience.add(deprecatedCustomAudienceItem);
    return this;
  }

  /**
   * Get deprecatedCustomAudience
   *
   * @return deprecatedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeprecatedCustomAudience() {
    return deprecatedCustomAudience;
  }

  public void setDeprecatedCustomAudience(List<Long> deprecatedCustomAudience) {
    this.deprecatedCustomAudience = deprecatedCustomAudience;
  }

  public EstimationReadTargetingSetting deprecatedExcludedCustomAudience(
      List<Long> deprecatedExcludedCustomAudience) {
    this.deprecatedExcludedCustomAudience = deprecatedExcludedCustomAudience;
    return this;
  }

  public EstimationReadTargetingSetting addDeprecatedExcludedCustomAudienceItem(
      Long deprecatedExcludedCustomAudienceItem) {
    if (this.deprecatedExcludedCustomAudience == null) {
      this.deprecatedExcludedCustomAudience = new ArrayList<Long>();
    }
    this.deprecatedExcludedCustomAudience.add(deprecatedExcludedCustomAudienceItem);
    return this;
  }

  /**
   * Get deprecatedExcludedCustomAudience
   *
   * @return deprecatedExcludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeprecatedExcludedCustomAudience() {
    return deprecatedExcludedCustomAudience;
  }

  public void setDeprecatedExcludedCustomAudience(List<Long> deprecatedExcludedCustomAudience) {
    this.deprecatedExcludedCustomAudience = deprecatedExcludedCustomAudience;
  }

  public EstimationReadTargetingSetting behaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
    return this;
  }

  /**
   * Get behaviorOrInterest
   *
   * @return behaviorOrInterest
   */
  @ApiModelProperty(value = "")
  public BehaviorOrInterest getBehaviorOrInterest() {
    return behaviorOrInterest;
  }

  public void setBehaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
  }

  public EstimationReadTargetingSetting airQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
    return this;
  }

  public EstimationReadTargetingSetting addAirQualityIndexItem(String airQualityIndexItem) {
    if (this.airQualityIndex == null) {
      this.airQualityIndex = new ArrayList<String>();
    }
    this.airQualityIndex.add(airQualityIndexItem);
    return this;
  }

  /**
   * Get airQualityIndex
   *
   * @return airQualityIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getAirQualityIndex() {
    return airQualityIndex;
  }

  public void setAirQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
  }

  public EstimationReadTargetingSetting wechatOfficialAccountCategory(
      List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
    return this;
  }

  public EstimationReadTargetingSetting addWechatOfficialAccountCategoryItem(
      Long wechatOfficialAccountCategoryItem) {
    if (this.wechatOfficialAccountCategory == null) {
      this.wechatOfficialAccountCategory = new ArrayList<Long>();
    }
    this.wechatOfficialAccountCategory.add(wechatOfficialAccountCategoryItem);
    return this;
  }

  /**
   * Get wechatOfficialAccountCategory
   *
   * @return wechatOfficialAccountCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getWechatOfficialAccountCategory() {
    return wechatOfficialAccountCategory;
  }

  public void setWechatOfficialAccountCategory(List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
  }

  public EstimationReadTargetingSetting mobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
    return this;
  }

  public EstimationReadTargetingSetting addMobileUnionCategoryItem(Long mobileUnionCategoryItem) {
    if (this.mobileUnionCategory == null) {
      this.mobileUnionCategory = new ArrayList<Long>();
    }
    this.mobileUnionCategory.add(mobileUnionCategoryItem);
    return this;
  }

  /**
   * Get mobileUnionCategory
   *
   * @return mobileUnionCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getMobileUnionCategory() {
    return mobileUnionCategory;
  }

  public void setMobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
  }

  public EstimationReadTargetingSetting financialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
    return this;
  }

  public EstimationReadTargetingSetting addFinancialSituationItem(String financialSituationItem) {
    if (this.financialSituation == null) {
      this.financialSituation = new ArrayList<String>();
    }
    this.financialSituation.add(financialSituationItem);
    return this;
  }

  /**
   * Get financialSituation
   *
   * @return financialSituation
   */
  @ApiModelProperty(value = "")
  public List<String> getFinancialSituation() {
    return financialSituation;
  }

  public void setFinancialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
  }

  public EstimationReadTargetingSetting consumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
    return this;
  }

  public EstimationReadTargetingSetting addConsumptionTypeItem(String consumptionTypeItem) {
    if (this.consumptionType == null) {
      this.consumptionType = new ArrayList<String>();
    }
    this.consumptionType.add(consumptionTypeItem);
    return this;
  }

  /**
   * Get consumptionType
   *
   * @return consumptionType
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionType() {
    return consumptionType;
  }

  public void setConsumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationReadTargetingSetting estimationReadTargetingSetting =
        (EstimationReadTargetingSetting) o;
    return Objects.equals(this.age, estimationReadTargetingSetting.age)
        && Objects.equals(this.gender, estimationReadTargetingSetting.gender)
        && Objects.equals(this.education, estimationReadTargetingSetting.education)
        && Objects.equals(this.maritalStatus, estimationReadTargetingSetting.maritalStatus)
        && Objects.equals(this.workingStatus, estimationReadTargetingSetting.workingStatus)
        && Objects.equals(this.geoLocation, estimationReadTargetingSetting.geoLocation)
        && Objects.equals(this.userOs, estimationReadTargetingSetting.userOs)
        && Objects.equals(this.newDevice, estimationReadTargetingSetting.newDevice)
        && Objects.equals(this.devicePrice, estimationReadTargetingSetting.devicePrice)
        && Objects.equals(this.networkType, estimationReadTargetingSetting.networkType)
        && Objects.equals(this.networkOperator, estimationReadTargetingSetting.networkOperator)
        && Objects.equals(this.networkScene, estimationReadTargetingSetting.networkScene)
        && Objects.equals(this.appInstallStatus, estimationReadTargetingSetting.appInstallStatus)
        && Objects.equals(this.miniGameQqStatus, estimationReadTargetingSetting.miniGameQqStatus)
        && Objects.equals(this.consumptionStatus, estimationReadTargetingSetting.consumptionStatus)
        && Objects.equals(
            this.gameConsumptionLevel, estimationReadTargetingSetting.gameConsumptionLevel)
        && Objects.equals(this.paidUser, estimationReadTargetingSetting.paidUser)
        && Objects.equals(
            this.residentialCommunityPrice,
            estimationReadTargetingSetting.residentialCommunityPrice)
        && Objects.equals(this.wechatAdBehavior, estimationReadTargetingSetting.wechatAdBehavior)
        && Objects.equals(this.customAudience, estimationReadTargetingSetting.customAudience)
        && Objects.equals(
            this.excludedCustomAudience, estimationReadTargetingSetting.excludedCustomAudience)
        && Objects.equals(
            this.deprecatedCustomAudience, estimationReadTargetingSetting.deprecatedCustomAudience)
        && Objects.equals(
            this.deprecatedExcludedCustomAudience,
            estimationReadTargetingSetting.deprecatedExcludedCustomAudience)
        && Objects.equals(
            this.behaviorOrInterest, estimationReadTargetingSetting.behaviorOrInterest)
        && Objects.equals(this.airQualityIndex, estimationReadTargetingSetting.airQualityIndex)
        && Objects.equals(
            this.wechatOfficialAccountCategory,
            estimationReadTargetingSetting.wechatOfficialAccountCategory)
        && Objects.equals(
            this.mobileUnionCategory, estimationReadTargetingSetting.mobileUnionCategory)
        && Objects.equals(
            this.financialSituation, estimationReadTargetingSetting.financialSituation)
        && Objects.equals(this.consumptionType, estimationReadTargetingSetting.consumptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        age,
        gender,
        education,
        maritalStatus,
        workingStatus,
        geoLocation,
        userOs,
        newDevice,
        devicePrice,
        networkType,
        networkOperator,
        networkScene,
        appInstallStatus,
        miniGameQqStatus,
        consumptionStatus,
        gameConsumptionLevel,
        paidUser,
        residentialCommunityPrice,
        wechatAdBehavior,
        customAudience,
        excludedCustomAudience,
        deprecatedCustomAudience,
        deprecatedExcludedCustomAudience,
        behaviorOrInterest,
        airQualityIndex,
        wechatOfficialAccountCategory,
        mobileUnionCategory,
        financialSituation,
        consumptionType);
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
