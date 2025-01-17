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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.LeadsCallRecordApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.LeadsCallRecordGetRequest;
import com.tencent.ads.model.LeadsCallRecordGetResponse;
import com.tencent.ads.model.LeadsCallRecordGetResponseData;

public class LeadsCallRecordApiContainer extends ApiContainer {

  @Inject LeadsCallRecordApi api;

  /**
   * 获取通话结果
   *
   * @param data (required)
   * @return LeadsCallRecordGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LeadsCallRecordGetResponseData leadsCallRecordGet(LeadsCallRecordGetRequest data)
      throws ApiException, TencentAdsResponseException {
    LeadsCallRecordGetResponse resp = api.leadsCallRecordGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
