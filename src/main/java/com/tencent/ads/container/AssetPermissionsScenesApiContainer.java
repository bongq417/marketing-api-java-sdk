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
import com.tencent.ads.api.AssetPermissionsScenesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AssetPermissionsScenesUpdateRequest;
import com.tencent.ads.model.AssetPermissionsScenesUpdateResponse;
import com.tencent.ads.model.AssetPermissionsScenesUpdateResponseData;

public class AssetPermissionsScenesApiContainer extends ApiContainer {

  @Inject AssetPermissionsScenesApi api;

  /**
   * 更新资产授权权限
   *
   * @param data (required)
   * @return AssetPermissionsScenesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AssetPermissionsScenesUpdateResponseData assetPermissionsScenesUpdate(
      AssetPermissionsScenesUpdateRequest data) throws ApiException, TencentAdsResponseException {
    AssetPermissionsScenesUpdateResponse resp = api.assetPermissionsScenesUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
