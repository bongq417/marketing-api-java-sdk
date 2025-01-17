package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.UserActionSetsAddRequest;

public class AddUserActionSets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UserActionSetsAddRequest data = new UserActionSetsAddRequest();
  public String name = "SDK数据源5ede252f5d953";
  public DataSourceType type = DataSourceType.WEB;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setName(name);

    data.setType(type);
  }

  public UserActionSetsAddResponseData addUserActionSets() throws Exception {
    UserActionSetsAddResponseData response = tencentAds.userActionSets().userActionSetsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUserActionSets addUserActionSets = new AddUserActionSets();
      addUserActionSets.init();
      UserActionSetsAddResponseData response = addUserActionSets.addUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
