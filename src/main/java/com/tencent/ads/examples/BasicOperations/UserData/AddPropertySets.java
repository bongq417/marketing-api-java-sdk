package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.PropertySetsAddRequest;

public class AddPropertySets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public PropertySetsAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public PropertySetsAddResponseData addPropertySets() throws Exception {
    PropertySetsAddResponseData response = tencentAds.propertySets().propertySetsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddPropertySets addPropertySets = new AddPropertySets();
      addPropertySets.init();
      PropertySetsAddResponseData response = addPropertySets.addPropertySets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
